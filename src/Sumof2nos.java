import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Sumof2nos {

	public static void main(String[] args) throws Exception
	{
	   File f=new File("Sum1.xls");
	   Workbook rwb=Workbook.getWorkbook(f);
	   Sheet rsh=rwb.getSheet(0);
	   int nour=rsh.getRows();
	   int nouc=rsh.getColumns();
	   WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	   WritableSheet wsh=wwb.getSheet(0);
	   for(int i=1;i<nour;i++)
	   {
		   String x=rsh.getCell(0,i).getContents();
		   String y=rsh.getCell(1,i).getContents();
		   int x1=Integer.parseInt(x);
		   int y1=Integer.parseInt(y);
		   int z1=x1+y1;
		   String z=Integer.toString(z1);
		   Label l=new Label(nouc,i,z);
		   wsh.addCell(l);
	   }
	   wwb.write();
	   wwb.close();
	   rwb.close();
	   
	  
	   
	   

	}

}
