package EjercicioColas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Cola {
    public static void main(String[] args) {
        Queue<Cliente> colaEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        colaEspera.offer(new Cliente("1", "Hugo"));
        colaEspera.offer(new Cliente("2", "Paco"));
        colaEspera.offer(new Cliente("3", "Luis"));
        colaEspera.offer(new Cliente("4", "Benito"));
        colaEspera.offer(new Cliente("5", "Paquito"));
        colaEspera.offer(new Cliente("6", "Pepito"));
        colaEspera.offer(new Cliente("7", "Toñito"));
        colaEspera.offer(new Cliente("8", "Miguelito"));
        colaEspera.offer(new Cliente("9", "Juanito"));
        colaEspera.offer(new Cliente("10", "Anita"));
        System.out.println("=== ATENCIÓN EN VENTANILLA ===");
        while (!salir) {
            System.out.println("\n--- FUNCIONES ---");
            System.out.println("1. Registrar nuevo cliente ");
            System.out.println("2. Atender al siguiente cliente ");
            System.out.println("3. Consultar próximo cliente ");
            System.out.println("4. Ver lista de espera");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            String opcionStr = scanner.nextLine();
            switch (opcionStr) {
                case "1":
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    Cliente nuevoCliente = new Cliente(id, nombre);
                    colaEspera.offer(nuevoCliente);
                    System.out.println("\nCliente registrado.");
                    break;
                case "2":
                    if (colaEspera.isEmpty()) {
                        System.out.println("\nNo hay clientes para atender.");
                    } else {
                        Cliente atendido = colaEspera.poll();
                        System.out.println("\nCliente atendido:");
                        System.out.println(atendido);
                    }
                    break;
                case "3":
                    if (colaEspera.isEmpty()) {
                        System.out.println("\nLa lista de espera está vacía. No hay próximo cliente.");
                    } else {
                        Cliente proximo = colaEspera.peek();
                        System.out.println("\nProximo en atender :");
                        System.out.println(proximo);
                    }
                    break;
                case "4":
                    if (colaEspera.isEmpty()) {
                        System.out.println("\nLa lista de espera está actualmente vacía.");
                    } else {
                        System.out.println("\nTotal de clientes en espera: " + colaEspera.size());
                        System.out.println("--- Lista de espera ---");
                        int posicion = 1;
                        for (Cliente cliente : colaEspera) {
                            System.out.println(posicion + ". " + cliente);
                            posicion++;
                        }
                    }
                    break;
                case "5":
                    salir = true;
                    System.out.println("\nPrograma finalizado");
                    break;

                default:
                    System.out.println("\nOpción inválida. Utilize un numero del 1 al 5.");
                    break;
            }
        }

        scanner.close();
    }
}


