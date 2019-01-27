package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

	public int countWords(String words){
		String[] separateWords = StringUtils.split(words,' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
    
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
		int count = app.countWords("I have four words");
		System.out.println("Count: " + count);
    }
}