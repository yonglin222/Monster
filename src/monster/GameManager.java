package monster;

public class GameManager {
    public static void main(String[] args) {
        Monster slime = new Monster("슬라임", 30, 8, 3);
        Monster oak = new Monster("오크", 40, 12, 5);

        slime.info();
        oak.info();

        // 한 몬스터의 hp가 0 이하가 될 때까지 전투를 계속하는 while 반복문을 만드세요.
        while (slime.getHp() > 0 && oak.getHp() > 0) {
            attack(slime, oak);
            if (oak.getHp() <= 0) break;
            attack(oak,slime);
            if (slime.getHp() <= 0) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public static void attack(Monster attacker, Monster defender) {
        int damage = attacker.getAttack() - defender.getDefense();
        if (damage < 0) damage = 0;

        int newHp = defender.getHp() - damage;
        if (newHp < 0) newHp = 0;

        defender.setHp(newHp);
        System.out.println(attacker.getName() + "이 " + defender.getName() + "을 공격했습니다. 피해얄: " + damage);
        System.out.println(defender.getName() +"의 남은 체력: " + newHp);
    }



        //<추가>
        //전투가 너무 순식간에 끝나버리면 재미가 없죠.
        //공격을 주고받는 턴 사이에 잠시 멈춤(딜레이)을 주면 훨씬 더 박진감 넘치는 전투 과정을 볼 수 있습니다.
        //
        //Thread.sleep() 메서드를 사용하면 되고, try-catch 문으로 감싸주어야 합니다.
        //sleep 기능을 구현하는 코드는 다음과 같습니다.
        //try {
        //    // 1000 밀리초 = 1초 동안 실행을 멈춥니다.
        //    Thread.sleep(1000);
        //} catch (InterruptedException e) {
        //    // sleep 도중 방해를 받았을 때 처리할 코드를 여기에 작성할 수 있습니다.
        //    // 지금은 비워두어도 괜찮습니다.
        //    e.printStackTrace();
        //}


}
