package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
public class Application {
    
	public void greeat(){
		List<String> greatings = new ArrayList<>();
		greatings.add("Hello");
		
		for(String greating : greatings){
			System.out.println("Greating: " + greating);
		}
	}
	
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greeat();
    }
}