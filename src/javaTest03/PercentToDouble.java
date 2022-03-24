package javaTest03;

import java.text.NumberFormat;
import java.text.ParseException;

public class PercentToDouble {
    public static void main(String[] args) throws ParseException {
        String percent01 = "1.22%";
        String percent02 = "44%";
        String percent03 = "0.00001%";
        Double num1 = (Double) NumberFormat.getPercentInstance().parse(percent01);
        System.out.println(num1);
    }
}
