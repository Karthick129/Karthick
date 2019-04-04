package library;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class data {
		public static Properties prop=new Properties();
		public static void datacalling() throws IOException
		{
		String datapath="D:\\Karthick java\\xpath\\src\\xpath\\data.properties";
	    FileInputStream fis=new FileInputStream(datapath);
	    prop.load(fis);
		}
	    

	}



