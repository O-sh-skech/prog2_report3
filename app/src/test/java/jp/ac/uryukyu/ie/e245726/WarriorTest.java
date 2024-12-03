package jp.ac.uryukyu.ie.e245726;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /*
     * Warriorクラスからオブジェクトを生成する。
     * attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     */
    @Test
    void attackTest(){
        Warrior demoHero = new Warrior("ニセ勇者", 10, 10);
        Enemy slime = new Enemy("スライムもどき", 1000, 0);
        for (int i = 0; i < 3; i++){
            demoHero.attackWithWeponSkill(slime);
            assertEquals(1.5*demoHero.getAttack(), 1000-slime.getHitPoint());
            slime.setHitPoint(1000);
        }



    }
    
}
