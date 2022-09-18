import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr = new int[]{101,34,21,12,1000};
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      int res=kthmax(arr,k);
      System.out.println(res);
      
  }
  public static int kthmax(int[] arr,int k){
    int t;
  	for(int i=0; i<arr.length-1;i++){
         for(int j=i+1; j<arr.length-1;j++){
              if(arr[i]<arr[j]){
                  t = arr[i];
                  arr[i] = arr[j];
                  arr[j] = t;
              }
         }
  	} 
    int b=0;
    for(int i=0; i<k;i++){
	   if(i==k-1)
			   b = arr[k-1];
	   }
	return b;
  }
 
}
