public class Spaceship{
  public String nm;
  public int cap;
  public Cargo[] A = new Cargo[100];
  public int ct;
  public int tw;
  public Spaceship(String n , int c){
    this.nm = n ;
    cap = c ;
  }
  public void loadCargo(Cargo X){
    int ojon= tw+ X.getw();
    if (ojon>cap){
  System.out.println("Warning: Unable to load "+ X.getnm()+" inside "+ nm + ".Exceeds capacity by "
  + (ojon-cap)+ ".");
   return;
    }
  A[ct]= X;
  ct++;
  tw= ojon;
  }
  public void displayDetails(){
System.out.println("Spaceship Name: "+ nm);
System.out.println("Capacity: " +cap);
System.out.println("Current Cargo Weight: " +tw);
System.out.println("Cargo:");
for (int i =0;i<ct;i++){
  System.out.println(A[i].getnm()+ " ");
} }}
