package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.stage.FileChooser;
import poker.app.MainApp;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    private Menu mnuGame;
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	 
		//Sets Game Type for 5 Card Stud
		RadioMenuItem item1 = (RadioMenuItem) mnuGame.getItems().get(0);
        item1.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(1);              
            }            
          });
        
      //Sets Game Type for 5 Card Stud One Joker
        RadioMenuItem item2 = (RadioMenuItem) mnuGame.getItems().get(1);
        item2.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
            	mainApp.setiGameType(2);              
            }            
        });
        
       //Sets Game Type for 5 Card Two Joker
      	RadioMenuItem item3 = (RadioMenuItem) mnuGame.getItems().get(2);
        item3.selectedProperty().addListener(new ChangeListener(){
             @Override
             public void changed(ObservableValue arg0, Object arg1, Object arg2) {
            	 mainApp.setiGameType(3);              
             }            
        });
              
        
        //Sets Game Type for Texas Hold'em
      	RadioMenuItem item4 = (RadioMenuItem) mnuGame.getItems().get(3);
        item4.selectedProperty().addListener(new ChangeListener(){
        	@Override
        	public void changed(ObservableValue arg0, Object arg1, Object arg2) {
        		mainApp.setiGameType(4);              
            }            
         });
		
        //Sets Game Type for Omaha
      	RadioMenuItem item5 = (RadioMenuItem) mnuGame.getItems().get(4);
        item5.selectedProperty().addListener(new ChangeListener(){
        	@Override
        	public void changed(ObservableValue arg0, Object arg1, Object arg2) {
        		mainApp.setiGameType(5);              
            }            
         });
        
      //Sets Game Type for Deuces Wild
      	RadioMenuItem item6 = (RadioMenuItem) mnuGame.getItems().get(5);
        item6.selectedProperty().addListener(new ChangeListener(){
            @Override
             public void changed(ObservableValue arg0, Object arg1, Object arg2) {
            	mainApp.setiGameType(6);              
             }            
         });
        
      //Sets Game Type for Aces and Eights
      	RadioMenuItem item7 = (RadioMenuItem) mnuGame.getItems().get(6);
        item7.selectedProperty().addListener(new ChangeListener(){
        	@Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
        		mainApp.setiGameType(7);              
            }            
         });
        
      //Sets Game Type for Seven Draw
      	RadioMenuItem item8 = (RadioMenuItem) mnuGame.getItems().get(7);
        item8.selectedProperty().addListener(new ChangeListener(){
        	@Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
        		mainApp.setiGameType(8);              
            }            
         });
		
        
		
	}
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Creates an empty address book.
     */
    @FXML
    private void handleNew() {
    }

    /**
     * Opens a FileChooser to let the user select an address book to load.
     */
    @FXML
    private void handleOpen() {
    }

    /**
     * Saves the file to the person file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Bert Gibbons");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowBirthdayStatistics() {
    }




}