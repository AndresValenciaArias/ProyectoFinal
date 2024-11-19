package co.edu.uniquindio.poo.viewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;

public class LoginViewController {
    
    @FXML
    private TextField txt_tipoUsuario;

    @FXML
    private TextField txt_contrasenaUsuario;

    @FXML
    private TextField txt_nombreUsuario;

    @FXML
    private Button bt_ingresar;

    @FXML
    private Label labelError;

    private LoginController loginController;
    private App app;
    
    public void setApp(App app) {
    this.app = app;
    System.out.println("Referencia a 'app' establecida correctamente: " + app);
    }

    public void setLoginController(LoginController loginController) {
        System.out.println("Configurando LoginController");
        this.loginController = loginController;
    }

    @FXML
    public void initialize() {
        this.loginController = new LoginController();
        System.out.println("LoginController inicializado: " + loginController);
    }

    @FXML
public void ingresar() {
    System.out.println("Método ingresar llamado");

    String tipoU = txt_tipoUsuario.getText().trim();
    String nombre = txt_nombreUsuario.getText().trim();
    String contrasena = txt_contrasenaUsuario.getText().trim();

    System.out.println("Tipo de usuario: " + tipoU);
    System.out.println("Nombre de usuario: " + nombre);
    System.out.println("Contraseña: " + contrasena);

    if (tipoU.equalsIgnoreCase("admin")) {
        System.out.println("Validando administrador: " + nombre);
        if (loginController.validarAdministrador(nombre, contrasena)) {
            System.out.println("Validación de administrador exitosa");
            app.openAdmin();
        } else {
            System.out.println("Error en los datos del administrador.");
        }
    } else if (tipoU.equalsIgnoreCase("empleado")) {
        System.out.println("Validando empleado: " + nombre);
        if (loginController.validarEmpleado(nombre, contrasena)) {
            System.out.println("Validación de empleado exitosa");
            app.openEmpleado();
        } else {
            System.out.println("Error en los datos del empleado.");
        }
    } else {
        System.out.println("Tipo de usuario no reconocido.");
    }
}

}