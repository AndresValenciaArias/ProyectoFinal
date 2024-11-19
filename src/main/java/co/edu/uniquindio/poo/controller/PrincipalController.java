package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewcontroller.EmpleadoAtViewController;
import co.edu.uniquindio.poo.viewcontroller.EmpleadoClViewController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class PrincipalController {

    @FXML
    private StackPane contenidoPane;

    @FXML
    private Button btnAutos;

    @FXML
    private Button btnClientes;

    private App app;
    private Concesionario concesionario;

    public void setApp(App app) {
        this.app = app;
        if (concesionario == null) {
            concesionario = new Concesionario();
    }
}

    @FXML
    public void mostrarAutos() {
        cargarVista("EmpleadoAt.fxml");
    }

    @FXML
    public void mostrarClientes() {
        cargarVista("EmpleadoCl.fxml");
    }
    

    private void cargarVista(String vista) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/" + vista));
        Parent nuevoContenido = loader.load();

        if (vista.equals("EmpleadoAt.fxml")) {
        EmpleadoAtViewController controller = loader.getController();
        controller.setConcesionario(concesionario);  
        } else if (vista.equals("EmpleadoCl.fxml")) {
            EmpleadoClViewController controller = loader.getController();
            controller.setConcesionario(concesionario);  
    }
       contenidoPane.getChildren().clear();
       contenidoPane.getChildren().add(nuevoContenido);
    } catch (Exception e) {
        System.err.println("Error cargando la vista " + vista);
        e.printStackTrace();
    }
}
}
