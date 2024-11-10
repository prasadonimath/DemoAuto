package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
	
	public static String getProperty(String name) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/Files/Prop.txt");
		Properties configProp=new Properties();
		configProp.load(file);
		return (String) configProp.get(name.toLowerCase());
	
}
	


}
