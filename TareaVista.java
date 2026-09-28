import java.util.ArrayList;
import java.util.Scanner;

public class TareaVista {
    private Scanner scanner = new Scanner(System.in);

    // Metodo mostrar
    public void mostrar(ArrayList tareas) {
        System.out.println("\n--- LISTA DE TAREAS ---");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println(i + ". " + tareas.get(i));
            }
        }
        System.out.println("----------------------\n");
    }

    public int mostrarMenu() {
        System.out.println("=== MENÚ MVC ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Completar tarea");
        System.out.println("4. Obtener tareas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}