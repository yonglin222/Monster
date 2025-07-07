public class Monstet {
    String name;
    int hp;
    int maxHp;
    int attack;
    int defense;

    public Monstet() {
    }

    public Monstet(String name, int hp, int maxHp, int attack, int defense) {
        this.name = name;
        //maxHp는 생성 시의 hp와 동일한 값으로 초기화해주세요.
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

    //몬스터의 정보를 보여주는 info() 메서드를 만드세요.
    public String info(String name, int hp, int maxHp, int attack, int defense) {
        this.name = name;
//        this.hp = hp;
//        this.maxHp = maxHp;
        String nowhp = this.hp + "/" + this.maxHp;
        this.attack = attack;
        this.defense = defense;

        return  this.name + ", 체력(" + nowhp + "), " + this.attack + ", " + this.defense;
    }
}
