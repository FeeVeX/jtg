public class Player {
    int level;
    float experience;
    int health;
    int mana;
    int stamina;
    int rage;

    int attack = 2;

    void attack(Monster mon){
        mon.setHp((int)((mon.hp) - ((attack/(mon.level * 0.3F)) * (mon.def * 0.001))));
    }


















}
