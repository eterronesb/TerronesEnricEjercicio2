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

}