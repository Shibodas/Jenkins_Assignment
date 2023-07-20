package Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j {
	public static boolean root =false;
	public static Logger getLogger(Class cls)
	{
		if(root)
		{
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/resources/log4j.properties");
		root =true;
		return Logger.getLogger(cls);
	}

}
