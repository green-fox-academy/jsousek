import sun.nio.cs.ext.MacCentralEurope;

import java.time.*;


public class OneTask {
    int id;
    int taskNr;
    boolean isDone;
    String taskDecryption;
    ZonedDateTime timeOfCreation;


    public OneTask( int id, int taskNr, boolean isDone, String taskDecryption){
        this.id=id;
        this.taskNr = taskNr;
        this.isDone = isDone;
        this.taskDecryption =taskDecryption;
        this.timeOfCreation = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("CET"));
    }


    @Override
    public  String toString(){
         String s = "";
        if (this.isDone == false){
        return s = }
        else return s =


    }
}
