
public class InversionContenu {

	public static void main(String[] args) {
		int[] arrayCopy = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int i = arrayCopy.length - 1; i >= 0; i--) {
			System.out.println(arrayCopy[i] + " ");
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j] + " ");
		}
	}

}
