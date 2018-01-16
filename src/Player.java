public class Player {

    int level;
    long experience;
    int health;
    int mana;
    int attack;

    public Player(int level, long experience, int mana, int attack, int health) {
        this.level = level;
        this.experience = experience;
        this.mana = mana;
        this.attack = attack;
        this.health = health;
    }

    void addEx(long exp){
        experience += exp;
        checkLevel();
    }

    void checkLevel(){
        int n = 100;
        int x = 100;

        for(int i = 1; i < 31; i++){
            if(experience >= x){
                level=i;
            }
            x += (int) Math.round((n+(n*1.05))/1.7);
            n = (int) Math.round((n+(n*1.05))/1.7);
        }
    }

    void attack(Monster mon){
      //mon.setHp
        System.out.println((int)((mon.hp) - ((attack/(mon.level * 0.3F)))));
    }


















}
