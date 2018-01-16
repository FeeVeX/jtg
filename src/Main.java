public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Monster mon = new Monster();

        player.attack(mon);

        System.out.println(mon.hp);
    }
}
