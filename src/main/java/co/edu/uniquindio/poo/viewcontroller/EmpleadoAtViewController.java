package co.edu.uniquindio.poo.viewcontroller;

import java.util.Collection;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdminController;
import co.edu.uniquindio.poo.controller.EmpleadoAtController;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EstadoRegistro;
import co.edu.uniquindio.poo.model.EstadoVehiculo;
import co.edu.uniquindio.poo.model.Excepciones;
import co.edu.uniquindio.poo.model.TipoTransmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmpleadoAtViewController {
    


    @FXML
    private TextField txt_marca;

    @FXML
    private TextField txt_abs;

    @FXML
    private TextField txt_4x4;

    @FXML
    private TextField txt_velMax;

    @FXML
    private TextField txt_capCarga;

    @FXML
    private TextField txt_modelo;

    @FXML
    private TextField txt_nCambios;

    @FXML
    private TableColumn<Vehiculo, Enum> tbc_registro;

    @FXML
    private TextField txt_frenoAire;

    @FXML
    private TableView<Vehiculo> tb_vehiculos;

    @FXML
    private TextField txt_t0100;

    @FXML
    private TextField txt_ac;

    @FXML
    private TableColumn<Vehiculo, Enum> tbc_estado;

    @FXML
    private TextField txt_registro;

    @FXML
    private TableColumn<Vehiculo, String> tbc_codigo;

    @FXML
    private TextField txt_senColision;

    @FXML
    private TextField txt_velCrucero;

    @FXML
    private TextField txt_codVehivulo;

    @FXML
    private TextField txt_asiisP;

    @FXML
    private TextField txt_estado;

    @FXML
    private TextField txt_nSalidas;

    @FXML
    private TextField txt_cilindraje;

    @FXML
    private TextField txt_nPuertas;

    @FXML
    private TextField txt_senCruzado;

    @FXML
    private TextField txt_capMaletero;

    @FXML
    private TextField txt_transmision;

    @FXML
    private TextField txt_nBolsas;

    @FXML
    private TableColumn<Vehiculo, String> tbc_modelo;

    @FXML
    private TableColumn<Vehiculo, String> tbc_marca;

    @FXML
    private TextField txt_camReversa;

    @FXML
    private TextField txt_cabFuerza;

    @FXML
    private TextField txt_nPasajeros;

    @FXML
    private TextField txt_nEjes;

    @FXML
    private Button bt_registrar;

    @FXML
    private ComboBox<String> cbx_tipovehiculo;

    private Concesionario concesionario;

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    private EmpleadoAtController controller;
    private App app;
    public void setApp(App app) {
        this.app = app;
    }

    private ObservableList<Vehiculo> ListaVehiculos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        concesionario = new Concesionario();
        cbx_tipovehiculo.getItems().addAll("Sedan", "Camioneta", "Deportivo", "Bus", "Camion", "Moto", "Pick Up", "Van");
        cbx_tipovehiculo.setOnAction(event -> actualizarFormulario());
        if (controller == null) {
            controller = new EmpleadoAtController(); 
        }
        tbc_codigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tbc_marca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        tbc_modelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        tbc_estado.setCellValueFactory(new PropertyValueFactory<>("estadoVehiculo"));
        tbc_registro.setCellValueFactory(new PropertyValueFactory<>("estadoRegistro"));
        tb_vehiculos.setItems(ListaVehiculos);
    }

    private void actualizarFormulario(){
        String tipoSeleccionado = cbx_tipovehiculo.getValue();
        txt_nPasajeros.setVisible(false);
        txt_nPuertas.setVisible(false);
        txt_capMaletero.setVisible(false);
        txt_abs.setVisible(false);
        txt_4x4.setVisible(false);
        txt_capCarga.setVisible(false);
        txt_frenoAire.setVisible(false);
        txt_t0100.setVisible(false);
        txt_ac.setVisible(false);
        txt_senColision.setVisible(false);
        txt_velCrucero.setVisible(false);
        txt_asiisP.setVisible(false);
        txt_nSalidas.setVisible(false);
        txt_senCruzado.setVisible(false);
        txt_nBolsas.setVisible(false);
        txt_camReversa.setVisible(false);
        txt_cabFuerza.setVisible(false);
        txt_nEjes.setVisible(false);
        txt_asiisP.setVisible(false);

        switch (tipoSeleccionado) {
            case "Sedan" :
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_capMaletero.setVisible(true);
                txt_senCruzado.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_ac.setVisible(true);
                txt_senColision.setVisible(true);
                txt_velCrucero.setVisible(true);
                txt_asiisP.setVisible(true);
                txt_abs.setVisible(true);
                txt_camReversa.setVisible(true);
                break;
            case "Camioneta":
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_capMaletero.setVisible(true);
                txt_senCruzado.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_ac.setVisible(true);
                txt_senColision.setVisible(true);
                txt_velCrucero.setVisible(true);
                txt_asiisP.setVisible(true);
                txt_abs.setVisible(true);
                txt_camReversa.setVisible(true);
                break;
            case "Deportivo":
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_cabFuerza.setVisible(true);
                txt_t0100.setVisible(true);
                break;
            case "Bus":
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_capMaletero.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_nSalidas.setVisible(true);
                txt_ac.setVisible(true);
                txt_camReversa.setVisible(true);
                txt_velCrucero.setVisible(true);
                txt_nEjes.setVisible(true);
                break;
            case "Camion":
                txt_capCarga.setVisible(true);
                txt_nEjes.setVisible(true);
                txt_ac.setVisible(true);
                txt_abs.setVisible(true);
                txt_frenoAire.setVisible(true);
                break;
            case "Moto":
                break;
            case "Pick Up":
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_capMaletero.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_capCarga.setVisible(false);
                txt_ac.setVisible(true);
                txt_velCrucero.setVisible(true);
                txt_abs.setVisible(true);
                txt_camReversa.setVisible(true);
                txt_4x4.setVisible(true);
                break;
            case "Van":
                txt_nPasajeros.setVisible(true);
                txt_nPuertas.setVisible(true);
                txt_capMaletero.setVisible(true);
                txt_nBolsas.setVisible(true);
                txt_ac.setVisible(true);
                txt_velCrucero.setVisible(true);
                txt_abs.setVisible(true);
                txt_camReversa.setVisible(true);
                break;
            default:
                break;
        }

    }

    public void actualizarTabla() {
        if (concesionario == null) {
            System.out.println("La empresa no está inicializada.");
            return;
        }
        Collection<Vehiculo> vehiculos = concesionario.getVehiculos();
        if (vehiculos != null) {
            ListaVehiculos.setAll(vehiculos);
        }
    }

    
    @FXML
