import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaDeRegistro {
    private final Map<String, String> cuentas;

    public SistemaDeRegistro() {
        cuentas = new HashMap<>();
    }

    public void registrarCuenta(String usuario, String contraseña) {
        if (cuentas.containsKey(usuario)) {
            System.out.println("Error: Ya existe una cuenta con ese nombre de usuario.");
        } else {
            cuentas.put(usuario, contraseña);
            try {
                guardarCuentaEnArchivo(usuario, contraseña);
                System.out.println("Cuenta creada con éxito y guardada en archivo.");
            } catch (IOException e) {
                System.out.println("Error al guardar la cuenta en el archivo.");
            }
        }
    }

    private void guardarCuentaEnArchivo(String usuario, String contraseña) throws IOException {
        FileWriter writer = new FileWriter("cuentas.txt", true);
        writer.write("Usuario: " + usuario + ", Contraseña: " + contraseña + "\n");
        writer.close();
    }

    public void iniciarSesion(String usuario, String contraseña) {
        if (cuentas.containsKey(usuario) && cuentas.get(usuario).equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Inicio de sesión fallido. Verifica tus credenciales.");
        }
    }
}

