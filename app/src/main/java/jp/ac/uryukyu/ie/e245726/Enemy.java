package jp.ac.uryukyu.ie.e245726;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    //getterメソッド
    /**
     * 敵の名前を取得します。
     *
     * @return 敵の名前
     */
    public String getName() {
        return this.name;
        }
    
    /**
     * 敵の体力を取得します。
     *
     * @return ヒットポイント
     */
    public int getHitpoint() {
        return this.hitPoint;
    }

    /**
     * 敵の攻撃力を取得します。
     *
     * @return 攻撃力
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * 敵が死亡しているかどうかを取得します。
     *
     * @return 死亡している場合は true、それ以外は false
     */
    public boolean getDead() {
        return this.dead;
    }

    //setterメソッド
    /**
     * 敵の名前を変更します。
     * @param _n 変更したい名前を入れてください
     */
    public void setName(String _n){
        this.name=_n;
    }
    /**
     * 敵の体力を変更します。
     * @param _h 変更したい体力の値を入れてください
     */
    public void setHitPoint(int _h){
        this.hitPoint = _h;
    }
    /**
     * 敵の攻撃力を変更します。
     * @param _a 変更したい攻撃力の値を入れてください。
     */
    public void setAttack(int _a){
        this.attack = _a;
    }
    /**
     * 敵の死亡判定を変更します。
     * @param _d 死亡ならtrue、生存ならfalseを入れてください。
     */
    public void setDead(boolean _d){
        this.dead = _d;
    }


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if(dead == false){
            int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        hero.wounded(damage);
            }
        }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
