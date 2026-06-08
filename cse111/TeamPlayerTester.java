public class TeamPlayerTester{
  public static void main(String[] args){
    Player p1 = new Player("A", 20);
    System.out.println("1------------------");
    Player p2 = new Player("B", 21);
    System.out.println("2------------------");
    p1.info(); //Name: A, Age: 20, TeamName: Default
    System.out.println("3------------------");
    p2.info(); //Name: B, Age: 21, TeamName: Default
    System.out.println("4------------------");
    Team t1 = new Team("Team X", 2);
    t1.addPlayer(p1);
    t1.addPlayer(p2);
    System.out.println("5------------------");
    t1.details();
    //Team X has 2 players
    //Name: A, Age: 20, TeamName: Team X
    //Name: B, Age: 21, TeamName: Team x
  }
}