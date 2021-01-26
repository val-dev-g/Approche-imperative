public class FirstLast {
	public static void main(String[] args) {

		int[] array1 = { 6, 15, -1, 17, 2, 3, 0, 14, 6 };
		boolean verif = true;

		if (array1.length >= 1 && (array1[0] == array1[array1.length - 1])) {
			verif = true;
		} else {
			verif = false;
		}

		System.out.println(verif);
	}
}