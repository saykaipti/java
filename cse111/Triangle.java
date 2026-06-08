//Task 01
public class Triangle{
public int sideA;
public int sideB;
public int sideC;  
public Triangle  (int x, int y, int z){
sideA = x;
sideB= y;
sideC= z ;
}
public void triangleDetails(){
  System.out.println("Three sides of the triangle are: " +sideA+ ", " + sideB+ ", "+sideC);
  System.out.println("Perimeter: "+(sideA+sideB+sideC));
}   
public String printTriangleType(){
  if (sideA==sideB && sideB==sideC){
  return "This is a Equilateral Triangle.";
  }
  else if (sideA==sideB || sideB==sideC|| sideC==sideA){
    return "This is a Isosceles Triangle.";
  }
  else {
    return "This is a Scalane Triangle.";
  }}  
public void compareTriangles(Triangle A){
  if (this ==A){
 System.out.println("These two triangle objects have the same address.");
  }
  if (sideA==A.sideA && sideB==A.sideB && sideC==A.sideC){
System.out.println("Addresses are different but the sides of the triangles are equal.");  
 } 
  if ((sideA+sideB+sideC) == (A.sideA+ A.sideB+ A.sideC)){
System.out.println("Only the perimeter of both triangles is equal.");
  }
  else {
 System.out.println("Addresses, length of the sides and perimeter all are different.");
  }}
}