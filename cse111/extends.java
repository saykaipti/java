public class CSEStudent  extends Student {
  public static int ct ;
  public static []A = { CSE110, CSE111, CSE220, CSE221 };
  public CSEStudent (Strung a , int b){
 super(a,b);
 ct++;
  }
  public static void details (){
 System.out.println ("Total CSE Students :" + ct );
 System.out.println ("Available lab Based Course  :" );  
 for(int i = 0 ;i < A.length; i ++ ){
System.out.println (A[i]+ " ");
  }
  System.out.println ();
}
  public void addLabBasedCourse(String k){
  boolean val = false ;
  for(int i = 0 ;i < A.length; i ++ ){
    if (A[i].equals(k)){
      val= true;
 }
    if (val== true){
      courses= courses+k+ " ";
    }
    else {
System.out.println ("It is not a lab based course!")
    } }}}
    