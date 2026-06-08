public class SPTester{
  public static void main(String[] args){
     System.out.println(Smartphone.count);
    Smartphone sp1 = new Smartphone("apple ip16", 12000);
    System.out.println(Smartphone.count);
    Smartphone sp2 = new Smartphone("apple ip17", 14000);
    Smartphone sp3 = new Smartphone("apple ip15", 10000);
   System.out.println(Smartphone.count);
  System.out.println(Smartphone.objects[0].name);
    
  }
} class Smartphone{
  
  //static variable
  public static int count = 0;
  public static Smartphone[] objects = new Smartphone[100];
  
  public int price;
  public String name;
 //public int count = 100;
  
  public Smartphone(String name, int price){
    this.name = name;
    this.price = price;
   int count = -9;
  Smartphone.objects[Smartphone.count++] = this;
    System.out.println("count: " + ++count);
   this.name = "abc";
  }
  
}