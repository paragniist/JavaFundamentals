import java.util.Properties;

public class SystemPropertiesTest{
	public static void main(String[] args){
		String a = System.getProperty("a");
		String b = System.getProperty("b");
		
		
		Properties jvmProperties = System.getProperties();
		jvmProperties.forEach((key, value) -> {
			System.out.println(key + " = " + value);
		});
				
	}
}