import com.java.tutorial.IntroductionToStrings;
import com.java.tutorial.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<Tutorial> tutorials = new ArrayList<>();

    Application(){
        this.registerTutorial(new IntroductionToStrings());
    }
    public static void main(String[] args){
        Application app = new Application();
        app.run();
    }
    public void registerTutorial(Tutorial tut){
        this.tutorials.add(tut);
        System.out.println("Registered " + tut.name);
    }
    public void run(){
        for (Tutorial tut: this.tutorials){
            System.out.println("Running " + tut.name);
            tut.run();
        }
    }
}
