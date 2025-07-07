package monster;

public class Monster {
    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;

    public Monster() {
    }

    public Monster(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void info() {
        System.out.println("이름:" + name + " 체력:" + hp + "/" + maxHp + " 공격력:" + attack + " 방어력:" + defense);
    }

    public static void main(String[] args) {
        Monster sos = new Monster("sos", 100, 200, 300);
        sos.info();
        System.out.println();
    }
}


