// company class task 02
public class Company {
      public String cm_naam = "ABC Company ";
      public int ct = 0 ;
      public Employee[] employees;
      
      public Company (){
      this.employees =new Employee[3];
    }
public void addEmployee(Employee x ){
    if (ct < employees.length ){
      employees[ct]= x;
      ct++;
    }
    else {System.out.println("no more vacancy  ");}
}
public void removeEmployee(Employee y ){
  for (int k = 0 ; k < ct ; k ++){
    if (employees[k]==y){
      System.out.println(y.getNaam()+ " has left the company ");
      int l = k ;
      while (l< ct-1){
        employees[l]= employees [l+1];
        l++;
        employees [ct-1]= null ;
        ct--;
        break ;
      }
    }
  }}
  public void details (){
    System.out.println ("Company Name :"+ cm_naam);
      System.out.println ("Total Employee: "+ ct);
        System.out.println ("Full time Employees: ");
                          for (int c = 0 ; c<ct; c++){
                            if (employees[c].getCat().equals("Fulltime")){
                              System.out.println("Name :"+ employees[c].getNaam()+  " ID: "+ employees[c].getIDn());
                            }}
                           System.out.println ("Part time Employees ");
                          for (int c = 0 ; c<ct; c++){
                            if (employees[c].getCat().equals("Part-time")){
                              System.out.println("Name: "+ employees[c].getNaam()+  " ID: "+ employees[c].getIDn());
                            }}
  }
}

                          
                          
        
        