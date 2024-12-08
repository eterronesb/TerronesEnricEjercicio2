import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //lista para almacenar eventos
    private static ArrayList<Event> events = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        //bucle principarl del menu
        while (option != 5) {
            showMenu();//muestra el menu
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    deleteEvent();
                    break;
                case 3:
                    listEvents();
                    break;
                case 4:
                    togleTaskCompletion();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    //mostrar menu opciones
    private static void showMenu() {
        System.out.println("[1] Añadir evento");
        System.out.println("[2] Borrar evento");
        System.out.println("[3] Listar eventos");
        System.out.println("[4] Marcar/desmarcar tareas de un evento");
        System.out.println("[5] Salir.");
    }
    //añadir evento
    private static void addEvent(){
        System.out.println("Titulo: ");
        String title = scanner.nextLine();

        System.out.println("Fecha (AAA-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.println("Prioridad (HIGH, MEDIUM, LOW): ");
        Event.Priority priority = Event.Priority.valueOf(scanner.nextLine().toUpperCase());
        //utilizamos toUpperCase, para que se ponga en mayusculas

        events.add(new Event(title, date, priority));
        System.out.println("Evento añadido");
    }
    //eliminar un evento
    private static void deleteEvent() {
        System.out.println("Titulo del evento a eliminar: ");
        String title = scanner.nextLine();
        //creamos un bucle para que recorra la lista en busca de un evento que coincida
        for (int i= 0; i< events.size(); i++){
            if (events.get(i).getTitle().equals(title)) {
                events.remove(i);
                System.out.println("Evento eliminado.");
                return;//sale del metodo al finalizar tarea
            }
        }
        //si no encuentra el evento
        System.out.println("Evento no encontrado.");
    }
    //listar eventos
    private static void listEvents() {
        if (events.isEmpty()) {//Si no hay eventos
            System.out.println("No hay eventos.");
            return;
        }
        for (Event event : events) {//muestra cada evento
            System.out.println(event);
        }
    }
    //marcar/desmarcar
    private static void togleTaskCompletion(){
        System.out.println("Titulo del evento: ");
        String title = scanner.nextLine();//pedimos al usuario el titulo del evento
        for (Event event : events){
            if (event.getTitle().equals(title)) { //lista las tareas
                event.listTasks();

                System.out.println("Numero de tareas: ");
                int taskNumber = Integer.parseInt(scanner.nextLine()) - 1;
                //marcar o desmarcar
                event.getTask(taskNumber).toggleCompletion();
                System.out.println("Tarea actualizada.");
                return;
            }
        }
        //si no encuentra el evento
        System.out.println("Evento no encontrado.");
    }
}