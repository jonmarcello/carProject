/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nathan
 */
public class NewCarprojectController implements Initializable {
    @FXML private TextField makeTextField;
    @FXML private TextField modelTextField;
    @FXML private TextField yearTextField;
    @FXML private TextField milageTextField;
    @FXML private TextField askingPriceTextField;
    @FXML private Button newCarButton;
    @FXML private RadioButton carRadioButton;
    @FXML private RadioButton motorcycleRadioButton;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
