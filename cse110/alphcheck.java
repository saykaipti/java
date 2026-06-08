
//task 02
import java.util.Scanner; 
public class alphcheck {
public static void main (String []args){
Scanner sc = new Scanner(System.in) ;
String N = sc.next();
for(int k=0;k<N.length();k++){
  char LT = N.charAt(k);
if (LT== 'a'){
System.out.println('z');
}
else {
System.out.print((char)(LT-1));
}}
}}
      
