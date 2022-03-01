
  
import java.util.ArrayList;
import java.util.Random;
public class JokeManager {
    private ArrayList<String> jokeslist;
    
    public JokeManager(){
        this.jokeslist = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokeslist.add(joke);
    }
    
    public String drawJoke(){
        if(jokeslist.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        return jokeslist.get(draw.nextInt(this.jokeslist.size()));
    }
    
    public void printJokes(){
        for(String joke: this.jokeslist){
            System.out.println(joke);
        }
    }
}