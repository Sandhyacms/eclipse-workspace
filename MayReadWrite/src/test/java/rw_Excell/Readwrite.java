package rw_Excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readwrite {

	public static void main(String[] args) throws IOException {
		// readxlData();
		 writexlData();
	}
	public static void writexlData() throws IOException {
			File file=new File("C:\\Users\\sandh_ctyq64n\\Downloads\\May16-2022.xls");
			FileInputStream fs=new FileInputStream(file);
			HSSFWorkbook wb=new HSSFWorkbook(fs);
			HSSFSheet sheet=wb.getSheet("May2022");
			sheet.createRow(0).createCell(0).setCellValue("sandhya");
			sheet.createRow(1).createCell(1).setCellValue("shailendra");
			sheet.createRow(2).createCell(0).setCellValue("shreshta");
			sheet.createRow(3).createCell(1).setCellValue("shaurya");
			sheet.createRow(4).createCell(0).setCellValue("anushka");
			sheet.createRow(5).createCell(0).setCellValue("shiv");
			sheet.createRow(6).createCell(0).setCellValue("aadya");
			FileOutputStream fo=new FileOutputStream(file);
			wb.write(fo);
			fo.flush();
			fo.close();
			System.out.println("completd");
		}
	
	
	
	
	public static void readxlData() throws IOException {
		FileInputStream fs=new FileInputStream(new File("C:\\Users\\sandh_ctyq64n\\Downloads\\May16-2022.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet =wb.getSheet("data1");
		int rowCount = sheet.getLastRowNum()+1;
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][]data=new String [rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				int cellType=sheet.getRow(i).getCell(j).getCellType();
				if(cellType==HSSFCell.CELL_TYPE_NUMERIC)
				{
					int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
					data[i][j]=String.valueOf(val);
				}
				else
					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++){
			System.out.print(data[i][j]+ " ");	
			}
			System.out.println();
		}
	}

	
	
	
	
	

}

