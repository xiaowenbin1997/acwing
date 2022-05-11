package acwingEveryday;

import java.util.ArrayList;
import java.util.List;

public class Ac25 {
    public int maxProductAfterCutting(int length) {
        int multi = 1;
        int rest = length % 3;
        if (length == 2)    return 1;
        if (length == 3)    return 2;
        if (rest == 1) {
            multi = multi * 2 * 2;
            length -= 4;
        } else if (rest == 2) {
            multi *= 2;
            length -= 2;
        }
        int count = length / 3;
        for (int i = 0;i < count;i++) {
            multi = multi * 3;
        }
        return multi;
    }


    public static void main(String[] args) {
        Ac25 ac25 = new Ac25();
        System.out.println(ac25.maxProductAfterCutting(8));
    }
}
