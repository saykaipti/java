//task 04
public class ComplexNumber extends RealNumber {
  double a;
  public ComplexNumber(){
  super(1.0);
  this.a= 1.0;
  }
  public ComplexNumber(double realValue, double a ){
    super(realValue);
    this.a= a;
  }
  public String details(){
  return getReal()+ "\nImiginaryaPart: " + a;
  }}