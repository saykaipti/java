public class HumanTester{
  public static void main(String[] args){
    Human h1 = new Human();
    System.out.println(h1.name);
    System.out.println(h1.age);
    System.out.println(h1.id);
//    System.out.println(h1.balance);
// h1.balance = 100;
    h1.setMethod(668.0);
    h1.id = 8;
    h1.showInfo(); 
  }
}