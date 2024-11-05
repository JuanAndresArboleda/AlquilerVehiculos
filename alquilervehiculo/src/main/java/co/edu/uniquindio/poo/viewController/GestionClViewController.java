package co.edu.uniquindio.poo.viewController;

import java.util.Collection;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class GestionClViewController {

    @FXML
    private Button btn_actualizarCliente;

    @FXML
    private TableColumn<Cliente, String> tbc_telefono;

    @FXML
    private TextField txf_nombre;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<Cliente, String> tbc_nombre;

    @FXML
    private TextField txf_telefono;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TextField txf_correo;

    @FXML
    private Button btn_agregarCliente;

    @FXML
    private TableView<Cliente> tb_listClientes;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<Cliente, String> tbc_cedula;

    @FXML
    private TableColumn<Cliente, String> tbc_reservasId;

    @FXML
    private TableColumn<Cliente, String> tbc_correo;

    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;

    Empresa empresa = new Empresa("tuCarro.com", 123);

    @FXML
    public void initialize() {
        // Clientes de ejem
        empresa.agregarCliente(new Cliente("usuario", 0, 0, "null"));
        empresa.agregarCliente(new Cliente("usuario1", 1, 0, "null"));

        Collection<Cliente> clientes = empresa.getClientes();
        listClientes.setAll(clientes);

        // Configura las columnas con PropertyValueFactory para que accedan a los
        // métodos de la clase Cliente
        tbc_nombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbc_cedula.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCedula())));
        tbc_telefono.setCellValueFactory(
                cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getTelefono())));
        tbc_correo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));

        // Asigna la lista de clientes a la TableView
        tb_listClientes.setItems(listClientes);
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openEmpresa();
    }

    @FXML
    void onClientes(ActionEvent event) {

    }

    @FXML
    void onCedula(ActionEvent event) {

    }

    @FXML
    void onTelefono(ActionEvent event) {

    }

    @FXML
    void onCorreo(ActionEvent event) {

    }

    @FXML

    void onActualizar(ActionEvent event) {
        actualizarCliente();
    }

    @FXML
    void onAgregar(ActionEvent event) {
        agregarCliente();

    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarCliente();

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

    private void actualizarTabla() {
        tb_listClientes.refresh();
    }

    private void limpiarCampos() {
        txf_nombre.setText("");
        txf_cedula.setText("");
        txf_telefono.setText("");
        txf_correo.setText("");
    }

    private void actualizarCliente(){
        int cedula = Integer.parseInt(txf_cedula.getText());
        Cliente clienteActualizado = new Cliente(txf_nombre.getText(), cedula, Integer.parseInt(txf_telefono.getText()),
                txf_correo.getText());
        empresa.actualizarCliente(cedula, clienteActualizado);
        actualizarTabla();
        limpiarCampos();
    }
    private void agregarCliente() { int cedula = Integer.parseInt(txf_cedula.getText()); 
    Cliente nuevoCliente = new Cliente(txf_nombre.getText(), cedula, Integer.parseInt(txf_telefono.getText()), txf_correo.getText()); 
    if (empresa.agregarCliente(nuevoCliente)) { 
        listClientes.add(nuevoCliente); 
        actualizarTabla(); limpiarCampos(); 
        } else { 
            txt_tucarro.setText("El cliente ya existe."); 
        } 
    }
    private void eliminarCliente() { 
        int cedula = Integer.parseInt(txf_cedula.getText()); 
    if (empresa.eliminarCliente(cedula)) { 
        listClientes.removeIf(cliente -> cliente.getCedula() == cedula); actualizarTabla(); limpiarCampos(); 
        } else { 
            txt_tucarro.setText("El cliente no existe.");
        }
    }

}