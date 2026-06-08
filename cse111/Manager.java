//task 05
public class Manager extends Employee{
public double bp;
public Manager(String n,double bs,int h,double b){
  super(n,bs,h);
  bp=b;
}
public void calculateSalary(){
  if(getHoursWorked()>40){
  double a = getBaseSalary()*(1+ bp/100);
  System.out.println("Final Salary : $"+ a);
  }}
public void requestIncrement(double a){
  if (getHoursWorked()>100){
    setBaseSalary(getBaseSalary()+ a);
System.out.println("$"+(int)a +" Increment approved.");
  }
  else if (getHoursWorked()>80){
setBaseSalary(getBaseSalary()+ a/2);
System.out.println("$"+(int)a/2 +" Increment approved.");
  }
  else{
  System.out.println("Increment denied.");
  }}
 public void displayInfo(){
   super.displayInfo();
 System.out.println ("Bonus: "+ bp + " %");
calculateSalary();
 }
}