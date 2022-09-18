import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr = new int[]{101,34,21,1,1000};
      int x=max(arr);
      int y=min(arr);
      System.out.println(x);
      System.out.println(y);
  }
  public static int max(int[] arr){
    int high=arr[0];
    for (int i=0;i<arr.length ;i++ ){
      if(arr[i]>high){
        high=arr[i];
        }
      }
      return high;
    }
    public static int min(int [] arr){
      int low=arr[0];
      for (int i=0;i<arr.length ;i++ ){
      if(arr[i]<=low){
        low=arr[i];
        }
      }
      return low;
    }
}
