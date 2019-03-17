import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Alignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class If_else {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("jxl.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(1);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//open same excel for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(1);
		WritableCellFormat cf=new WritableCellFormat();
		
		cf.setAlignment(Alignment.GENERAL);
		cf.setBackground(Colour.BLUE);
		
		for(int i=1;i<nour;i++)
		{
			String 	v1=rsh.getCell(0,i).getContents();
			String v2=rsh.getCell(1,i).getContents();
			int x=Integer.parseInt(v1);
			int y=Integer.parseInt(v2);
			if(x>y)
			{
				Label l1=new Label(nouc,i,"x is greater,Test passed");
						wsh.addCell(l1);
						
			}
			else  if(x<y)
			{
						Label l2=new Label(nouc ,i,"y is greater,Test passed");
						wsh.addCell(l2);
			}
			else
			{
				Label l3=new Label(nouc,i,"Both are equal");
				wsh.addCell(l3);
			}
		     }
		wwb.write();
		wwb.close();
		rwb.close();
		
		
		

	}

}
