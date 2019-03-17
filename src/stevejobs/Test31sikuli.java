package stevejobs;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Test31sikuli {

	public static void main(String[] args) throws SikuliException
	{
		Screen s=new Screen();
		s.click("Captur.PNG");
		s.doubleClick("Comp.PNG");
		s.click("Close.PNG");
	}

}
