/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import modelo.Operaciones;

/**
 * FXML Controller class
 *
 * @author Propietario
 */
public class OperacionesControlador implements Initializable {

    @FXML
    private Button btnOperar;
    @FXML
    private TextField txtfNum1;
    @FXML
    private TextField txtfNum2;
    @FXML
    private RadioButton rdbSuma;
    @FXML
    private RadioButton rdbDivision;
    @FXML
    private RadioButton rdbMultiplicacion;
    @FXML
    private RadioButton rdbResta;
    @FXML
    private TextField txtResultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup tg = new ToggleGroup();
        this.rdbSuma.setToggleGroup(tg);
        this.rdbResta.setToggleGroup(tg);
        this.rdbMultiplicacion.setToggleGroup(tg);
        this.rdbDivision.setToggleGroup(tg);
        
        
    }    

    @FXML
    private void operar(ActionEvent event) {
        
        try {
            int op1 = Integer.parseInt(this.txtfNum1.getText());
            int op2 = Integer.parseInt(this.txtfNum2.getText());
        
            Operaciones op = new Operaciones(op1, op2);
            //truco poner  + "" para que pase como string
            if (this.rdbSuma.isSelected()){
                this.txtResultado.setText(op.suma()+"");
            }else if (this.rdbResta.isSelected()){
                this.txtResultado.setText(op.resta()+"");
            }else if (this.rdbMultiplicacion.isSelected()){
                this.txtResultado.setText(op.multiplicacion()+"");
            }else if(this.rdbDivision.isSelected()){
              
                if (op2 == 0){
                    
                    Alert alert = new Alert (Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("El numero 2 no puede ser 0");
                    alert.showAndWait();
                    
                }else {
                    this.txtResultado.setText(op.division()+"");
                }
              
            }
            
            
                    
        } catch (NumberFormatException e) {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
        
        
    }
    
}
