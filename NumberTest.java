class NumberTest {
	public static void main(String[] args) {
		System.out.println("25 + 3 = " + (25+3));
		System.out.println("25 - 3 = " + (25-3));
		System.out.println("25 * 3 = " + (25*3));
		System.out.println("25 / 3 = " + (25/3));
		System.out.println("25.0 / 3 = " + (25.0/3)); // ǥ���Ҽ�������ŭ ����.
		System.out.printf("%d / %d = %.2f\n", 25, 3, (25.0/3));
		System.out.printf("25 / 3 = %.2f\n", (25.0/3));

		System.out.println("25 / 3 = " + String.format("%.2f", 25.0/3)); // format()�� �� ���� ��.

		System.out.println("25 % 3 = " + (25%3));
	}
}