public class BracuStudent {
    public String nm;
    private String loc;
    public boolean pass; 
    public BracuStudent(String nm, String loc) {
        this.nm = nm;
        this.loc = loc;
        this.pass = false; 
    }
    public void showDetails() {
    System.out.println("Student Name: " + nm);
   System.out.println("Lives in " + loc);
    System.out.println("Have Bus Pass? " + pass);
    }  
    public void collectPass() {
        this.pass = true;  
    }
    
    public void setLocation(String loc) {
        this.loc = loc;
    }
    public String getLocation() {
        return loc;
 }
  public boolean hasPass() {
 return pass;  
 }
}