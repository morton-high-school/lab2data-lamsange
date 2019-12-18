import java.util.*;

public class Record{

    private String gender;
    private String event;
    private String result;

    public Record (String gender, String event, String result){
      this.gender = gender;
      this.event = event;
      this.result = result;
    }

    public String getGender(){
      return gender;
    }

    public String getEvent(){
      return event;
    }

    public String getResult(){
      return result;
    }
    public Double resultVal(){
      ArrayList<Double> time = new ArrayList<>();
      Scanner s = new Scanner("1:59:40.2");
      s.useDelimiter(":");
      while(s.hasNext()){
        time.add(s.getInteger());
      }
      s.close();
      if(time.length == 3){
        time.set(0, time.get(0)*60*60);
        time.set(1, time.get(1)*60);
        return (time.get(0)+time.get(1)+time.get(2));
      } else if(time.length == 2){
        time.set(0, time.get(0)*60);
        return (time.get(0)+time.get(1));
      } else {
        return (time.get(0));
      }

    }

  }
