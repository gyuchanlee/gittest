package array;

/**
 * 2023-12-26
 */
public class Array02 {

    public static void main(String[] args) {
        // JVM은 실행시 main메서드를 가장 먼저 찾고 그 이후로 메서드 실행.
        // run -> Edit configuration에서 program argument 설정.


        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
            System.out.println("문자열의 크기 = " + args[i].length());
            System.out.println("첫번째 문자 = " + args[i].charAt(0));
            System.out.println("마지막 문자 = " + args[i].charAt(args[i].length() - 1));
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (String data : args) {
            System.out.println(data);
            System.out.println("문자열의 크기 = " + data.length());
            System.out.println("첫번째 문자 = " + data.charAt(0));
            System.out.println("마지막 문자 = " + data.charAt(data.length()-1));
            System.out.println();
        }

        /**
         * 문자열
         * length() : 길이
         * charAt(idx) : idx에 해당하는 문자 char형으로 반환
         * - 문자열의 인덱스는 0부터 시작.
         */
    }
}
