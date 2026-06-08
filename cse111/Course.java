public class Course{
 
  private String name, code;
  
  public Course(String name, String code){
    this.name = name;
    this.code = code;
    
  }
 
  public String getCode(){
    return code;
  }
  public String getName(){
    return name;
  }
}