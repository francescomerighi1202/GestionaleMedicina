package Control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ControllerLoginPaziente {

    @FXML
    private Label titoloPannelloLogin;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button backButton;
    @FXML
    private Button loginButton;

    @FXML
    private void bottoneIndietro(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/SceltaLogin.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception ePatientLogin) {
            ePatientLogin.printStackTrace();
        }

    }
    @FXML
    private void bottoneLoginPaziente(ActionEvent event) {

        String username = usernameField.getText();
        String password = passwordField.getText();
    }


    // Paziente login CSS
    public void initialize() {
        titoloPannelloLogin.getStyleClass().add("title-login");
        usernameLabel.getStyleClass().add("username-label");
        passwordLabel.getStyleClass().add("password-label");
        usernameField.getStyleClass().add("username-field");
        passwordField.getStyleClass().add("password-field");
        backButton.getStyleClass().add("back-button");
        loginButton.getStyleClass().add("login-button");
    }

}