public class Task3{
  public static void main(String[] args){
    int[] arr = {3, 2, 4, 5, 6};
    //find the number of primes in this array
    for(int j = 0; j < arr.length; j++){
      int x = arr[j];
      int divCount = 0;
      for(int i = 1; i < x; i++){
        if(x % i == 0){
          divCount++;
        }
      }
      if(divCount > 1) System.out.println(x + " not prime");
      else System.out.println(x + " prime");
      
    }
  }
}