public void onAgregarVehiculo() {
    try {
        String codigo = txt_codVehivulo.getText();  
        String marca = txt_marca.getText();   
        String modelo = txt_modelo.getText(); 
        double cilindraje = Double.parseDouble(txt_cilindraje.getText());  
        
        String tipoTransmisionInput = txt_transmision.getText().toUpperCase().trim(); 
        String estadoVehiculoInput = txt_estado.getText().toUpperCase().trim();  
        String estadoregistro = txt_registro.getText().toUpperCase().trim();

        TipoTransmision tipoTransmision = TipoTransmision.valueOf(tipoTransmisionInput.equals("SI") ? "AUTOMATICA" : "MANUAL");
        EstadoVehiculo estadoVehiculo = EstadoVehiculo.valueOf(estadoVehiculoInput.equals("SI") ? "NUEVO" : "USADO");
        EstadoRegistro estadoRegistro = EstadoRegistro.valueOf(estadoregistro.equals("SI") ? "DISPONIBLE" : "VENDIDO");

        Vehiculo vehiculo = new Vehiculo(codigo, marca, 0, 0, 0, cilindraje, tipoTransmision, estadoVehiculo, estadoRegistro);
        
        if (concesionario != null ) {
            concesionario.registrarVehiculo(vehiculo);  
            System.out.println("Vehículo agregado: " + vehiculo.getCodigo());
            System.out.println("Total vehículos en la empresa: " + concesionario.getVehiculos().size());
            actualizarTabla(); 
        } else {
            System.out.println("Concesionario o empresa no inicializados.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Error al convertir el valor del cilindraje: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Error al registrar el vehículo: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error desconocido: " + e.getMessage());
    }
}

}
