//Task 02
public class Player{
  String nm;
  int hp;
  String [] D = new String[5];
  int ct = 0;
  public Player(String n, int h){
    nm= n;
    hp=h;
    System.out.println(nm + "joined the game");
    System.out.println("HP: " + hp);
  }
  public Player(String n){
    nm= n;
    hp= 100;
 System.out.println(nm + "joined the game");
 System.out.println("HP: " + hp); }
  public void viewInfo(){
  System.out.println("Player Name " + nm);
  System.out.println("Current: HP " + hp); 
  if (ct>0){
  System.out.println("Defeated:");
  for (int i = 0; i<ct; i++){
  System.out.println(D[i]+ ", ");
  }
  }}
  public void defeatVillain(String n,int p){
    if (p>hp){
  System.out.println("failed to defeat " + n);
    } else {
 System.out.println("defeated" + n);
 hp+=p;
 D[ct++]= n;
    }}
public void defeatVillain(char a,String n,int p){
  int x = a-'0';
  hp = hp*x;
   System.out.println("Hp with " + x+ "x boost: "+ hp);
    if (p>hp){
  System.out.println("failed to defeat " + n);
    } else {
 System.out.println("defeated" + n);
 hp+=p;
 D[ct++]= n;
    }}
  public void defeatVillain(Player p){
    if (p.hp>hp){
  System.out.println("failed to defeat " + p.nm);
    } else {
 System.out.println("defeated" + p.nm);
 hp=hp+p.hp;
 D[ct++]= p.nm;
    }}}

  