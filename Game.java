import java.util.*; 
public class Game{
    //play
    //pick winner
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2){
      this.player1 = player1;
      this.player2 = player2;
    }

    public void play(){
      Scanner in = new Scanner(System.in);
      String play = "y"; 
      while(!play.equals("n")){
        String choice1 = player1.choice();
        String choice2 = player2.choice();

        int winner = pickWinner(choice1, choice2);

        if(winner == 0){
          player1.addScore();
        } 
        if(winner == 1){
          player2.addScore();
        }

        System.out.println("Do you want to play again \n y for yes and n for no");
        play = in.next();
      }
      if(player1.getScore() > player2.getScore()){
        System.out.println(player1.getName() + " is the winner.");
      } else if(player1.getScore() < player2.getScore()){
         System.out.println(player2.getName() + " is the winner.");
      }
      else{
        System.out.println("We have a tie");
      }
    }

  //0 win for player1
  // 1 win for player2

  public int pickWinner(String choice1, String choice2){
    if(choice1.equals("rock") && choice2.equals("scissors")){
      return 0;
    }
    else if(choice1.equals("scissors") && choice2.equals("paper")){
      return 0;
    }
    else if(choice1.equals("paper")&& choice2.equals("rock")){
    return 0; 
  }
  else if(choice1.equals("paper") && choice2.equals("paper")){
    return 2; 
  } 
  else if(choice1.equals("rock") && choice2.equals("rock")){
    return 2;
  }
   else if(choice1.equals("scissors") && choice2.equals("scissors")){
    return 2;
  }
    
    return 1;
  

}

}