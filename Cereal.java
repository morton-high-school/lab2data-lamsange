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
    ArrayList<Cereal> allCereal = new ArrayList();
    Scanner s = new Scanner(new File("Cereal.csv"));
    s.useDelimiter(",");
    for(int i = 0; i < 15; i++){
      s.next();
    }
    while(s.hasNext()){
      String n = s.next();
      for(int i = 0; i<10; i++){
        s.next();
      }
      int sh = s.nextInt();
      s.next();
      s.next();
      String ha = s.next();
      double rate = Double.parseDouble(ha);
      Cereal c1 = new Cereal(n, sh, rate);
      allCereal.add(c1);
    }
    s.close();

    double sh1 = 0;
    double sh2 = 0;
    double sh3 = 0;
    int sh1n = 0;
    int sh2n = 0;
    int sh3n = 0;
    for(Cereal c : allCereal){
      if(c.getShelf() == 1){
        sh1 += c.getRating();
        sh1n += 1;
      } else if(c.getShelf() == 2){
        sh2 += c.getRating();
        sh2n += 1;
      }else if(c.getShelf() == 3){
        sh3 += c.getRating();
        sh3n += 1;
      }
    }
    sh1 = sh1/sh1n;
    sh2 = sh2/sh2n;
    sh3 = sh3/sh3n;
    System.out.println("The average rating of shelf 1: " + sh1);
    System.out.println("The average rating of shelf 2: " + sh2);
    System.out.println("The average rating of shelf 3: " + sh3);
  }
}
