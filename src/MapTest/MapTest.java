package MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
//        newMap();
//        mapByList();
        mapEnhance();
    }

    //演示newMap，说明初始化map一定会初始化成2的幂次，顺便说明同一个hash同一个值，value会更新
    public static void newMap() {
        HashMap<Integer,String> test01 = new HashMap<>(11);
        HashMap<Integer,String> test02 = new HashMap<>(27);
        HashMap<Integer,String> test03 = new HashMap<>(49);
        test01.put(1,"1");
        test01.put(1,"one");
    }
    //演示链表，说明一定条件下，HashMap的底层由数组加链表实现
    public static void mapByList() {
        HashMap<Integer,String> temp = new HashMap<>();
        temp.put(1,"one");
        temp.put(17,"two");
        String s = temp.get(17);
    }
    //演示resize，演示当数组的一个位置有长度为8的链表时，进行扩容操作，扩容的目的是将数组翻倍，然后把原本在数组【1】位置的链表
    //一分为二，再放到数组【1 + 16】的位置上去
    public static void mapEnhance() {
        HashMap<Integer,String> temp = new HashMap<>();
        temp.put(1,"one");
        temp.put(17,"two");
        temp.put(33,"three");
        temp.put(49,"four");
        temp.put(65,"five");
        temp.put(81,"six");
        temp.put(97,"seven");
        temp.put(113,"eight");
        temp.put(129,"nine");
        temp.put(147,"ten");
    }

//    //展示链表转为红黑树
//    public static void mapTest02() {
//        HashMap<Integer,String> temp = new HashMap<>();
//        for (int i = 0; i < 8; i++) {
//            temp.put(1 + i,"one");
//            temp.put(17 + i,"two");
//            temp.put(33 + i,"three");
//            temp.put(49 + i,"four");
//            temp.put(65 + i,"five");
//            temp.put(81 + i,"six");
//            temp.put(97 + i,"seven");
//            temp.put(113 + i,"eight");
//        }
//        temp.put(129,"nine");
//    }
}
