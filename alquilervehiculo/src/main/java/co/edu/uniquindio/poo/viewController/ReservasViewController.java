package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ReservasViewController {

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TableColumn<?, ?> tbc_id;

    @FXML
    private TableColumn<?, ?> tbc_tiempo;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private TableView<?> tb_listReservas;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_cancelarAlquiler;

    @FXML
    private TableColumn<?, ?> tbc_vehiculo;

    @FXML
    private Text txt_bienvenido;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private Button btn_alquilarVh;

    @FXML
    private AnchorPane anp_reservas;

    @FXML
    private Text txt_nombreCliente;

    @FXML
    private TableColumn<?, ?> tbc_tipo;

    @FXML
    private Text txt_quedeseahacer;

    @FXML
    private Text txt_reservas;

    @FXML
    private Button btn_cerrarSesion;

    @FXML
    private Text txt_tucarro;

    @FXML
    void onCancelarAlq(ActionEvent event) {

    }

    @FXML
    void onAlquilar(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onCerrar(ActionEvent event) {
        app.openUsuario();
    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
