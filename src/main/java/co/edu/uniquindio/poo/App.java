package co.edu.uniquindio.poo;

import java.io.IOException;

import co.edu.uniquindio.poo.viewcontroller.LoginViewController;
import co.edu.uniquindio.poo.viewcontroller.AdminViewController;
import co.edu.uniquindio.poo.viewcontroller.EmpleadoAtViewController;
import co.edu.uniquindio.poo.viewcontroller.EmpleadoClViewController;
import co.edu.uniquindio.poo.controller.PrincipalController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private Concesionario concesionario = new Concesionario();

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public App() {
        concesionario = new Concesionario();  
    }

    private Administrador administrador;

    @Override
    public void start(Stage primaryStage) throws Exception {
        administrador = new Administrador("12345", "Jose", "123456789", "admin@correo.com", "admin", "123");
        
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
                Parent root = loader.load();
        
                LoginViewController controller = loader.getController();
        
                controller.setApp(this);
        
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Login");
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al cargar el archivo FXML");
            }
        
    }

    public void openAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Admin.fxml"));
            Parent root = loader.load();
            AdminViewController controller = loader.getController();
            controller.setApp(this);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al abrir la ventana de administración");
        }
    }

    public void openEmpleado(){
        try {
            FXMLLoader loader= new FXMLLoader(getClass().getResource("EmpleadoPr.fxml"));
            Parent root = loader.load();
            PrincipalController controller = loader.getController();
            controller.setApp(this);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Gestión de empleados");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
