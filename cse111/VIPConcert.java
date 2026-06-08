public class VIPConcert extends Concert{
  public VIPConcert(String v,String st ){
 super(v,st);
  }
  public void buyTicket(){
System.out.println("Total price: 2000");
super.buyTicket("VIP", 1);
  }}
  