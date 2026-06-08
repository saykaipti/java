public class Shop {
  public int cap ;
  public int ct;
  public String nm;
  public String[] itnm;
  public int []itpr;
  public Shop (String x, int y){
  this.nm =x;
  this.cap= y;
  itnm= new String [cap];
  itpr = new int [cap];
  ct = 0 ;
  System.out.println(nm+ " shop created!");
  }
  public Shop(int cap){
    this.nm = "Mega";
    this.cap= cap;
  itnm= new String [cap];
  itpr = new int [cap];
  ct = 0 ;
  System.out.println( nm+ " shop created!");
  }
  public void info(){
System.out.println( " Shop Name: " + nm);  
System.out.println( " Item Details ");
if (ct ==0){
  System.out.println( " No item in shop ");}
else {
   System.out.println( ct+ " / " + cap);
 for(int i=0;i<ct;i++) {
System.out.println(itnm[i]+" - "+itpr[i] +" Tk");
 }}} 
  public void addItem(String a ,int p){
    if (ct<cap){
 itnm[ct] = a;
 itpr[ct] = p ;
 ct++;
    }
    else{
System.out.println(a + ", could not be added");
return;
    }}
  public void purchase (String c ) {
   boolean info = false;
   for (int i =0;i<ct;i++){
     if (itnm[i].equals(c)){
  info=true;
  for (int k =i ;k<ct-1;k++){
 itnm[k] = itnm[k+1];
 itpr[k]= itpr[k+1];
  }
  ct--;
 System.out.println(" Purchase Complete ");
     }}
   if (info!= true){
  System.out.println(c + ", is not available in this shop");
   }}
   public void addItem(Shop k , String n) {
   boolean info = false;
   for (int i =0;i<k.ct;i++){
     if (k.itnm[i].equals(n)){
       info=true;
       if (ct<cap){
       itnm[ct]= k.itnm[i];
       itpr[ct]= k.itpr[i];
 
  ct++;
       }else {
  System.out.println(n + "could not be added");
  return;
   }
   break;
     }}
   if (!info) {
      System.out.println(n + ", not found in " + k.nm + "!");
    }
  }
}
   