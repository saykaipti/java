//task 04
public class MobilePhone {
int A ;
int ct;
String [] names;
int[] nums ;
public void setContactCapacity (int x){
A = x;
names = new String[x];
nums = new int [x];
}
public void addContact( String N , int C){
  if ( ct < A){
 names[ct] = N;
 nums[ct] = C;
 ct++;
System.out.println ("The contact of " +N + " is added.");
  }
  else{
System.out.println("Storage Full!!");
  }}
public void makeCall(int P){
 boolean value = false;
 for (int i = 0; i < ct; i++){
   if (nums[i] == P ){
System.out.println("Calling "+names[i]+" . . .");
value = true;
  break;
   }}
 if (value == false){
System.out.println("Calling " + P+ " . . .");
 }}
public void details(){
System.out.println ("Total Contacts: " + ct);
System.out.println ("Contact List:");
 for (int i = 0; i < ct; i++){
   System.out.println (names[i]+ ":" + nums[i])  ;
 }}}

                