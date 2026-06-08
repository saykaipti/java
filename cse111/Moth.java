public class Moth extends Caterpillar {
  public Moth(String a,int b){
    super (a,b);
  }
  public void transform(){
    System.out.println("Caterpillar transforms into Moth");
  }
  public void eat(int c){
 energy -=2.5;
 energy += (2.5*c);
 System.out.println("Moth lost energy due to nocturnal activity");
  }
  public void showDetails(){
 System.out.println ("Food: "+ food);
 System.out.println( "Age: " + age);
 System.out.println( "Energy " + energy + " Joules");
 }
}
    