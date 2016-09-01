package model;
import java.io.*;
import javax.swing.*;


public class ExportFile implements ExcelActions{
    
    public String doAction(File archivo, JTable tablaD){
        String respuesta;
        try {
            BufferedWriter bfw = new BufferedWriter(new FileWriter(archivo));

            for (int i = 0 ; i < tablaD.getRowCount(); i++){ //realiza un barrido por filas.
                for(int j = 0 ; j < tablaD.getColumnCount();j++){ //realiza un barrido por columnas.
                    bfw.write((String)(tablaD.getValueAt(i,j)));
                    if (j < tablaD.getColumnCount() -1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        bfw.write(";");
                    }
                }
                bfw.newLine(); //inserta nueva linea.
            }
            bfw.close(); //cierra archivo!
            respuesta = "El archivo fue salvado correctamente!";
        } catch (Exception e) {
        	respuesta = "No se realizo con exito la exportacion, ocurrio un problema al exportar el archivo!" + e.getMessage();
        }
        return respuesta;
    }

}
