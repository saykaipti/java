import java.util.Arrays;
public class BusTester{
  public static void main(String[] args){
    Bus b1 = new Bus(6); //Bus can hold 6 people
    b1.setLicense("A132");
    System.out.println(b1.getLicense()); //A132
    b1.addPassengers("A");
    b1.addPassengers("B","C","D");
    Bus b2 = new Bus(3);
    System.out.println(Bus.pCount); //4
    b2.addPassengers("F");
    System.out.println(Bus.pCount); //5    
//    System.out.println(Arrays.toString(Bus.plist)); // A, B, C, D, F
    Bus.showPassengers(); //A, B, C, D, F
  }
}

class Bus{
  //static 
  public static int pCount;
  static String [] plist = new String[10];
  //instance variable
  int cap;
  private String license;
  
  
  public String getLicense(){
    return license;
  }
  
  public void setLicense(String l){
    license = l;
  }
  
  public void addPassengers(String x){
    if(cap > 0){
      plist[pCount] = x;
      pCount++;
    }
  }
  
  public void addPassengers(String x, String y, String z){
    addPassengers(x);
    addPassengers(y);
    addPassengers(z);
  }
  public Bus(int cap){
    this.cap = cap;
    System.out.println("Bus can hold " + cap + " people");
  }
  
  public static void showPassengers(){
    for(int i = 0; i < pCount; i++){
      System.out.print(plist[i] + ", "); 
    }
  }
}
