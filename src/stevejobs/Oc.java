package stevejobs;

import java.io.File;

import net.sourceforge.lept4j.util.LoadLibs;
import net.sourceforge.tess4j.Tesseract;

public class Oc {

	public static void main(String[] args) throws Exception
	{
	  File fo=LoadLibs.extractNativeResources("tessdata");
	  Tesseract obj = new Tesseract();
	  obj.setDatapath(fo.getAbsolutePath());
	  File f=new File("Capture1.png");
	  //obj.setLanguage("eng");
	  String r=obj.doOCR(f);
	  Thread.sleep(20000);
	  System.out.println(r);

	}

}
