import sun.nio.cs.ext.MacCentralEurope;

import java.io.Serializable;
import java.time.*;


public class OneTask extends Ided implements Serializable {
    boolean isDone;
    String taskDecryption;
    ZonedDateTime timeOfCreation;
    long id ;

    public OneTask(){

    }



    public OneTask( boolean isDone, String taskDecryption){
        this.id= getId();
        this.isDone = isDone;
        this.taskDecryption =taskDecryption;
        this.timeOfCreation = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("CET"));
    }

    private String timeToFinish (OneTask task){
        String s = "";
        Duration d = null;
        if (task.isDone == true) {
            d = Duration.between(task.timeOfCreation, ZonedDateTime.now());
        }
        return  s = d.toString();
    }

    @Override
    public  String toString(){
        String s = "";
        if (this.isDone == false){
            return s = id  + " -  [ ] " + taskDecryption + " "+timeOfCreation+"\n"; }
        else return s = id  + " -  [x] " + taskDecryption + " "+ timeOfCreation + "\n";


    }




}
