// Task 02
public class KKTea extends Tea {
  public int ojon ;
  public int notea;
  public static int  tS;
  public static int rS;
    public static int fS;
  
  
  public KKTea(int u ,int v){
    super("KK Regular Tea",u);
    this.notea = v;
    this.ojon = v*2;
  }
  public void productDetail (){
    super.productDetail();
    System.out.println ("Weight: " +ojon + ", Tea Bags: "+ notea);}
  public static void totalSales(){
    System.out.println("Total Sales: "+ tS);
    System.out.println("KK Regular Tea: "+ rS);
    if (fS>0){ 
    System.out.println("KK Flavoured Tea: "+ fS);
    }}
  public static void updateSoldStatusRegular(KKTea pg){
    if (!pg.status){
      pg.status = true;
      tS++;
      rS++;
    }}}
    
      
      
  
    
    
    
  