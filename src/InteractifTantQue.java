import java.util.Scanner;
public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Veuillez saisir un nombre :" );
		int nb = scanner.nextInt();
		
		while(nb < 1 || nb > 10) {
			System.out.println("Veuillez saisir un nombre entre 1 et 10 :" );
			nb = scanner.nextInt();
		}
		System.out.println("Vous avez �crit le chiffre : " + nb );
	}
}
