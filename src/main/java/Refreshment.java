public class Refreshment {
    public static void main(String[] args) {
        var player1 = new Player("Killa");
        System.out.println(player1.getExperience());

        var monster1 = new Monster("Goblin");
        System.out.println(monster1.getExperience());

        var boardGame = new Board(player1, monster1);
//        boardGame.attack();
//        boardGame.checkWinner();

        player1.setAttack(10);
        boardGame.attack();
        boardGame.checkWinner();
    }
}
