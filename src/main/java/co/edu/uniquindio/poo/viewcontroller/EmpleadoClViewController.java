package co.edu.uniquindio.poo.viewcontroller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdminController;
import co.edu.uniquindio.poo.controller.EmpleadoClController;
import co.edu.uniquindio.poo.viewcontroller.EmpleadoAtViewController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmpleadoClViewController {


    @FXML
    private TextField txt_cliente;

    @FXML
    private TableColumn<Cliente, String> tbc_cliente;

    @FXML
    private TableColumn<Empleado, String> tbc_empleado;

    @FXML
    private TableColumn<Cliente, String> tbc_telefono;

    @FXML
    private TableView<Cliente> tb_clientes;

    @FXML
    private TextField txt_usuarioCl;

    @FXML
    private TextField txt_claveCl;

    @FXML
    private TextField txt_empleado;

    @FXML
    private ComboBox<TipoTransaccion> cbx_tipoTransaccion;

    @FXML
    private TableColumn<Vehiculo, String> tbc_vehiculo;

    @FXML
    private TextField txt_correoCl;

    @FXML
    private TextField txt_telefonoCl;

    @FXML
    private Button bt_registrarCliente;

    @FXML
    private TableColumn<Transaccion, Enum> tbc_tipoTransaccion;

    @FXML
    private TextField txt_nombreCl;

    @FXML
    private TextField txt_cedulaCl;

    @FXML
    private TableColumn<Cliente, String> tbc_nombre;

    @FXML
    private TextField txt_fechaTr;

    @FXML
    private Button bt_registrarTransaccion;

    @FXML
    private Button bt_eliminar;

    @FXML
    private TableView<Transaccion> tb_transacciones;

    @FXML
    private TextField txt_vehiculo;

    @FXML
    private TableColumn<Cliente, String> tbc_cedula;
    private EmpleadoClController controller;
    private App app;

    public void setConcesionario(Concesionario concesionario) {
        this.controller.setConcesionario(concesionario);
    }

    public void setApp(App app) {
        this.app = app;
    }

    private ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
    private ObservableList<Transaccion> listaTransacciones = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        if (controller == null) {
            controller = new EmpleadoClController(); 
        }
        cbx_tipoTransaccion.getItems().addAll(TipoTransaccion.VENTA, TipoTransaccion.ALQUILER, TipoTransaccion.COMPRA);
        tbc_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tbc_cedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        tbc_telefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        tb_clientes.setItems(listaClientes);

        tbc_cliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        tbc_vehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));
        tbc_empleado.setCellValueFactory(new PropertyValueFactory<>("empleado"));
        tbc_tipoTransaccion.setCellValueFactory(new PropertyValueFactory<>("tipoTransaccion"));
        tb_transacciones.setItems(listaTransacciones);
    }


    private void actualizarTablaClientes() {
        listaClientes.setAll(controller.getConcesionario().getClientes());
    }

    private void actualizarTablaTransacciones() {
        listaTransacciones.setAll(controller.getConcesionario().getTransacciones());
    }

    @FXML
    private void onAgregarCliente() {
        controller.agregarcliente(txt_cedulaCl.getText(), txt_nombreCl.getText(),
        txt_telefonoCl.getText(), txt_correoCl.getText(), txt_claveCl.getText());
        actualizarTablaClientes();
    }

    @FXML
    private void onEliminarCliente() {
        controller.eliminarCliente(tb_clientes.getSelectionModel().getSelectedItem());
        tb_clientes.setItems(listaClientes);
    }

   @FXML
private void onAgregarTransaccion() {
    try {
        String codigoVehiculo = txt_vehiculo.getText();
        String cedulaCliente = txt_cliente.getText();
        String cedulaEmpleado = txt_empleado.getText();
        String fechaTexto = txt_fechaTr.getText();
        TipoTransaccion tipoTransaccion = cbx_tipoTransaccion.getValue();

        LocalDate fecha;
        try {
            fecha = LocalDate.parse(fechaTexto, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Use el formato: yyyy-MM-dd.");
            return;
        }

        Vehiculo vehiculo = controller.buscarVehiculo(codigoVehiculo);
        Cliente cliente = controller.buscarCliente(cedulaCliente);
        Empleado empleado = controller.buscarEmpleadoPorCedula(cedulaEmpleado);

        if (vehiculo == null) {
            System.out.println("Vehículo con código " + codigoVehiculo + " no encontrado.");
            return;
        }
        if (cliente == null) {
            System.out.println("Cliente con cédula " + cedulaCliente + " no encontrado.");
            return;
        }
        if (empleado == null) {
            System.out.println("Empleado con cédula " + cedulaEmpleado + " no encontrado.");
            return;
        }

        controller.agregartransaccion(vehiculo, cliente, empleado, tipoTransaccion, fecha);

        actualizarTablaTransacciones();
        System.out.println("Transacción agregada exitosamente.");

    } catch (Exception e) {
        System.out.println("Ocurrió un error al agregar la transacción: " + e.getMessage());
    }
}
}


