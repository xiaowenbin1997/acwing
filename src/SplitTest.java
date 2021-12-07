public class SplitTest {
    public static void main(String[] args) {
        String str = "[84,76]";
        for (String temp : str.split("\\[|\\]|,")) {
            System.out.println(temp);
        }
    }
}
