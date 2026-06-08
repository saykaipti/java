//task 02 
public class PlatinumCard extends CreditCard{
  public PlatinumCard(String ch,String an){
    super(ch,an,100);
  }
  public void spendCash(int s){
  System.out.println("Previous Reward Points: "+ rewardPoints);
  rewardPoints += (s/100)*2;
  System.out.println("Reward Points after sppending "+ s+ " taka " + rewardPoints);
  }}