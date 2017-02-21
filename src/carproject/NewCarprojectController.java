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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.controlsfx.control.CheckComboBox;

/**
 * FXML Controller class
 *
 * @author Nathan
 */
public class NewCarprojectController implements Initializable {
    @FXML private ComboBox makeComboBox;
    @FXML private TextField modelTextField;
    @FXML private TextField yearTextField;
    @FXML private TextField milageTextField;
    @FXML private TextField askingPriceTextField;
    @FXML private CheckComboBox featuresComboBox;
    @FXML private Button newCarButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeComboBox.getItems().addAll("honda","gm","volkswagon", "audi");
        featuresComboBox.getItems().addAll("faster engine", "hybrid", "heated seats", "adaptive cruse control", "leather seats");
    }    
    
    public void createNewCarbuttonPushed()
   {
       Car newCar = new Car (makeComboBox.getValue().toString(), 
               modelTextField.getText(), 
               Integer.parseInt(yearTextField.getText()), 
               Integer.parseInt(milageTextField.getText()), 
               Double.parseDouble(askingPriceTextField.getText()),
               (String[])featuresComboBox.getCheckModel().getCheckedItems().toArray());
       System.out.printf("The new vehicle is $s$n", newCar); 
   }
    
}
