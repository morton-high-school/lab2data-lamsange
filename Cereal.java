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

  public static void main(String[] args){
    ArrayList<Cereal> allCereal = new ArrayList();
    Scanner s = new Scanner(new File("Cereal.csv"));
    s.useDelimiter(",");
    for(int i = 0; i < 14; i++){
      s.next();
    }
    while(s.hasNext()){
      Cereal c1 = new Cereal();
      allCereal.add(c1);
    }
  }
}
