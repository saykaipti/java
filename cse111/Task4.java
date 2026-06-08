public class Task4{
  public static void main(String[] args){
    String[] words = {"apple", "banana", "oraange", "mango"};
    //Find the words that start with 'o'
    for(int i = 0; i < words.length; i++){
      if(words[i].charAt(0) == 'o'){
        System.out.println("starts with 'o': " + words[i]);
      }
      if(words[i].charAt(words[i].length() - 1) == 'o'){
        System.out.println("ends with 'o': " + words[i]);
      }
    }  
    //Find the words that have at least 2 'a' in them
      //at least 2, minimum 2 'a's
    for(int i = 0; i < words.length; i++){
      int count = 0; //reset
      for(int j = 0; j < words[i].length(); j++){
        if(words[i].charAt(j) == 'a'){
          count++;
        }
      }
      if(count >= 2) {System.out.println(words[i] + " contains a");}
    }   
  }
}