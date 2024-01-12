class NumberTest {
	public static void main(String[] args) {
		System.out.println("25 + 3 = " + (25+3));
		System.out.println("25 - 3 = " + (25-3));
		System.out.println("25 * 3 = " + (25*3));
		System.out.println("25 / 3 = " + (25/3));
		System.out.println("25.0 / 3 = " + (25.0/3)); // 표현할수있을만큼 나눔.
		System.out.printf("%d / %d = %.2f\n", 25, 3, (25.0/3));
		System.out.printf("25 / 3 = %.2f\n", (25.0/3));

		System.out.println("25 / 3 = " + String.format("%.2f", 25.0/3)); // format()을 더 자주 씀.

		System.out.println("25 % 3 = " + (25%3));
	}
}