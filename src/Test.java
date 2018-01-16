/**
 * Created by FeeVeX on 16/01/2018.
 */
public class Test {
    static void test(){
        Player player = new Player(1,0,10,2,30);
        Monster mon = new Monster(100,30,2);

        player.addEx(100);
        player.addEx(100);
        player.addEx(100);
        player.addEx(100);

       // System.out.println(121.1);
        //System.out.println((int)Math.floor((121.1)));

   //     player.attack(mon);

        System.out.println(player.level);
    }
}
