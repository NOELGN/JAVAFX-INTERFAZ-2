package edu.tesji.envios.controlador;

import com.jfoenix.controls.JFXTextField;
import com.noe.paqueteria.Paqueteria;
import java.awt.Toolkit;
import java.util.Optional;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class EnviosController {
    
    @FXML private Label lbl1;
    @FXML private Label lbl2;
    @FXML private Label lbl3;
    @FXML private Label lbl4;
    @FXML private Label lbl5;
    @FXML private JFXTextField txtPeso;
    
    @FXML
    void unoMuaseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.norte(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }        
    @FXML
    void dosMuaseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.central(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }    
    @FXML
    void tresMuaseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.sur(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }    
    @FXML
    void cuatroMuaseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.europa(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }    
    @FXML
    void cincoMuaseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.asia(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }
    @FXML
    void norteMauseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.norte(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }
    @FXML
    void centralMauseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.central(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }
    @FXML
    void surMauseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.sur(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }    
    @FXML
    void europaMauseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.europa(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }
    @FXML
    void asiaMauseMoved(MouseEvent event) {
        try{
        double n1 = Double.parseDouble(txtPeso.getText());
        lbl1.setText(String.valueOf(Paqueteria.asia(n1)));
        }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Taller JavaFX");
            alert.setHeaderText(null);
            alert.setContentText("Ingresa el peso del producto ");
            alert.showAndWait();
        }
    }
    @FXML
    void btnNuevo(ActionEvent event) {
        lbl1.setText(null);
        lbl2.setText(null);
        lbl3.setText(null);
        lbl4.setText(null);
        lbl5.setText(null);   
        txtPeso.setText(null);
    }

    @FXML
    void btnSalir(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Paqueteria-Tesji");
            alert.setHeaderText("Si sales se cancelara tu envio!!");
            alert.setContentText("¿En realidad deseas salir?");
            Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK) {
                    Platform.exit();
                }else{ 
                    event.consume();
                }        
    }
    @FXML
    void pesoKeyTyped(KeyEvent chismoso) {
        char c = chismoso.getCharacter().charAt(0);
        if(Character.isLetter(c)){
            chismoso.consume();
            Toolkit.getDefaultToolkit().beep();
        } 
        
    }
}
