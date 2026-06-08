public class StudentCourseTester{
  public static void main(String[] args){
    Course c1 = new Course("Programming Lang-I", "CSE110");
    Course c2 = new Course("Programming Lang-II", "CSE111");
    Course c3 = new Course("Discrete Maths", "CSE230");
    
    Student s1 = new Student(1, "Asif");
    s1.addCourse(c1); 
    //CSE110 added to Asif's course list
    s1.addCourse(c2); 
    //CSE111 added to Asif's course list
    s1.addCourse(c3); 
    //CSE230 added to Asif's course list
    s1.showCourses();
    /*Course List: 
     1. CSE110 - Programming Lang-I
     2. CSE111 - Programming Lang-II
     3. CSE230 - Discrete Maths
   */
  }
}