package testngprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mydataprovider {
	@DataProvider(name="requiredword")
	public static Object[][] testdata()
	{
		return new Object[][]
				{
				{"moon"},
		           {"sky stars"},
		           {"water"}
				};
	}
}
