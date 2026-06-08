//task 03
public class Book extends Product{
  public String I;
  public String pr;
  public Book (int id,String tl, int prc,String i,String p){
  super(id,tl,prc);
  I=i;
  pr=p;
  }
  public String printDetail(){
  return getIdTitlePrice() + " \nISBN : "+ I+ "Publisher: " + pr;
  }}