import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
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
                    listEvent();
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

}