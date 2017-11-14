package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
	
	@FXML
	private RadioButton rbMale;
		
	@FXML
	private RadioButton rbFemale;
	
	@FXML
	private RadioButton rbNotToSay;
	
	@FXML
	private Label lbl;
	
	public void SelectEvent(ActionEvent event) {
		String output="";
		
		if (rbMale.isSelected()) {
			output = rbMale.getText();
		} 
		
		if (rbFemale.isSelected()) {
			output = rbFemale.getText();
		} 
		
		if(rbNotToSay.isSelected()) {
			output = rbNotToSay.getText();
		}
		
		lbl.setText("Your gender is " +output);
		
	}

}
