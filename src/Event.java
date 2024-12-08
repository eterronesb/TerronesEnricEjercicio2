import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    //atributos
    private String title;
    private LocalDate date;
    private Priority priority;
    private ArrayList<EventTask> tasks;

    //enum para prioridades
    public enum Priority {
        High, Medium, Low
    }
    //constructor


}
