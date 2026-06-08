//Task 02
public class Travel{
  private String st_place;
  private String dt_place;
  private int t_time = 1;
  public static int t_count = 0 ;
  public static Travel[]traveller = new Travel [4];
  public Travel (String sp, String dp){
    this.st_place = sp;
    this.dt_place = dp ;
    if (t_count<traveller.length){
      traveller[t_count]= this;
      t_count++;
    }
  }
    
    public void setSource(String m){
      this.st_place = m ;}
    public String getSource(){
      return st_place; 
    }
    public void setDestination(String n){
      this.dt_place = n ;}
    public String getDestination(){
      return dt_place;
    }
    public void setTime(int h){
      this.t_time = h;}
    public int getTime(){
      return t_time ;
    }
    public static int getCount(){
      return t_count ;
    }
    public String displayTravelInfo(){
         return "Source :"  + st_place + "\n"+
  "Destination :"+ dt_place+ "\n"+
  "Time :"+ t_time + ".00"; 
    }} 
  
    
    
    
    