import java.util.*;
import java.io.*;

public class OlympicRecords{
  public static void main(String[] args) throws IOException{
    Record hello = new Record("M", "yes", "999999999");
    ArrayList<Record> M10k = new ArrayList<Record>();
    ArrayList<Record> W10k = new ArrayList<Record>();
    M10k.add(hello);
    W10k.add(hello);
    Scanner a = new Scanner(new File("Results.csv"), "UTF-8");
    a.useDelimiter(",|\n");
    a.next();
    for(int i = 0; i < 7; i++){
      a.next();
    }

    while(a.hasNext()){
      String g = a.next();
      if(!a.hasNext()){
        break;
      }
      String e = a.next();
      if(e.equals("10000M Men")||e.equals("10000M Women")){
        for(int i = 0; i < 5; i++){
          a.next();
        }
        String r = a.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M10k.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M10k.set(0, yeet);
        } else if((yeet.resultVal() < W10k.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W10k.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          a.next();
        }
      }
    }
    a.close();
    System.out.println("10000M Women's Olympic record is "+((W10k.get(0).resultVal()-M10k.get(0).resultVal())/M10k.get(0).resultVal()*100) + " percent slower than the 10000M Men's Olympic record.");



    ArrayList<Record> M100m = new ArrayList<Record>();
    ArrayList<Record> W100m = new ArrayList<Record>();
    M100m.add(hello);
    W100m.add(hello);
    Scanner b = new Scanner(new File("Results.csv"), "UTF-8");
    b.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      b.next();
    }

    while(b.hasNext()){
      String g = b.next();
      if(!b.hasNext()){
        break;
      }
      String e = b.next();
      if(e.equals("100M Men")||e.equals("100M Women")){
        for(int i = 0; i < 5; i++){
          b.next();
        }
        String r = b.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M100m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M100m.set(0, yeet);
        } else if((yeet.resultVal() < W100m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W100m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          b.next();
        }
      }
    }
    b.close();
    System.out.println("100M Women's Olympic record is "+((W100m.get(0).resultVal()-M100m.get(0).resultVal())/M100m.get(0).resultVal()*100) + " percent slower than the 100M Men's Olympic record.");
  }
}
