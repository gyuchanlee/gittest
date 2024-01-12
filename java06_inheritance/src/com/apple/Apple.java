package com.apple;

import com.zoo.Zoo;

/**
 * 2024-01-03
 */
public class Apple {

    public static void main(String[] args) {
        /**
         * 접근 제한자 : public > protected > default > private(캡슐화에 사용, 정보은닉)
         */

        System.out.println("빨간 사과");

        Zoo zoo = new Zoo();
        // public 메서드 호출
        zoo.tiger();
//        zoo.giraffe();
//        zoo.elephant();
//        zoo.lion();



    }
}
