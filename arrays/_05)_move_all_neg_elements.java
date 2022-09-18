import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = new int[]{1,-2,34,-12,-22};
      neg(arr);
      for (int i=0;i<arr.length ;i++ ){ 
      System.out.println(arr[i]);
      } 
    }
    public static int[] neg(int[]arr){
      //negitive values to one Side 
      int low=0,temp;
      for(int i=0 ;i<arr.length;i++){
        if(arr[i]<0){
          if(i!=low){
            temp=arr[i];
            arr[i]=arr[low];
            arr[low]=temp;
          }
          low++;
        }
      }
      return arr;
    }
}
