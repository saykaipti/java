public class Connect {
 Student [] s = new Student [5];
 int c= 0;
 public Connect (){
 System.out.println("Connect is ready to use!");
 }
 public void login(Student a){
   if (a.email==null|| a.password ==null){
 System.out.println("Email and password need to be set.");
   }else{
 a.li = true;
 System.out.println("Login Succesful ");
   }}
 public void advising (Student b){
   if (b.li==false){
 System.out.println("Please login to advise courses!");
return;
}
if (b.ct==0){
 System.out.println("You haven't selected any courses.");
 return;
}
System.out.println("Advising Successful");
s[c]= b;
c++;
 }
public void advising (Student b,String x, String y, String z){
   if (b.li==false){
 System.out.println("Please login to advise courses!");
return;
} 
b.C[0]= x;
b.C[1]= y;
b.C[2]= z;
b.ct=3;
System.out.println("Advising Successful");
s[c]= b;
c++;}
public void advising (Student b,String x, String y, String z,String k){
 System.out.println("You need special approval to take more than 3 courses.");
b.C[0]= x;
b.C[1]= y;
b.C[2]= z;
b.C[3]= k;
b.ct=4;
}
public void allAdviseeInfo(){
System.out.println("Total Advisee: "+ c);
for (int i = 0; i < c; i++){
 Student st = s[i];
System.out.println("Name: "+ st.nm + " ID: "+ st.id);
System.out.println("Department: " + st.dp);
 System.out.print("Advised Courses: ");
 for (int k = 0;k<st.ct;k++){
 System.out.print(st.C[k]+ " ");
 }
  System.out.println();
  System.out.println("==============");
        }
}}

 

   
                    