/**
 * Created by FeeVeX on 16/01/2018.
 */
public class Test {
    static void test(){
        Player player = new Player(1,0,10,2,30);
        Monster mon = new Monster(100,30,1);

        //System.out.println(player.experience);

        player.addEx(Math.round((Math.pow((mon.level * ((mon.level + 1) - (player.level * 0.5))),2)/Math.pow((player.level * 0.2),1.6))));

        System.out.println(player.level);

       // System.out.println((Math.round((Math.pow((mon.level * 1.2),2)/Math.pow((player.level / 1.2),0.5)))));

       // System.out.println(121.1);
        //System.out.println((int)Math.floor((121.1)));

   //     player.attack(mon);

    }
}
