package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class AlquilarMotoViewController {

    @FXML
    private SubScene ssc_fondo2;

    @FXML
    private TextArea txf_detallesUso;

    @FXML
    private TextField txf_tiempoReserva;

    @FXML
    private SubScene ssc_fondo1;

    @FXML
    private Text txt_detallesUso;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private Button btn_reservar;

    @FXML
    private Text txt_tiempoReserva;

    @FXML
    private Text txt_alquilarVehiculo;

    @FXML
    private TableColumn<?, ?> tbc_añoFabricacion;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<?, ?> tbc_disponible;

    @FXML
    private TableColumn<?, ?> tbc_modelo;

    @FXML
    private TableColumn<?, ?> tbc_marca;

    @FXML
    private Text txt_tucarro;

    @FXML
    private TableColumn<?, ?> tbc_caja;

    @FXML
    private TableView<?> tb_motos;

    @FXML
    void onVolver(ActionEvent event) {
        app.openMenuVh();
    }

    @FXML
    void onTiempo(ActionEvent event) {

    }

    @FXML
    void onReservar(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }

}
