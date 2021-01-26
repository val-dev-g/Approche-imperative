
public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 3) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.print("\n");

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				System.out.print(array[j] + ", ");
			}
		}
		System.out.print("\n");

		for (int y = 0; y < array.length; y++) {
			if (y % 2 == 0) {
				System.out.print(array[y] + ", ");
			}
		}
		System.out.print("\n");

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 != 0) {
				System.out.print(array[j] + ", ");
			}
		}
		System.out.print("\n");

	}
}
