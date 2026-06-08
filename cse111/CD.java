public class CD extends Product{
  public String b;
  public String gr;
  public int dt;
  public CD(int id,String tl, int prc,String b,int dt,String gr){
  super(id,tl,prc);
 this.b=b;
 this.dt=dt;
 this.gr=gr;
  }
  public String printDetail(){
  return getIdTitlePrice() + " \nBand : "+ b+ "Duration: " + dt +" minutes" +" \nGenre : " + gr;
  }}