import java.util.*;
import java.io.*;
import core.data.*;

public class Cereal{

  private String name;
  private int shelf;
  private double rating;

  public Cereal(String n, int x, double y){
    name = n;
    shelf = x;
    rating = y;
  }

  public String getName(){
    return name;
  }

  public int getShelf(){
    return shelf;
  }

  public double getRating(){
    return rating;
  }

  public String toString(){
    String s = "Name: " + name + ", Shelf: " + shelf + ", Rating: " + rating;
    return s;
  }

  public static void main(String[] args) throws IOException{
//    ArrayList<Cereal> allCereal = new ArrayList();
    Scanner s = new Scanner(new File("Cereal.csv"));
    s.useDelimiter(",|\n");
    for(int i = 0; i < 15; i++){
      System.out.println(s.next());
    }
    System.out.println("\n\n");
    while(s.hasNext()){
      String n = s.nextLine();
      System.out.println(n);
      System.out.println("\n\n");
      for(int i = 0; i<10; i++){
        System.out.println(s.next());
      }
      System.out.println("\n\n");
      int sh = s.nextInt();
      System.out.println(sh);
      System.out.println("\n\n");
      System.out.println(s.next());
      System.out.println(s.nextDouble());
      System.out.println("\n\n");
      //double rate = s.nextDouble();
      System.out.println(s.nextDouble());
//      Cereal c1 = new Cereal(n, sh, rate);
//      allCereal.add(c1);
    }
  }
}
