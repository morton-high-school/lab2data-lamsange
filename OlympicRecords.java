import java.util.*;
import core.data.*;

public class OlympicRecords{
  public static void main(String[] args){
//    DataSource ds = DataSource.connect("https://drive.google.com/uc?export=download&id=1knS5S_lf7-NqTMsO8HPlH6_DJ-lcBHZ8").load();
//    ArrayList<Record> allrecords = ds.fetchlist("Record", "games/location");
//    String[] bla = ds.fetchStringArray("games/location");
//    System.out.println(bla[0]);
//    ds.printUsageString();
  Record s = new Record("s", "a", "r");
  System.out.println(s.resultVal());
  }
}
