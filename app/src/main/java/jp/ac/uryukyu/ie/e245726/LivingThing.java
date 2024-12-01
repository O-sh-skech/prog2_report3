package jp.ac.uryukyu.ie.e245726;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

       //getterメソッド
    /**
     * 名前を取得します。
     *
     * @return 名前
     */
    public String getName() {
        return this.name;
        }
    
    /**
     * 体力を取得します。
     *
     * @return 体力の値
     */
    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * 攻撃力を取得します。
     *
     * @return 攻撃力
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * 死亡しているかどうかを取得します。
     *
     * @return 死亡している場合は true、それ以外は false
     */
    public boolean isDead(){
        return this.dead;
    }

    //setterメソッド
    /**
     * 名前を変更します。
     * @param _n 変更したい名前を入れてください
     */
    public void setName(String _n){
        this.name=_n;
    }
    /**
     * 体力を変更します。
     * @param _h 変更したい体力の値を入れてください
     */
    public void setHitPoint(int _h){
        this.hitPoint = _h;
    }
    /**
     * 攻撃力を変更します。
     * @param _a 変更したい攻撃力の値を入れてください。
     */
    public void setAttack(int _a){
        this.attack = _a;
    }
    /**
     * 死亡判定を変更します。
     * @param _d 死亡ならtrue、生存ならfalseを入れてください。
     */
    public void setDead(boolean _d){
        this.dead = _d;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名前
     * @param maximumHP HP
     * @param attack 攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    
    
    public void attack(LivingThing opponent){
        if(dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.name, damage);
            opponent.wounded(damage);
            }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }
   
}
