public class SommeDeTableauxDiff {
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayTwo = {-1, 12, 17, 14, 5, -9, 0, 18 };
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
