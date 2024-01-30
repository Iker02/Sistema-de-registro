import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        SistemaDeRegistro sistema = new SistemaDeRegistro();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            while (true) {
                System.out.println("\u001B[36m******************************************");
                System.out.println("*           \u001B[1mMENÚ PRINCIPAL\u001B[0m             *");
                System.out.println("******************************************\u001B[0m");
                System.out.println("1. Registrarse");
                System.out.println("2. Iniciar sesión");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\u001B[36m******************************************");
                        System.out.println("*        \u001B[1mREGISTRO DE CUENTA\u001B[0m            *");
                        System.out.println("******************************************\u001B[0m");
                        System.out.print("Ingrese correo electrónico");
                        String correo = scanner.nextLine();
                        System.out.print("Ingrese un nombre de usuario: ");
                        String nuevoUsuario = scanner.nextLine();
                        System.out.print("Ingrese una contraseña: ");
                        String nuevaContraseña = scanner.nextLine();
                        System.out.print("Ingrese qué coche tiene");
                        String coche = scanner.nextLine();
                        sistema.registrarCuenta(nuevoUsuario, nuevaContraseña);
                        break;
                    case 2:
                        System.out.println("\u001B[36m******************************************");
                        System.out.println("*        \u001B[1mINICIO DE SESIÓN\u001B[0m              *");
                        System.out.println("******************************************\u001B[0m");
                        System.out.print("Ingrese su nombre de usuario: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Ingrese su contraseña: ");
                        String contraseña = scanner.nextLine();
                        sistema.iniciarSesion(usuario, contraseña);
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción válida.");
                }
            }
        } while (opcion != 4);
    }
}
