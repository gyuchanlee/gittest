class HelloTest {
	public static void main(String[] args) {
		System.out.print("안녕하세요!!!\n");
		System.out.println("반갑습니다!!!");
		System.out.println("사과\t딸기\t복숭아");
		System.out.println("2+3");
		System.out.println("2"+"3"); // 문자열에서의 +는 결합을 의미함.
		System.out.println('2'+'3');
		System.out.println(2+3);
		System.out.println("2 + 3 = "+2+3); // 문자열 + 숫자는 -> 문자열. (문자열이 우선권을 가짐)
		System.out.println("2 + 3 = "+(2+3)); // ()로 우선권을 지정.
		System.out.println(1+2+" = 3"); // 1+2는 숫자이므로 3이되고 그후에 문자열과 더해짐.
	}
}