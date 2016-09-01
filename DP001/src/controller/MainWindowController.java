package controller;

import java.awt.event.*;
import java.io.*;
import model.*;
import view.DeleteWindow;
import view.MainWindow;
import view.RegisterWindow;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ricardo
 */
public class MainWindowController implements ActionListener{
	private ExcelActions modeloE;
	private MainWindow vistaE;
	private JFileChooser selectArchivo;
	private File archivo;

	public MainWindowController(MainWindow vistaE){
		this.vistaE = vistaE;
		this.vistaE.getjButtonImport().addActionListener(this);
		this.vistaE.getjButtonExport().addActionListener(this);
		this.vistaE.getButtonExit().addActionListener(this);
		this.vistaE.getjButtonConnect().addActionListener(this);
		this.vistaE.getjButtonRegister().addActionListener(this);
		this.vistaE.getjButtonGet().addActionListener(this);
		this.vistaE.getjButtonDelete().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		this.btnDeleteAction(actionEvent);
		this.btnConnectAction(actionEvent);
		this.btnRegisterAction(actionEvent);
		this.btnGetAction(actionEvent);
		this.btnImportAction(actionEvent);
		this.btnExportAction(actionEvent);
		this.btnExitAction(actionEvent);
	}

	private void btnDeleteAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonDelete()){
			DeleteWindow wd = new DeleteWindow();
	        wd.setVisible(true);
		}
	}

	private void btnGetAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonGet()){
			Database db = new Database();
			db.getValues();
		}
	}

	private void btnRegisterAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonRegister()){
			RegisterWindow wr = new RegisterWindow();
			wr.setVisible(true);
		}
	}

	private void btnConnectAction(ActionEvent actionEvent){
		if(actionEvent.getSource() == vistaE.getjButtonConnect()){
			this.vistaE.getjButtonConnect().setEnabled(false);
			this.vistaE.getjButtonDelete().setEnabled(true);
			this.vistaE.getjButtonGet().setEnabled(true);
			this.vistaE.getjButtonRegister().setEnabled(true);
		}
	}

	private void btnExitAction(ActionEvent actionEvent){
		if(actionEvent.getSource() == vistaE.getButtonExit()){
			this.vistaE.dispose();
		}
	}

	private void btnExportAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonExport()){
			this.modeloE = new ExportFile();
			this.selectArchivo = new JFileChooser();
			this.agregarFiltroTXT(selectArchivo);
			if(selectArchivo.showDialog(null, "Exportar")==JFileChooser.APPROVE_OPTION){
				archivo=selectArchivo.getSelectedFile();
				if(archivo.getName().endsWith("txt")){
					JOptionPane.showMessageDialog(null, modeloE.doAction(archivo, vistaE.getJTable()) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));
				}else{
					JOptionPane.showMessageDialog(null, "Elija un formato valido.");
				}
			}
		}
	}

	private void btnImportAction(ActionEvent actionEvent) {
		if(actionEvent.getSource() == vistaE.getjButtonImport()){
			modeloE = new ImportFile();
			selectArchivo = new JFileChooser();
			agregarFiltroXLS(selectArchivo);
			if(selectArchivo.showDialog(null, "Seleccionar archivo")==JFileChooser.APPROVE_OPTION){
				archivo=selectArchivo.getSelectedFile();
				if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
					JOptionPane.showMessageDialog(null, modeloE.doAction(archivo, vistaE.getJTable()) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));
				}else{
					JOptionPane.showMessageDialog(null, "Elija un formato valido.");
				}
			}
		}
	}


	public void agregarFiltroXLS(JFileChooser jFileChooser){
		jFileChooser.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
		jFileChooser.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
	}

	public void agregarFiltroTXT(JFileChooser jFileChooser){
		jFileChooser.setFileFilter(new FileNameExtensionFilter("Text (*.txt)", "txt"));
	}

}
