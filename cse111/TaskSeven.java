//task 09
import java.util.Scanner;
 public class TaskSeven{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array");
   int Z = sc.nextInt();
   int[]arr= new int[Z];
     int[]uArr= new int[Z];
         
 int v= 0;

 
 while (v<Z){
   System.out.println("Enter a number");
         arr [v]= sc.nextInt();
         
          
v ++; }
 System.out.println("Original Array");
 
 for(int m= 0; m<Z; m++){
   System.out.print(arr[m]+ " ");}  
 System.out.println();
 for(int k= 0; k<Z-1; k++){
int mxin = k;
 
      for(int i = k+1; i<Z; i++){
        
    if (arr[i]>arr[mxin]){
    mxin = i;
    }
    }
    if (mxin!= k){
    arr[k]=arr[k]+arr[mxin];
      arr[mxin]=arr[k]-arr[mxin];
      arr[k]= arr[k]-arr[mxin];
   
    }}
  System.out.println("Sorted Array");
   for(int j = 0; j<Z; j++){
     
     System.out.print(arr[j]+" ");
   }}}
   


