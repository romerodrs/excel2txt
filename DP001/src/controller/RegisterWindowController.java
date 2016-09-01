package controller;

import java.awt.event.*;
import model.*;
import view.RegisterWindow;

public class RegisterWindowController implements ActionListener{
	private RegisterWindow vistaE;

	public RegisterWindowController(RegisterWindow vistaE){
		this.vistaE = vistaE;
		this.vistaE.getjButtonCancel().addActionListener(this);
		this.vistaE.getjButtonRegister().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		this.btnRegisterAction(actionEvent);
		this.btnCancelAction(actionEvent);
	}


	private void btnRegisterAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonRegister()){
			Database db = new Database();
			db.insertData(vistaE.getjTextFieldOF().getText(),
					vistaE.getjTextFieldOC().getText(),
					vistaE.getjTextFieldReferencia().getText(),
					vistaE.getjTextFieldCantidad().getText());
			this.vistaE.dispose();
		}
	}

	private void btnCancelAction(ActionEvent actionEvent){
		if(actionEvent.getSource() == vistaE.getjButtonCancel()){
			this.vistaE.dispose();
		}
	}


}
