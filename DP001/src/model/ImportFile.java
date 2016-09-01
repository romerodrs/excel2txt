package model;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;

public class ImportFile implements ExcelActions{
    
    public String doAction(File archivo, JTable tablaD){
        String respuesta;
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        try {
        	Workbook wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheet("ENTREGA");
            Iterator<Row> filaIterator = hoja.rowIterator();
            for(int i = 0; i <=3 ; i++){
            	if(filaIterator.hasNext()){
            		filaIterator.next();
            	}
            }
            int indiceFila=-1;
            while (filaIterator.hasNext()) {                
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator<Cell> columnaIterator = fila.cellIterator();
                Object[] listaColumna = new Object[5];
                int indiceColumna=-1;
                int indiceColumnaAux = -1;
                int celdaCont = 0;
                while (columnaIterator.hasNext()) {                    
                    indiceColumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if ((indiceColumna == 0) || (indiceColumna == 1) || (indiceColumna == 2) || (indiceColumna == 5) || (indiceColumna == 10)){
                    	indiceColumnaAux++;
	                    if(indiceFila==0){
	                    	celda.setCellType(1);
	                        modeloT.addColumn(celda.getStringCellValue());
	                    }else{
	                        if(celda!=null){
	                        	celda.setCellType(1);
	                        	listaColumna[indiceColumnaAux]= celda.getStringCellValue();
	                        	// si el valor de celda esta vacio celdaCont ++
	                        	if(celda.getStringCellValue().contentEquals("")){
	                        		celdaCont++;
	                        	}
	                        }
	                    }
                    }
                }
                if((indiceFila!=0) && (celdaCont != 5)) modeloT.addRow(listaColumna);
                if(indiceFila == 15) break;
            }
            respuesta="Importacion exitosa";
        } catch (Exception e) {
        	respuesta = "No se realizo con exito la exportacion, un problema al importar el archivo!" + e.getMessage();
        }
        return respuesta;
    }
}
