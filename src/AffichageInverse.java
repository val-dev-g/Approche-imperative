public class AffichageInverse {

 public static void main(String[] args) {
  int[] array ={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
  int[] destination = new int[array.length];
  
   System.out.print("array ordre normal :");

  for(int i = 0; i < array.length; i++)
  {
   System.out.print(array[i]+" ");
  }
  
   System.out.print("\n array ordre inverse :");
  
  for (int i = array.length -1; i >= 0; i--) {
   System.out.print(array[i]+" ");
  }
  System.out.println();
  for (int i = 0; i < array.length; i++) {
	  destination[i] = array[i];
	  System.out.print(" " + destination[i]);
  }

 }
}