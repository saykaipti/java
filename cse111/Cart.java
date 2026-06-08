//Task 02
public class Cart {
  public int id_C;
  public int ct;
  public double dis_pc;
  public String[] itnm;
  public double[]itpr;
  public Cart (){
  itnm = new String[3];
  itpr = new double [3];
  }
  public void create_cart(int A){
    this.id_C = A;
  }
  public void addItem(String nm,double pr){
    if (ct>=3){
System.out.println( "You already have 3 items on your cart" );
return;
}
 itnm [ct] =  nm;
 itpr [ct]= pr;
 ct++;
 System.out.println( nm+ " added to cart" + id_C + ".");
 System.out.println( "You have " + id_C + " items in your cart");
  }
 public void addItem(double pr, String nm){
    if (ct>=3){
System.out.println( "You already have 3 items on your cart" );
return;
}
 itnm [ct] =  nm;
 itpr [ct]= pr;
 ct++;
 System.out.println( nm+ "added to cart" + id_C + ".");
 System.out.println( "You have " + id_C + "tems in your cart");
  }
 public void giveDiscount(double B){
   this.dis_pc= B;
 }
 
 public void cartDetails(){
 System.out.println("Your cart (c" +id_C+ ") : ")   ;
   for (int i = 0;i <ct; i++) {
  System.out.println(itnm[i]+ "-"+ itpr[i]);
   }
 System.out.println("Discount Appiled:" + dis_pc + "%" );
 double t_pr = 0.0;
 for (int i = 0; i <ct; i++){
   t_pr+=itpr[i];
   if (dis_pc>0){
     t_pr = t_pr*(1-dis_pc/100);
   }
System.out.println("Total price: " +t_pr);
 }
 }}
   
   