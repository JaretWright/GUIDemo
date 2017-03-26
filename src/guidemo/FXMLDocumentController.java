package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author jwright
 */
public class FXMLDocumentController implements Initializable {
    
    //These items are for the CheckBox example
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    //These items are for the ChoiceBox example
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    /**
     * This will update the Label for the ChoiceBox
     */
    public void choiceBoxButtonPushed()
    {
        choiceBoxLabel.setText("My favourite fruit is:\n"+choiceBox.getValue().toString());
    }
    
    /**
     * This is for the CheckBox example
     */
    public void pizzaOrderButtonPushed()
    {
        String order = "Toppings are:";
        
        if (pineappleCheckBox.isSelected())
            order += "\npineapple";

        if (pepperoniCheckBox.isSelected())
            order += "\npepperoni";
        
        if (baconCheckBox.isSelected())
            order += "\nbacon";

        this.pizzaOrderLabel.setText(order);
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pizzaOrderLabel.setText("");
        
        //This items are for configuring the ChoiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges","pears","strawberries");
        choiceBox.setValue("apples");
        
    }    
    
}
