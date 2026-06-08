public class BracuBus {
  private String route;
 private int maxCap;
 private BracuStudent[] passengers;
 private int pct;
    
 public BracuBus(String r) {
    this.route = r;
 this.maxCap = 2;
  this.passengers = new BracuStudent[maxCap];
    this.pct = 0;
    }
    
    public BracuBus(String r, int maxCap) {
        this.route = r;
        this.maxCap = maxCap;
        this.passengers = new BracuStudent[maxCap]; 
        this.pct = 0;
    }
 public void showDetails() {
 System.out.println("Bus Route: " + route);
  System.out.println("Passenger Count: " + pct + " (Max: " + maxCap + ")");
  System.out.print("Passengers on Board: ");
  if (pct == 0) {
    System.out.println();
   } else {
            for (int i = 0; i < pct; i++) {
   System.out.print(passengers[i].nm + " ");
    }
      System.out.println();
  }}
 public void board() {
 System.out.println("No passengers");
    }
    public void board(BracuStudent k) {
    if (k == null) return;
if (!k.hasPass()) { 
    System.out.println("You don't have a bus pass!");
            return;
   }
  if (!k.getLocation().equals(route)) {  
   System.out.println("You got on the wrong bus!");
  return;
  }
        
 if (pct >= maxCap) {
 System.out.println("Bus is full!");
  return;
        }
        
 passengers[pct] = k; 
 pct++;
  System.out.println(k.nm + " boarded the bus.");
    }
public void board(BracuStudent s1, BracuStudent s2) {
        board(s1);
        board(s2);
}}