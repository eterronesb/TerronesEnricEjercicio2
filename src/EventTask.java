public class EventTask {
    //atributos
    private String text;
    private boolean isCompleted;

    //constructor
    public EventTask(String text) {
        this.text = text;
        this.isCompleted = false;
    }
    //metodo para marcar o desmarcar
    public void toggleCompletion() {
        isCompleted = !isCompleted;
    }
    //estado de la tarea
    public boolean isCompleted() {
        return isCompleted;
    }
    //metodo toString para mostrar detalles de la tarea
    public String toString() {
        return (isCompleted ? "[Completada] " : "[Pendiente]") + text;
    }
}
