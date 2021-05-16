import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. Kenarı giriniz: ");
		int kenar1 = input.nextInt();
		System.out.print("2. Kenarı giriniz: ");
		int kenar2 = input.nextInt();
		System.out.print("3. Kenarı giriniz: ");
		int kenar3 = input.nextInt();
		int cevre = kenar1+kenar2+kenar3;
		double u = cevre/2;
		double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		System.out.println("Alan: "+alan);
	}
}