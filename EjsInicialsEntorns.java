import java.util.Scanner;

public class Salari_numdellista {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix el teu nom: ");
		String nom = scanner.nextLine();
		System.out.println("Introdueix el teu salari: ");
		double salari = scanner.nextDouble();
		System.out.println("Introdueix la teva edat: ");
		int edat = scanner.nextInt();
		if (edat < 16) {
			System.out.println(nom + ", no tens edat per treballar.");
		} else if (edat >= 19 && edat <= 50) {
			salari *= 1.05;
			System.out.println(nom + ", la teva edat és " + edat + " i el teu salari augmentat és " + salari + ".");
		} else if (edat >= 51 && edat <= 60) {
			salari *= 1.10;
			System.out.println(nom + ", la teva edat és " + edat + " i el teu salari augmentat és " + salari + ".");
		} else {
			salari *= 1.15;
			System.out.println(nom + ", la teva edat és " + edat + " i el teu salari augmentat és " + salari + ".");
		}
	}
}