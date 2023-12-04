
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
    private Label lblUpdate;
    @FXML
    private ComboBox<String> cmboxRoom;
    @FXML
    private ComboBox<String> cmboxOcc;    
    @FXML
    private Button btnUpdate;
    
    private int availableRooms = 50;
    private int occupants = 0;
    
    //ArrayLists for filling combo boxes
    private ObservableList<String> numList = FXCollections.observableArrayList(
            "1","2","3","4","5");
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmboxRoom.setItems(numList);
        cmboxOcc.setItems(numList);      
    }    
    
    @FXML
    private void handleButton(ActionEvent event){
        switch(cmboxRoom.getValue()){
            case "1":
                availableRooms -= 1;
                break;
            case "2":
                availableRooms -= 2;
                break;
            case "3":
                availableRooms -= 3;
                break;
            case "4":
                availableRooms -= 4;
                break;
            case "5":
                availableRooms -= 5;
                break;
        }
        switch(cmboxOcc.getValue()){
            case "1":
                occupants += 1;
                break;
            case "2":
                occupants += 2;
                break;
            case "3":
                occupants += 3;
                break;
            case "4":
                occupants += 4;
                break;
            case "5":
                occupants += 5;
                break;
        }
        if(availableRooms < 0){
            lblUpdate.setText("Rooms Available: OverBooked by " 
                    + Math.abs(availableRooms) + " rooms" +
                    "\nTotal Occupants: " + occupants);
        }
        else{
            lblUpdate.setText("Rooms Available: " + availableRooms + 
                    "\nTotal Occupants: " + occupants);
        }
    }
    
}
