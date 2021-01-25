public class AffichageInverse {

 public static void main(String[] args) {
  int[] array ={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
  int[] destination = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
  
   System.out.print("array ordre normal :");

  for(int i = 0; i < array.length; i++)
  {
   System.out.print(array[i]+" ");
  }
  
   System.out.print("\n array ordre inverse :");
  
  for (int i = array.length -1; i >= 0; i--) {
   System.out.print(array[i]+" ");
  }
  
  for (int n : destination) {
      System.out.print(n + " ");
  }
  System.out.print("copy Array");
  System.arraycopy(array, 1, destination, 2, 6);
 }
}