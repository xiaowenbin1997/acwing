import java.util.*;

/**
 * 给定 N 个三元组 (x,y,z)，其中 x 是整数，y 是浮点数，z 是字符串。
 *
 * 请你按照 x 从小到大的顺序将这些三元组打印出来。
 *
 * 数据保证不同三元组的 x 值互不相同。
 *
 * 输入格式
 * 第一行包含整数 N。
 *
 * 接下来 N 行，每行包含一个整数 x，一个浮点数 y，一个字符串 z，表示一个三元组，三者之间用空格隔开。
 *
 * 输出格式
 * 共 N 行，按照 x 从小到大的顺序，每行输出一个三元组。
 *
 * 注意，所有输入和输出的浮点数 y 均保留两位小数。
 *
 * 数据范围
 * 1≤N≤10000,
 * 1≤x,y≤105,
 * 字符串总长度不超过 105。
 *
 * 输入样例：
 * 5
 * 32 1.36 nsyiupnnhc
 * 18 4.53 fmofzwrah
 * 33 4.86 wzuymbm
 * 1 3.93 gtnrwcebt
 * 31 4.53 gcllxioc
 * 输出样例：
 * 1 3.93 gtnrwcebt
 * 18 4.53 fmofzwrah
 * 31 4.53 gcllxioc
 * 32 1.36 nsyiupnnhc
 * 33 4.86 wzuymbm
 */
class GroupThree {
    int x;
    double y;
    String z;

    public GroupThree(int x, double y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getZ() {
        return z;
    }
}

public class t862 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<GroupThree> oneList = new ArrayList<>();
        for (int i = 0;i < len;i++) {
            int x = scanner.nextInt();
            double y = scanner.nextDouble();
            String z = scanner.next();
            GroupThree groupThree = new GroupThree(x,y,z);
            oneList.add(groupThree);
        }
        Collections.sort(oneList,new Comparator<GroupThree>(){
            @Override
            public int compare(GroupThree o1, GroupThree o2) {
                return o1.x - o2.x;
            }
        });
        for (GroupThree groupThree : oneList) {
            System.out.println(groupThree.getX() + " " + String.format("%.2f",groupThree.getY()) + " " + groupThree.getZ());
        }
    }
}
