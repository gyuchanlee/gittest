package note;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("123213232432432142143");
        BigDecimal b = new BigDecimal("1242142134325435354243");
        BigDecimal add = a.add(b);
        System.out.println(add);
        String string = String.valueOf(add);
        System.out.println(string);


    }

}