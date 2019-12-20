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
    double aa = ((W10k.get(0).resultVal()-M10k.get(0).resultVal())/M10k.get(0).resultVal()*100);
    System.out.println("\n10000M Women's Olympic record is "+ aa + " percent slower than the 10000M Men's Olympic record.\n");



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
    double bb = ((W100m.get(0).resultVal()-M100m.get(0).resultVal())/M100m.get(0).resultVal()*100);
    System.out.println("100M Women's Olympic record is "+ bb + " percent slower than the 100M Men's Olympic record.\n");



    ArrayList<Record> M1500m = new ArrayList<Record>();
    ArrayList<Record> W1500m = new ArrayList<Record>();
    M1500m.add(hello);
    W1500m.add(hello);
    Scanner c = new Scanner(new File("Results.csv"), "UTF-8");
    c.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      c.next();
    }

    while(c.hasNext()){
      String g = c.next();
      if(!c.hasNext()){
        break;
      }
      String e = c.next();
      if(e.equals("1500M Men")||e.equals("1500M Women")){
        for(int i = 0; i < 5; i++){
          c.next();
        }
        String r = c.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M1500m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M1500m.set(0, yeet);
        } else if((yeet.resultVal() < W1500m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W1500m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          c.next();
        }
      }
    }
    c.close();
    double cc = ((W1500m.get(0).resultVal()-M1500m.get(0).resultVal())/M1500m.get(0).resultVal()*100);
    System.out.println("1500M Women's Olympic record is "+ cc + " percent slower than the 1500M Men's Olympic record.\n");



    ArrayList<Record> M200m = new ArrayList<Record>();
    ArrayList<Record> W200m = new ArrayList<Record>();
    M200m.add(hello);
    W200m.add(hello);
    Scanner d = new Scanner(new File("Results.csv"), "UTF-8");
    d.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      d.next();
    }

    while(d.hasNext()){
      String g = d.next();
      if(!d.hasNext()){
        break;
      }
      String e = d.next();
      if(e.equals("200M Men")||e.equals("200M Women")){
        for(int i = 0; i < 5; i++){
          d.next();
        }
        String r = d.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M200m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M200m.set(0, yeet);
        } else if((yeet.resultVal() < W200m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W200m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          d.next();
        }
      }
    }
    d.close();
    double dd = ((W200m.get(0).resultVal()-M200m.get(0).resultVal())/M200m.get(0).resultVal()*100);
    System.out.println("200M Women's Olympic record is "+ dd + " percent slower than the 200M Men's Olympic record.\n");



    ArrayList<Record> M20KmRaceWalk = new ArrayList<Record>();
    ArrayList<Record> W20KmRaceWalk = new ArrayList<Record>();
    M20KmRaceWalk.add(hello);
    W20KmRaceWalk.add(hello);
    Scanner f = new Scanner(new File("Results.csv"), "UTF-8");
    f.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      f.next();
    }

    while(f.hasNext()){
      String g = f.next();
      if(!f.hasNext()){
        break;
      }
      String e = f.next();
      if(e.equals("20Km Race Walk Men")||e.equals("20Km Race Walk Women")){
        for(int i = 0; i < 5; i++){
          f.next();
        }
        String r = f.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M20KmRaceWalk.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M20KmRaceWalk.set(0, yeet);
        } else if((yeet.resultVal() < W20KmRaceWalk.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W20KmRaceWalk.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          f.next();
        }
      }
    }
    f.close();
    double ee = ((W20KmRaceWalk.get(0).resultVal()-M20KmRaceWalk.get(0).resultVal())/M20KmRaceWalk.get(0).resultVal()*100);
    System.out.println("20Km Race Walk Women's Olympic record is "+ ee + " percent slower than the 20Km Race Walk Men's Olympic record.\n");



    ArrayList<Record> M3000mSteeplechase = new ArrayList<Record>();
    ArrayList<Record> W3000mSteeplechase = new ArrayList<Record>();
    M3000mSteeplechase.add(hello);
    W3000mSteeplechase.add(hello);
    Scanner h = new Scanner(new File("Results.csv"), "UTF-8");
    h.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      h.next();
    }

    while(h.hasNext()){
      String g = h.next();
      if(!h.hasNext()){
        break;
      }
      String e = h.next();
      if(e.equals("3000M Steeplechase Men")||e.equals("3000M Steeplechase Women")){
        for(int i = 0; i < 5; i++){
          h.next();
        }
        String r = h.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M3000mSteeplechase.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M3000mSteeplechase.set(0, yeet);
        } else if((yeet.resultVal() < W3000mSteeplechase.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W3000mSteeplechase.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          h.next();
        }
      }
    }
    h.close();
    double ff = ((W3000mSteeplechase.get(0).resultVal()-M3000mSteeplechase.get(0).resultVal())/M3000mSteeplechase.get(0).resultVal()*100);
    System.out.println("3000M Steeplechase Women's Olympic record is "+ ff + " percent slower than the 3000M Steeplechase Men's Olympic record.\n");



    ArrayList<Record> M400mHurdles = new ArrayList<Record>();
    ArrayList<Record> W400mHurdles = new ArrayList<Record>();
    M400mHurdles.add(hello);
    W400mHurdles.add(hello);
    Scanner j = new Scanner(new File("Results.csv"), "UTF-8");
    j.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      j.next();
    }

    while(j.hasNext()){
      String g = j.next();
      if(!j.hasNext()){
        break;
      }
      String e = j.next();
      if(e.equals("400M Hurdles Men")||e.equals("400M Hurdles Women")){
        for(int i = 0; i < 5; i++){
          j.next();
        }
        String r = j.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M400mHurdles.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M400mHurdles.set(0, yeet);
        } else if((yeet.resultVal() < W400mHurdles.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W400mHurdles.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          j.next();
        }
      }
    }
    j.close();
    double gg = ((W400mHurdles.get(0).resultVal()-M400mHurdles.get(0).resultVal())/M400mHurdles.get(0).resultVal()*100);
    System.out.println("400M Hurdles Women's Olympic record is "+ gg + " percent slower than the 400M Hurdles Men's Olympic record.\n");



    ArrayList<Record> M400m = new ArrayList<Record>();
    ArrayList<Record> W400m = new ArrayList<Record>();
    M400m.add(hello);
    W400m.add(hello);
    Scanner k = new Scanner(new File("Results.csv"), "UTF-8");
    k.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      k.next();
    }

    while(k.hasNext()){
      String g = k.next();
      if(!k.hasNext()){
        break;
      }
      String e = k.next();
      if(e.equals("400M Men")||e.equals("400M Women")){
        for(int i = 0; i < 5; i++){
          k.next();
        }
        String r = k.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M400m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M400m.set(0, yeet);
        } else if((yeet.resultVal() < W400m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W400m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          k.next();
        }
      }
    }
    k.close();
    double hh = ((W400m.get(0).resultVal()-M400m.get(0).resultVal())/M400m.get(0).resultVal()*100);
    System.out.println("400M Women's Olympic record is "+ hh + " percent slower than the 400M Men's Olympic record.\n");



    ArrayList<Record> M4X100mRelay = new ArrayList<Record>();
    ArrayList<Record> W4X100mRelay = new ArrayList<Record>();
    M4X100mRelay.add(hello);
    W4X100mRelay.add(hello);
    Scanner l = new Scanner(new File("Results.csv"), "UTF-8");
    l.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      l.next();
    }

    while(l.hasNext()){
      String g = l.next();
      if(!l.hasNext()){
        break;
      }
      String e = l.next();
      if(e.equals("4X100M Relay Men")||e.equals("4X100M Relay Women")){
        for(int i = 0; i < 5; i++){
          l.next();
        }
        String r = l.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M4X100mRelay.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M4X100mRelay.set(0, yeet);
        } else if((yeet.resultVal() < W4X100mRelay.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W4X100mRelay.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          l.next();
        }
      }
    }
    l.close();
    double ii = ((W4X100mRelay.get(0).resultVal()-M4X100mRelay.get(0).resultVal())/M4X100mRelay.get(0).resultVal()*100);
    System.out.println("4X100M Relay Women's Olympic record is "+ ii + " percent slower than the 4X100M Relay Men's Olympic record.\n");



    ArrayList<Record> M4X400mRelay = new ArrayList<Record>();
    ArrayList<Record> W4X400mRelay = new ArrayList<Record>();
    M4X400mRelay.add(hello);
    W4X400mRelay.add(hello);
    Scanner m = new Scanner(new File("Results.csv"), "UTF-8");
    m.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      m.next();
    }

    while(m.hasNext()){
      String g = m.next();
      if(!m.hasNext()){
        break;
      }
      String e = m.next();
      if(e.equals("4X400M Relay Men")||e.equals("4X400M Relay Women")){
        for(int i = 0; i < 5; i++){
          m.next();
        }
        String r = m.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M4X400mRelay.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M4X400mRelay.set(0, yeet);
        } else if((yeet.resultVal() < W4X400mRelay.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W4X400mRelay.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          m.next();
        }
      }
    }
    m.close();
    double jj = ((W4X400mRelay.get(0).resultVal()-M4X400mRelay.get(0).resultVal())/M4X400mRelay.get(0).resultVal()*100);
    System.out.println("4X400M Relay Women's Olympic record is "+ jj + " percent slower than the 4X400M Relay Men's Olympic record.\n");



    ArrayList<Record> M5000m = new ArrayList<Record>();
    ArrayList<Record> W5000m = new ArrayList<Record>();
    M5000m.add(hello);
    W5000m.add(hello);
    Scanner n = new Scanner(new File("Results.csv"), "UTF-8");
    n.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      n.next();
    }

    while(n.hasNext()){
      String g = n.next();
      if(!n.hasNext()){
        break;
      }
      String e = n.next();
      if(e.equals("5000M Men")||e.equals("5000M Women")){
        for(int i = 0; i < 5; i++){
          n.next();
        }
        String r = n.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M5000m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M5000m.set(0, yeet);
        } else if((yeet.resultVal() < W5000m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W5000m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          n.next();
        }
      }
    }
    n.close();
    double kk = ((W5000m.get(0).resultVal()-M5000m.get(0).resultVal())/M5000m.get(0).resultVal()*100);
    System.out.println("5000M Women's Olympic record is "+ kk + " percent slower than the 5000M Men's Olympic record.\n");



    ArrayList<Record> M800m = new ArrayList<Record>();
    ArrayList<Record> W800m = new ArrayList<Record>();
    M800m.add(hello);
    W800m.add(hello);
    Scanner o = new Scanner(new File("Results.csv"), "UTF-8");
    o.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      o.next();
    }

    while(o.hasNext()){
      String g = o.next();
      if(!o.hasNext()){
        break;
      }
      String e = o.next();
      if(e.equals("800M Men")||e.equals("800M Women")){
        for(int i = 0; i < 5; i++){
          o.next();
        }
        String r = o.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < M800m.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          M800m.set(0, yeet);
        } else if((yeet.resultVal() < W800m.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          W800m.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          o.next();
        }
      }
    }
    o.close();
    double ll = ((W800m.get(0).resultVal()-M800m.get(0).resultVal())/M800m.get(0).resultVal()*100);
    System.out.println("800M Women's Olympic record is "+ ll + " percent slower than the 800M Men's Olympic record.\n");



    ArrayList<Record> MMarathon = new ArrayList<Record>();
    ArrayList<Record> WMarathon = new ArrayList<Record>();
    MMarathon.add(hello);
    WMarathon.add(hello);
    Scanner p = new Scanner(new File("Results.csv"), "UTF-8");
    p.useDelimiter(",|\n");
    for(int i = 0; i < 8; i++){
      p.next();
    }

    while(p.hasNext()){
      String g = p.next();
      if(!p.hasNext()){
        break;
      }
      String e = p.next();
      if(e.equals("Marathon Men")||e.equals("Marathon Women")){
        for(int i = 0; i < 5; i++){
          p.next();
        }
        String r = p.next();
        Record yeet = new Record(g, e, r);
        if((yeet.resultVal() < MMarathon.get(0).resultVal())&&(yeet.getGender().equals("M"))){
          MMarathon.set(0, yeet);
        } else if((yeet.resultVal() < WMarathon.get(0).resultVal())&&(yeet.getGender().equals("W"))){
          WMarathon.set(0, yeet);
        } else{
          continue;
        }
      } else {
        for(int i = 0; i < 6; i++){
          p.next();
        }
      }
    }
    p.close();
    double mm = ((WMarathon.get(0).resultVal()-MMarathon.get(0).resultVal())/MMarathon.get(0).resultVal()*100);
    System.out.println("Marathon Women's Olympic record is "+ mm + " percent slower than the Marathon Men's Olympic record.\n");

    double averagePercent = ((aa+bb+cc+dd+ee+ff+gg+hh+ii+jj+kk+ll+mm)/13);
    System.out.println("Average Women's Running Olympic record is "+ averagePercent + " percent slower than the Average Men's Running Olympic record.\n");
  }
}
