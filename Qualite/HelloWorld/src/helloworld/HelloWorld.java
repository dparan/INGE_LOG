package helloworld;
import java.util.logging.*;

public class HelloWorld {

	public static void main(String[] args){
		 Logger l = Logger.getLogger("logs");
		 l.log(Level.INFO, "Hello World !"); 
		}

}
