public class Team{
 
  public String tName;
  public int cap;
  public Player[] players;
  int count;

  
  public Team(String n, int cap){
    tName = n;
    this.cap = cap;
    players = new Player[cap];
  }
  
  public void details(){
    System.out.println(tName + " has " + count + " players");
    for(int i = 0; i < count; i++){
      System.out.println(i);
      players[i].info();
      
    }
  }

  public void addPlayer(Player other){
    if(count < cap){
      players[count] = other;
      other.setTeamName(tName);
      count++;
    }
    else{
      System.out.println("out of space");
    }
  }
}