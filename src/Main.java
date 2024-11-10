import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el carácter de patrón para el tablero: ");
        char pattern = scanner.next().charAt(0);//Utilizamos charAt(0) para coger solo el primer caracter

        int size;
        do {
            System.out.print("Introduce el tamaño de cada casilla (1-15): ");
            size = scanner.nextInt();
            if (size < 1 ||  size > 15){
                System.out.println("Tamaño no válido. Debe estar entre 1 y 15.");
            }
        } while (size < 1 ||  size > 15);

        for (int i = 0; i < 8; i++) { // 8 filas del tablero
            for (int row = 0; row < size; row++) { // Tamaño de la casilla en filas
                for (int j = 0; j < 8; j++) { // 8 columnas del tablero
                    for (int col = 0; col < size; col++) { // Tamaño de la casilla en columnas
                        if ((i + j) % 2 == 0) {
                            System.out.print(pattern);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}