package com.zoo.safari;

import com.zoo.Zoo;

/**
 * 2024-01-03
 */
public class Safari extends Zoo {

    public static void main(String[] args) {
        // 상속관계여도 메모리에 자식인 Safari를 생성해줘야 기린을 볼 수 있음. (다른패키지에 있지만 자식클래스라 접근 가능)
        // new Zoo()를 해버리면 부모 클래스만 힙 메모리에 잡히므로, 지금 다른패키지인 이 main에서는 사용할 수 없음!!!
        Safari safari = new Safari();
        safari.tiger();
        safari.giraffe();
//        safari.elephant();
//        safari.lion();
    }
}
