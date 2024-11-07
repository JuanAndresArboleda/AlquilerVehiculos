package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Caja;
import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.viewController.ClienteViewController;
import co.edu.uniquindio.poo.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.viewController.AlquilarAutoViewController;
import co.edu.uniquindio.poo.viewController.AlquilarCamionetaViewController;
import co.edu.uniquindio.poo.viewController.AlquilarMotoViewController;
import co.edu.uniquindio.poo.viewController.EmpresaViewController;
import co.edu.uniquindio.poo.viewController.GestionClViewController;
import co.edu.uniquindio.poo.viewController.GestionVhViewController;
import co.edu.uniquindio.poo.viewController.MenuVhViewController;
import co.edu.uniquindio.poo.viewController.ReservasViewController;
import co.edu.uniquindio.poo.viewController.UsuarioViewController;
import co.edu.uniquindio.poo.viewController.GestionAutoViewController;
import co.edu.uniquindio.poo.viewController.GestionCamionetaViewController;
import co.edu.uniquindio.poo.viewController.GestionMotoViewController;

public class App extends Application {

    private Stage primaryStage;
    @SuppressWarnings("exports")
    public static Empresa empresa = new Empresa("TuCarro.com", 123);

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Usuarios");
        openUsuario();
    }

    public static void main(String[] args) {
        launch();
    }

    public void openUsuario() {
        inicializarData();
        try {
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(App.class.getResource("usuario.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader1.load(); // Cambiado de VBox a AnchorPane

            UsuarioViewController usuarioViewController = loader1.getController();
            usuarioViewController.setApp(this);

            Scene scene1 = new Scene(rootLayout);
            primaryStage.setScene(scene1);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar usuario.fxml");
            e.printStackTrace();
        }
    }

    public void openAdministrador() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("administrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            AdministradorViewController administradorViewController = loader2.getController();
            administradorViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCliente() {
        try {
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(App.class.getResource("cliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader3.load();
            ClienteViewController clienteViewController = loader3.getController();
            clienteViewController.setApp(this);

            Scene scene3 = new Scene(rootLayout);
            primaryStage.setScene(scene3);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openReservas() {
        try {
            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(App.class.getResource("reservas.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader4.load();
            ReservasViewController reservasViewController = loader4.getController();
            reservasViewController.setApp(this);

            Scene scene4 = new Scene(rootLayout);
            primaryStage.setScene(scene4);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openMenuVh() {
        try {
            FXMLLoader loader5 = new FXMLLoader();
            loader5.setLocation(App.class.getResource("menuVehiculos.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader5.load();

            // Obtén el controlador y asigna la instancia de App
            MenuVhViewController menuVhViewController = loader5.getController();
            menuVhViewController.setApp(this); // Aquí inicializas la variable `app` en el controlador

            Scene scene5 = new Scene(rootLayout);
            primaryStage.setScene(scene5);
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar menuVehiculos.fxml");
            e.printStackTrace();
        }
    }

    public void openAlquilarAuto() {
        try {
            FXMLLoader loader6 = new FXMLLoader();
            loader6.setLocation(App.class.getResource("alquilarAuto.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader6.load();
            AlquilarAutoViewController alquilarAutoViewController = loader6.getController();
            alquilarAutoViewController.setApp(this);

            Scene scene6 = new Scene(rootLayout);
            primaryStage.setScene(scene6);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openAlquilarMoto() {
        try {
            FXMLLoader loader7 = new FXMLLoader();
            loader7.setLocation(App.class.getResource("alquilarMoto.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader7.load();
            AlquilarMotoViewController alquilarMotoViewController = loader7.getController();
            alquilarMotoViewController.setApp(this);

            Scene scene7 = new Scene(rootLayout);
            primaryStage.setScene(scene7);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openAlquilarCamioneta() {
        try {
            FXMLLoader loader8 = new FXMLLoader();
            loader8.setLocation(App.class.getResource("alquilarCamioneta.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader8.load();
            AlquilarCamionetaViewController alquilarCamionetaViewController = loader8.getController();
            alquilarCamionetaViewController.setApp(this);

            Scene scene8 = new Scene(rootLayout);
            primaryStage.setScene(scene8);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionVh() {
        try {
            FXMLLoader loader9 = new FXMLLoader();
            loader9.setLocation(App.class.getResource("gestionVehiculo.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader9.load();
            GestionVhViewController gestionVhViewController = loader9.getController();
            gestionVhViewController.setApp(this);

            Scene scene9 = new Scene(rootLayout);
            primaryStage.setScene(scene9);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionCl() {
        try {
            FXMLLoader loader10 = new FXMLLoader();
            loader10.setLocation(App.class.getResource("gestionCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader10.load();
            GestionClViewController gestionClViewController = loader10.getController();

            gestionClViewController.setApp(this);
            
            Scene scene10 = new Scene(rootLayout);
            primaryStage.setScene(scene10);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openEmpresa() {
        try {
            FXMLLoader loader11 = new FXMLLoader();
            loader11.setLocation(App.class.getResource("empresa.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader11.load();
            EmpresaViewController empresaViewController = loader11.getController();
            empresaViewController.setApp(this);

            Scene scene11 = new Scene(rootLayout);
            primaryStage.setScene(scene11);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionAuto() {
        try {
            FXMLLoader loader12 = new FXMLLoader();
            loader12.setLocation(App.class.getResource("gestionAuto.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader12.load();
            GestionAutoViewController gestionAutoViewController = loader12.getController();
            gestionAutoViewController.setApp(this);

            Scene scene12 = new Scene(rootLayout);
            primaryStage.setScene(scene12);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionCamioneta() {
        try {
            FXMLLoader loader13 = new FXMLLoader();
            loader13.setLocation(App.class.getResource("gestionCamioneta.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader13.load();
            GestionCamionetaViewController gestionCamionetaViewController = loader13.getController();
            gestionCamionetaViewController.setApp(this);

            Scene scene13 = new Scene(rootLayout);
            primaryStage.setScene(scene13);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionMoto() {
        try {
            FXMLLoader loader14 = new FXMLLoader();
            loader14.setLocation(App.class.getResource("gestionMoto.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader14.load();
            GestionMotoViewController gestionMotoViewController = loader14.getController();
            gestionMotoViewController.setApp(this);

            Scene scene14 = new Scene(rootLayout);
            primaryStage.setScene(scene14);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // servicios
    
    public void inicializarData() {
        
        Cliente cliente1 = new Cliente("juan", 12345, 32022, "juan@gmail.com");
        empresa.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("nasly", 12346, 32023, "nasly@gmail.com");
        empresa.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("pedro", 12347, 32024, "pedro@gmail.com");
        empresa.agregarCliente(cliente3);

        /*
        Auto auto1 = new Auto("Toyota", "19827", "2016", "2012", "4");
        empresa.agregarAuto(auto1);
        Auto auto2 = new Auto("Renault", "81826", "2018", "2017", "4");
        empresa.agregarAuto(auto2);
        */

        /* 
        Vehiculo[] arregloVehiculos;
        arregloVehiculos = new Vehiculo[6];
        arregloVehiculos[0] = new Moto("KAWASAKI", "10223", "2015", "2010", Caja.AUTOMATICA);
        arregloVehiculos[1] = new Moto("VIWIS", "42341", "2013", "2009", Caja.MANUAL);
        arregloVehiculos[2] = new Auto("TOYOTA", "81823", "2016", "2012", "4");
        arregloVehiculos[3] = new Auto("SENDERO", "03852", "2017", "2013", "2");
        */
    }

}
