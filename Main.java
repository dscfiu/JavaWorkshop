class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Azhar");
    Player player2 = new Player("Clement");

    Game game = new Game(player1, player2);
    game.play();
}
}