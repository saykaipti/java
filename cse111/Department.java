//department class task 03
public class Department {
public String dtName ;
public Student[]students;
public int ct = 0 ;
public Department  (String h){
  dtName = h ;
  students = new Student[5];
  
}
public void addStudent (Student b){
  if (ct>=5){
  System.out.println("Department is full. Can not add more student");
  return;
}
  for (int g = 0 ; g < ct; g ++){
    
    if (students[g].getId()==b.getId() ){
      System.out.println("Student with same id already exists, please try with another id ");
      return;
    }}
      students[ct]=b;
      ct++;
       System.out.println("Welcome to "+ dtName + "department, "+ b.Naam);
}
public void addStudent(Student x, Student y,Student z){
    addStudent(x);
      addStudent(y);
          addStudent(z);
}
public void findStudent(int f){
 // boolean d = false;
  for (int j =  0 ; j < ct ; j++){
    if (students[j].getId()== f){
     // d = true;
    System.out.println("Student Info :");
    System.out.println("Student name:" + students[j].Naam);
    
    System.out.println("Id :"+students[j].getId());
    
    System.out.println("CCGPA :"+students[j].CG_s);
    return ;
    }}
 
    System.out.println("Student with this id doesnt exist, Please  give a valid id ");
  }
  public void details(){
     System.out.println("Department Naae :"+ dtName);
    System.out.println("Num of Students:" + ct);
    
    System.out.println("Details of the Student  :");
    
    for (int j =  0 ; j < ct ; j++){
      Student x = students[j];
      System.out.println ("Student name : "+ x.Naam + ",ID :"+ x.getId() + " ,cgpa: "+x.CG_s);
      
    }}
}
  
    
    
    
