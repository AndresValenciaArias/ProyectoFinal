package co.edu.uniquindio.poo.viewcontroller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdminController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Excepciones;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdminViewController {

    @FXML
    private TextField txt_nombreEmpleado;

    @FXML
    private TextField txt_cedulaEmpleado;

    @FXML
    private TextField txt_telefonoEmpleado;

    @FXML
    private TextField txt_correoEmpleado;

    @FXML
    private TextField txt_claveEmpleado;

    @FXML
    private Button bt_agregar;

    @FXML
    private Button bt_eliminar;

    @FXML
    private Button bt_buscar;

    @FXML
    private Button bt_bloquear;

    @FXML
    private Button bt_desbloquear;

    @FXML
    private TableView<Empleado> tb_empleados;

    @FXML
    private TableColumn<Empleado, String> tbc_nombreEmp;

    @FXML
    private TableColumn<Empleado, String> tbc_cedulaEmp;

    @FXML
    private TableColumn<Empleado, String> tbc_telefonoEmp;

    @FXML
    private TableColumn<Empleado, String> tbc_correoEmp;

    private AdminController controller;

    private Administrador administrador;
    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        if (controller == null) {
            controller = new AdminController(); // Asegúrate de inicializarlo si es null
        }
        tbc_nombreEmp.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tbc_cedulaEmp.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        tbc_telefonoEmp.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        tbc_correoEmp.setCellValueFactory(new PropertyValueFactory<>("correo"));
        tb_empleados.setItems(listaEmpleados);
    }

    private void actualizarTabla() {
        listaEmpleados.setAll(controller.getAdministrador().getEmpleados());
    }

    @FXML
    private void onAgregarEmpleado() {
        controller.agregarEmpleado(txt_nombreEmpleado.getText(), txt_cedulaEmpleado.getText(),
        txt_telefonoEmpleado.getText(), txt_correoEmpleado.getText(), txt_claveEmpleado.getText());
        actualizarTabla();
    }

    @FXML
    private void onEliminarEmpleado() {
        controller.eliminarEmpleado(tb_empleados.getSelectionModel().getSelectedItem());
        tb_empleados.setItems(listaEmpleados);
    }

    @FXML
    private void onBuscarEmpleado() {
        controller.buscarEmpleado(txt_cedulaEmpleado.getText());
    }

    @FXML
    private void onBloquearEmpleado() {
        controller.bloquearEmpleado(txt_cedulaEmpleado.getText());
    }

    @FXML
    private void onDesbloquearEmpleado() {
        controller.desbloquearEmpleado(txt_cedulaEmpleado.getText());
    }

    public void mostrarMensajeError(String mensaje) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Ocurrió un error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
