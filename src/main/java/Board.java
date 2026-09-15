public class Board {
    Player player;
    Monster monster;
    Boolean isPlayerTurn = true;

    public Board(Player player, Monster monster) {
        this.monster = monster;
        this.player = player;
    }

    public void attack() {
        do {
            if (isPlayerTurn) {
                monster.health -= player.attack;
                isPlayerTurn = false;
                System.out.println("Player attacks monster with " + player.attack + " damage");
            } else {
                player.health -= monster.attack;
                isPlayerTurn = true;
                System.out.println("Monster attacks player with " + monster.attack + " damage");
            }
            System.out.println("Player: " + player.name + " (" + player.health + ")");
            System.out.println("Monster: " + monster.name + " (" + monster.health + ")");
        } while (player.health > 0 && monster.health > 0);
    }

    public void checkWinner() {
        if (player.health <= 0) {
            System.out.println("Monster wins!");
        } else if (monster.health <= 0) {
            player.setLevel(1);
            System.out.println("Player wins! Level Up " + player.level);
        }
    }
}
