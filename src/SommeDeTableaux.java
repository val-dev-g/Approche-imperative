
public class SommeDeTableaux {
	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayTwo = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
		int somme = 0;

		for (int i : array) {
			somme = somme + i;
		}

		for (int i : arrayTwo) {
			somme = somme + i;
		}
		System.out.println("La somme des éléments du tableau est : " + somme);
	}

}