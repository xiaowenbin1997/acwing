package xingyeshujin;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Post {
    int tweetId;
    long time;

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Post(int tweetId, long time) {
        this.tweetId = tweetId;
        this.time = time;
    }
}

//兴业数金答题
public class T1 {
    //键是userid，值是发博list
    static Map<Integer, ArrayList<Post>> idWeiboList = new HashMap<>();
    //键存自己id，值存关注博主的set
    static Map<Integer, Set<Integer>> me2BoZhu = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opNum = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (opNum-- > 0) {
            String opStr = br.readLine();
            String[] nums = br.readLine().split(" ");
            if ("postWeibo".equals(opStr)) {
                int userId = Integer.parseInt(nums[0]);
                int tweetId = Integer.parseInt(nums[1]);
                postWeibo(userId, tweetId);
                stringBuilder.append("null, ");
            } else if ("getNewsFeed".equals(opStr)) {
                int userId = Integer.parseInt(nums[0]);
                List newsFeed = getNewsFeed(userId);
                stringBuilder.append(newsFeed);
                stringBuilder.append(", ");
            } else if ("follow".equals(opStr)) {
                int followerId = Integer.parseInt(nums[0]);
                int followeeId = Integer.parseInt(nums[1]);
                follow(followerId, followeeId);
                stringBuilder.append("null, ");
            } else if ("unfollow".equals(opStr)) {
                int followerId = Integer.parseInt(nums[0]);
                int followeeId = Integer.parseInt(nums[1]);
                unfollow(followerId, followeeId);
                stringBuilder.append("null, ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    //相当于只发到自己的list
    static void postWeibo(int userId, int tweetId) {
        ArrayList<Post> postList = idWeiboList.get(userId);
        if (postList == null) {
            postList = new ArrayList<>();
        }
        postList.add(new Post(tweetId, System.currentTimeMillis()));
        idWeiboList.put(userId, postList);
    }

    //在这里取自己和关注博主的前十条
    static List getNewsFeed(int userId) {
        ArrayList<Post> tempPost = new ArrayList<>();
        Set<Integer> followeeSet = me2BoZhu.get(userId);
        if (followeeSet != null && followeeSet.size() > 0) {
            for (Integer followeeId : followeeSet) {
                tempPost.addAll(idWeiboList.get(followeeId));
            }
        }
        tempPost.addAll(idWeiboList.get(userId));
        List<Integer> resultTweetId = tempPost.stream().sorted(((o1, o2) -> {
            return (int) (o2.getTime() - o1.getTime());
        })).limit(10).map(m -> {
            return m.getTweetId();
        }).collect(Collectors.toList());
        return resultTweetId;
    }

    static void follow(int followerId, int followeeId) {
        Set<Integer> floweeSet = me2BoZhu.get(followerId);
        if (floweeSet == null) {
            floweeSet = new HashSet<>();
        }
        floweeSet.add(followeeId);
        me2BoZhu.put(followerId,floweeSet);
    }

    static void unfollow(int followerId, int followeeId) {
        Set<Integer> floweeSet = me2BoZhu.get(followerId);
        if (floweeSet == null) {
            floweeSet = new HashSet<>();
        }
        floweeSet.remove(followeeId);
        me2BoZhu.put(followerId,floweeSet);
    }
}
