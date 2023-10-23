import java.util.*;

public class java11 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print("before shuffing: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
		Random randInt = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = randInt.nextInt(arr.length); // generating random index
            // swapping element at current index with element at random index
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
        System.out.print("\nafter shuffing: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
