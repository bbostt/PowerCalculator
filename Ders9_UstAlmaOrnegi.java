import java.util.Scanner;

public class Ders9_UstAlmaOrnegi {

	static int ustAlma(int base, int power) {

		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result * base;

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Base giriniz : ");
		int base = input.nextInt();

		System.out.print("Power giriniz : ");
		int power = input.nextInt();
		int sonuc = ustAlma(base, power);
		System.out.println(sonuc);
		

	}

}
