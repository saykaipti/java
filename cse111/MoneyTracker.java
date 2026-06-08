//Task 04
public class MoneyTracker {
public String nm;
public double b_status;
public double l_in;
public double l_ex;
public boolean tr;
public MoneyTracker(){
this.nm= null;
this.b_status =0.0;
this.l_in =0.0;
this.l_ex=0.0;
this.tr=false;
System.out.println("A new money tracker has been launched.") ;
}
public void createTracker(String a){
this.nm= a;
this.b_status =1.0;
this.tr=true;
}
public void income(double w){
  this.b_status += w;
  this.l_in = w;
System.out.println ("Balance Updated!");
}
public void expense(double v){
  if(b_status<=0){
  System.out.println("You're broke!");
 
  this.b_status= 0;
  return;
  }
 else if (v>b_status){
 System.out.println("Not enough balance.");
 return;
 }else {
 this.b_status-= v;
 this.l_ex= v;
System.out.println ("Balance Updated.");
 }}
public String info(){
return "Name: "+ nm+ "\nCurrent Balance: "+b_status;
}
public void showHistory(){
System.out.println ("Last added: "+ l_in);
System.out.println ("Last spent: "+ l_ex);
}}

