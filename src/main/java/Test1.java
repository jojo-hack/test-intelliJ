public class Test1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println();
		System.out.println(getSum(1, 2, 3));
	}

	private static int getSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}