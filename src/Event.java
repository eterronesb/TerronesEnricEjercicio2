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
    public Event(String title, LocalDate date, Priority priority){
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.tasks = new ArrayList<>();
    }
    //agregar una tarea al evento
    public void addTask(EventTask task){
        tasks.add(task);
    }
    //obtener una tarea especifica
    public EventTask getTask(int index) {
        return tasks.get(index);
    }
    //listar las tareas
    public void listTasks(){
        if (tasks.isEmpty()){
            System.out.println("No hay tareas");
            return;
        }
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    public String toString() {
        int completedTasks = 0;
        for (EventTask task : tasks){
            if (task.isCompleted()) {
                completedTasks++;
            }
        }
        return "Titulo: "+ title + "\nFecha: " + date + "\nPrioridad: " + priority + "\nTareas completadas: " + completedTasks + "/" + tasks.size();
    }
    //getter para el titulo
    public String getTitle() {
        return title;
    }
    //getter para lista tareas
    public ArrayList<EventTask> getTasks() {
        return tasks;
    }
}
