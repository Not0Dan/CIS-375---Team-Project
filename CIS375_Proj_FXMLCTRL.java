
package cis375_proj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class CIS375_Proj_FXMLCTRL implements Initializable {

    @FXML
    private Label lblTotal;
    @FXML
    private ComboBox cmboxRoom;
    @FXML
    private ComboBox cmboxOcc;
    @FXML
    private ComboBox cmboxStyle;
    @FXML
    private CheckBox chboxEarly;
    @FXML
    private CheckBox chboxBfast;
    @FXML
    private Button btnTotal;
    
    //ArrayLists for filling combo boxes
    private ObservableList<String> numList = FXCollections.observableArrayList(
            "1","2","3","4","5");
    private ObservableList<String> bedList = FXCollections.observableArrayList(
            "King","Queen", "Double", "Twin");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmboxRoom.setItems(numList);
        cmboxOcc.setItems(numList);
        cmboxStyle.setItems(bedList);        
    }    
    
    @FXML
    private void handleButton(ActionEvent event){
        
    }
    
}
