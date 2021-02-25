import java.util.*;

public class Player{
  //name
  //score
  //addscore
  //resetscore
  //get name score
  private String name;
  private int score;

  public Player(String name){
    this.name = name;
    score = 0;
  }
  public void addScore(){
    score++;
}

public void resetScore(){
  score = 0;
}
public int getScore(){
  return score;
}

public String getName(){
  return name; 
}

public String choice(){
  Scanner in = new Scanner(System.in);
  HashMap<Integer,String> map = new HashMap<>();
  map.put(1,"rock");
  map.put(2,"paper");
  map.put(3, "scissors");

  System.out.println("Choose 1 for rock \t 2 for paper \t 3 for scissors");
  int choice = in.nextInt();

  return map.get(choice);
}


}