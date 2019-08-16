package net.it.demopoi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ejemplo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "Programmers.xlsx"; 

	    String sheetName = "Our Programmers";

	    XSSFWorkbook wb = new XSSFWorkbook();
	    XSSFSheet sheet = wb.createSheet(sheetName) ;

	    //iterando para el número de filas
	    for (int r=0;r < 3; r++ )
	    {
	        XSSFRow row = sheet.createRow(r);

	        //iterando para el número de columnas
	        for (int c=0;c < 3; c++ )
	        {
	            XSSFCell cell = row.createCell(c);

	            cell.setCellValue("Desarrollador en la fila: "+r+" y columna: "+c);
	        }
	    }

	    try(FileOutputStream fos = new FileOutputStream(fileName))
	    {
	        wb.write(fos);
	        fos.flush();
	        fos.close();
	    }

	}

}
