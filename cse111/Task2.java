public class Task2{
  public static void main(String[] args){
    String a = "apple";
    for(int i = 0; i < a.length(); i++){
      System.out.print(a.charAt(i) + " ");
      System.out.println((int)a.charAt(i));
    }
    System.out.println("print the String in reverse");
    //print the String in reverse
    for(int i = a.length() - 1; i >= 0; i--){
      System.out.print(a.charAt(i) + " ");
      System.out.println((int)a.charAt(i));
    }
    //match value/ search value/find index
    //Find if any 'p' exists in the String
    boolean hasChar = false;
    for(int i = 0; i < a.length(); i++){
      if(a.charAt(i) == 'p'){
        hasChar = true;
        break;
      }
    }
    if(hasChar == true) System.out.println("exists");
    else System.out.println("not exists");
  }
}