//Task 01 
public class Toy{
  String name;
  int price ;
  public Toy(String T_name, int T_price){
 name = T_name;
 price = T_price;
System.out.println("A new toy has been made!");
 }
  public void updatePrice(int T_price2){
 price =  T_price2;
 }
  public void showPrice(){
    System.out.println("Price :" + price+ "taka");
  }
  public void updateName(String T_name2){
  System.out.println("Changing old name : " + name);
  name = T_name2;
  System.out.println("New name : "+ name );
  }
}

 
 