package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class EmpresaViewController {

    @FXML
    private TableColumn<?, ?> tbc_id;

    @FXML
    private TableColumn<?, ?> tbc_cliente;

    @FXML
    private TableColumn<?, ?> tbc_tiempo;

    @FXML
    private Button btn_gestionVehiculos;

    @FXML
    private TableView<?> tb_listReservas;

    @FXML
    private ImageView img_carro;

    @FXML
    private Text txt_queDeseaHacer;

    @FXML
    private TableColumn<?, ?> tbc_vehiculo;

    @FXML
    private Text txt_bienvenido;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private TableColumn<?, ?> tbc_tipo;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private Text txt_nombreAdministrador;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_gestionClientes;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    void onGestionVh(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onGestionCl(ActionEvent event) {
        app.openGestionCl();
    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuario();
    }

    @FXML
    void onReservas(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
