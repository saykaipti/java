public class SignatureCard extends CreditCard{
  public SignatureCard(String ch,String an){
    super(ch,an,200);
  }
  public void spendCash(int s){
  System.out.println("Previous Reward Points: "+ rewardPoints);
  rewardPoints += (s/100)*4;
  System.out.println("Reward Points after sppending "+ s+ " taka " + rewardPoints);
  }
  public void cardDetails(){
 super.cardDetails();
 System.out.println ("Possible Number of Companions for Lounge: 5");
  }}