public class Monster {
    int level;
    int hp;
    int def;

    public Monster(int hp, int def, int level) {
        this.hp = hp;
        this.def = def;
        this.level = level;
    }

    void setHp(int hp){
        this.hp = hp;
    }
}
