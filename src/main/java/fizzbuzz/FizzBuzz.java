package fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			String out = "";
			out = fizzbuzz(i, out);
			System.out.println(i + ":" + out);
		}
	}

	public static String fizzbuzz(int i, String out) {
		if (i % 3 == 0) {
			out += "fizz";
		}
		if (i % 5 == 0) {
			out += "buzz";
		}
		if (i % 5 != 0 && i % 3 != 0) {
			out += i;
		}
		return out;
	}
}