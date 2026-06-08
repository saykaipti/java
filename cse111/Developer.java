public class Developer extends Employee{
public String l;
public Developer(String n,double bs,int h,String b){
  super(n,bs,h);
  l=b;
}
public void calculateSalary(){
  double c = getBaseSalary();
  if(l.equals("Java")){
    c+=700;
  }
  System.out.println("Final Salary : $"+ c);
  }
 public void displayInfo(){
   super.displayInfo();
 System.out.println ("Language: "+ l );
calculateSalary();
 }
}