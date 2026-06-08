//task 03
import java.util.Scanner; 
public class repeatednum {
public static void main (String []args){
Scanner sc = new Scanner(System.in) ;
int N1 = sc.nextInt();
int[]arr = new int[N1];
for(int i = 0;i<N1; i++){
  arr[i] =sc.nextInt();
}
for(int j =0;j<N1; j++){
int k= 0;
for( k=0;k<j;k++){
if (arr[j] ==arr[k]){
  break;
  }}
if(j==k){
  int ct =0;
for(int m =0;m<N1;m++){
  if(arr[j] ==arr[m]){
    ct++;
  }}
System.out.println(arr[j] + " - " + ct+ " times");
}}}}