package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import co.edu.uniquindio.poo.model.Cliente;

public class GestionClViewController {

    @FXML
    private Button btn_actualizarCliente;

    @FXML
    private TableColumn<?, ?> tbc_telefono;

    @FXML
    private TextField txf_nombre;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private TextField txf_telefono;

    @FXML
    private TextField txf_cedula;

    @FXML
    private TextField txf_correo;

    @FXML
    private Button btn_agregarCliente;

    @FXML
    private TableView<?> tb_listClientes;

    @FXML
    private Button btn_volder;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    private TableColumn<?, ?> tbc_reservasId;

    @FXML
    private TableColumn<?, ?> tbc_correo;

    Empresa empresa = new Empresa("tuCarro.com", 123);
    ClienteController cc = new ClienteController(empresa);

    @FXML
    void onVolver(ActionEvent event) {
        app.openEmpresa();
    }

    @FXML
    void onClientes(ActionEvent event) {

    }

    @FXML
    void onActualizar(ActionEvent event) {

      cc.actualizarCliente(123, new Cliente("hola", 123, 123, "aaa"));
        
    }

    @FXML
    void onAgregar(ActionEvent event) {
        //agregarCliente();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        //eliminarCliente();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
