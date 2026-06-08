//task 01 
import java.util.Scanner; 
public class findingprimenum {
public static void main (String []args){
Scanner sc = new Scanner(System.in) ;
int N1 = sc.nextInt();
int N2 = sc.nextInt();
int a = 0 ;
if(N1<N2){
for(int i = N1;i<=N2; i++){
if (i>1)    {
    int div = 0 ;
    for(int j=2;j<i;j++) {
      if (i%j==0){
        div++;
      }}
    if (div ==0){
      a++;
    }}}
System.out.println("There are " + a + " prime number between " + N1 + " and " + N2 + ".");
}
else {
  for(int i = N2;i<=N1;i++){
if (i>1)    {
    int div = 0 ;
    for(int j=2;j<i;j++) {
      if (i%j==0){
        div++;
      }}
    if (div ==0){
      a++;
    }}}
System.out.println("There are " + a + " prime number between " + N2 + " and " + N1 + ".");
}}
}
  