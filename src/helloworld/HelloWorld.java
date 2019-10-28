package helloworld;
import java.util.logging.Logger;

public class HelloWorld {
	Logger logger = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		logger.log("Hello World!");
	}

}
