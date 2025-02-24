package projeto_java_jeisson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        // Pedir la cantidad de estudiantes con validación
        int cantidad = solicitarCantidad(scanner);

        // Registrar estudiantes
        registrarEstudiantes(scanner, estudiantes, cantidad);

        // Mostrar lista original
        System.out.println("\n📜 Lista de estudiantes:");
        mostrarLista(estudiantes);

        // Ordenar y mostrar en orden alfabético
        Collections.sort(estudiantes);
        System.out.println("\n📜 Lista ordenada alfabéticamente:");
        mostrarLista(estudiantes);

        // Búsqueda de un estudiante
        buscarEstudiante(scanner, estudiantes);

        scanner.close();
    }

    public static int solicitarCantidad(Scanner scanner) {
        int cantidad;
        while (true) {
            try {
                System.out.print("🚀 Ingrese la cantidad de estudiantes a registrar: ");
                cantidad = Integer.parseInt(scanner.nextLine());
                if (cantidad > 0) break;
                System.out.println("⚠️ Por favor, ingrese un número mayor que 0.");
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida. Ingrese un número entero.");
            }
        }
        return cantidad;
    }

    public static void registrarEstudiantes(Scanner scanner, ArrayList<String> estudiantes, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("📝 Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes.add(scanner.nextLine().trim());
        }
    }

    public static void mostrarLista(ArrayList<String> estudiantes) {
        for (String estudiante : estudiantes) {
            System.out.println("👤 " + estudiante);
        }
    }

    public static void buscarEstudiante(Scanner scanner, ArrayList<String> estudiantes) {
        System.out.print("\n🔍 Ingrese el nombre del estudiante que desea buscar: ");
        String busqueda = scanner.nextLine().trim();

        if (estudiantes.contains(busqueda)) {
            System.out.println("✅ El estudiante " + busqueda + " está en la lista.");
        } else {
            System.out.println("❌ El estudiante " + busqueda + " no se encuentra en la lista.");
        }
    }
}
