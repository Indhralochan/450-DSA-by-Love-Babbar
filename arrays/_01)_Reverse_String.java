import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr = new int[]{1,2,3,4,5};
      reverse(arr);
      for (int i=0;i<arr.length ;i++ ){
        System.out.println(arr[i]);
      } 
  }
  public static int[] reverse(int[] arr){
    int low=0;
    int high=arr.length-1;
    int temp;
    while(low<high){
      temp=arr[low];
      arr[low]=arr[high];
      arr[high]=temp;
      low++;
      high--;
    }
    return arr;
  }
}
