public class TileFactory {
    public Player CreatePlayer(String input) {
        switch (input) {
            case "0":
                return new Briber('@', "Tyrion Lannister", 200, 15, 4, 35);
            case "1":
                return new Warrior('@', "Jon Snow", 300, 30, 4, 3);
            case "2":
                return new Warrior('@', "The Hound", 400, 20, 6, 5);
            case "3":
                return new Mage('@', "Melisandre", 100, 5, 1, 300, 30, 15, 5, 6);
            case "4":
                return new Mage('@', "Thoros of Myr", 250, 25, 4, 150, 20, 20, 3, 4);
            case "5":
                return new Rogue('@', "Arya Stark", 150, 40, 2, 20);
            case "6":
                return new Rogue('@', "Bronn", 250, 35, 3, 50);
            case "7":
                return new Hunter('@', "Ygritte", 220, 30, 2, 6);
        }
        return null;
    }

    public Enemy CreateEnemy(Position pos, char input)  {
        switch (input) {
            case 's':
                return new Monster(pos, 's', "Lannister Solider", 80, 8, 3, 25, 3);
            case 'k':
                return new Monster(pos, 'k', "Lannister Knight", 200, 14, 8, 50, 4);
            case 'q':
                return new Monster(pos, 'q', "Queen's Guard", 400, 20, 15, 100, 5);
            case 'z':
                return new Monster(pos, 'z', "Wright", 600, 30, 15, 100, 3);
            case 'b':
                return new Monster(pos, 'b', "Bear-Wright", 1000, 75, 30, 250, 4);
            case 'g':
                return new Monster(pos, 'g', "Giant-Wright", 1500, 100, 40, 500, 5);
            case 'w':
                return new Monster(pos, 'w', "White Walker", 2000, 150, 50, 1000, 6);
            case 'B':
                return new Trap(pos, 'B', "Bonus Trap", 1, 1, 1, 250, 1, 10);
            case 'Q':
                return new Trap(pos, 'Q', "Queen's Trap", 250, 50, 10, 100, 3, 10);
            case 'D':
                return new Trap(pos, 'D', "Death Trap", 500, 100, 20, 250, 1, 10);
        }
        return null;
    }
}
