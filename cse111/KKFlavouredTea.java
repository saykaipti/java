// Task 02
public class KKFlavouredTea extends KKTea{
  public int noFtea;

  
  public KKFlavouredTea (String lm, int n, int r){
    super(n,r);
    this.name = "KK " + lm + " Tea ";
  }
    public static void updateSoldStatusFlavoured(KKFlavouredTea pg){
    if (!pg.status){
      pg.status = true;
      tS++;
      fS++;
    }}}
  
  