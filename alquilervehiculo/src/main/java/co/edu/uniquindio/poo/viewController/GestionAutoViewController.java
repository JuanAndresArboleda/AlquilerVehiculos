package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class GestionAutoViewController {

    @FXML
    private TableColumn<?, ?> tbc_puertas;

    @FXML
    private Text txt_marca;

    @FXML
    private Button btn_actualizarVehiculo;

    @FXML
    private ImageView img_carro;

    @FXML
    private Button btn_volver;

    @FXML
    private Button btn_eliminar;

    @FXML
    private TextField txf_marca;

    @FXML
    private Text txt_modelo;

    @FXML
    private AnchorPane ap_gestionVehiculo;

    @FXML
    private TableView<?> tb_vehiculos;

    @FXML
    private TextField txf_puertas;

    @FXML
    private Text txt_vehiculos;

    @FXML
    private TableColumn<?, ?> tbc_disponible;

    @FXML
    private Text txt_tucarro;

    @FXML
    private Button btn_agregaVehiculo;

    @FXML
    private Text txt_puertas;

    @FXML
    private Text txt_matricula;

    @FXML
    private TextField txf_matricula;

    @FXML
    private Text txt_gestionVh;

    @FXML
    private TableColumn<?, ?> tbc_matricula;

    @FXML
    private TextField txf_modelo;

    @FXML
    private Text txt_añoFabricacion;

    @FXML
    private TableColumn<?, ?> tbc_añoFabricacion;

    @FXML
    private TextField txf_añoFabricacion;

    @FXML
    private TableColumn<?, ?> tbc_modelo;

    @FXML
    private TableColumn<?, ?> tbc_marca;

    @FXML
    void onVolver(ActionEvent event) {
        app.openGestionVh();
    }

    @FXML
    void onVehiculos(ActionEvent event) {

    }

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onAgregar(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    App app;

    public void setApp(App app) {
        this.app = app;
    }
}
