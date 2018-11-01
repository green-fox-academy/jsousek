import sun.nio.cs.ext.MacCentralEurope;

import java.time.*;


public class OneTask {
    int taskNr;
    boolean isDone;
    String taskDecryption;
    ZonedDateTime timeOfCreation;
    private final int TASK_ID;
    int id = TASK_ID++;



    public OneTask( int taskNr, boolean isDone, String taskDecryption){
        this.id=id;
        this.taskNr = taskNr;
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
        return s = taskNr + " -  [ ] " + taskDecryption +"\n";}
        else return s = taskNr + " -  [x] " + taskDecryption +"\n";


    }
}
