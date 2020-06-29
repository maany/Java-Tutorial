import com.java.tutorial.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<Tutorial> tutorials = new ArrayList<>();

    Application(){
        this.registerTutorial(new IntroductionToStrings());
        this.registerTutorial(new Loops());
//        this.registerTutorial(new UserInput());
        this.registerTutorial(new IntroToArray());
        this.registerTutorial(new MultiDimensionalArrays());
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
            tut.run();
            System.out.println("*****************************");
            System.out.println();
        }
    }
}
