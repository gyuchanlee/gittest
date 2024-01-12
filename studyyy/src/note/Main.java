package note;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String string = "1 3 Z 4";
        String[] split = string.split(" ");

        ArrayList<String> plus = new ArrayList<>();
        ArrayList<String> min = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("Z")) {
                plus.add(split[i]);
            } else {
                min.add(split[i - 1]);
            }
        }
        int plusSum = 0;
        int minSum = 0;
        for (int i = 0; i < plus.size(); i++) {
            plusSum += Integer.parseInt(plus.get(i));
        }
        for (int i = 0; i < min.size(); i++) {
            minSum += Integer.parseInt(min.get(i));
        }

//        return plusSum = minSum;


    }

}