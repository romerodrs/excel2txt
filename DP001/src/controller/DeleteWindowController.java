package controller;

import java.awt.event.*;
import model.*;
import view.DeleteWindow;

public class DeleteWindowController implements ActionListener{
	private DeleteWindow vistaE;

	public DeleteWindowController(DeleteWindow vistaE){
		this.vistaE = vistaE;
		this.vistaE.getjButtonErase().addActionListener(this);
		this.vistaE.getjButtonCancel().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		this.btnEraseAction(actionEvent);
		this.btnCancelAction(actionEvent);
	}

	private void btnEraseAction(ActionEvent actionEvent){
		if(actionEvent.getSource() == vistaE.getjButtonErase()){
			Database db = new Database();
			db.deleteRecord( vistaE.getjTextFieldID().getText());
			this.vistaE.dispose();
		}
	}

	private void btnCancelAction(ActionEvent actionEvent){
		if(actionEvent.getSource() == vistaE.getjButtonCancel()){
			this.vistaE.dispose();
		}
	}


}
