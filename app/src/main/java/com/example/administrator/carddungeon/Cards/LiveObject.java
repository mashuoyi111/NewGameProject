package com.example.administrator.carddungeon.Cards;

/**
 * Created by Administrator on 2017/1/4.
 */
public abstract class LiveObject extends Card {
    static final boolean attackable=true;
    static final boolean moveable=true;
    static final boolean canAttack=true;
    boolean magicAtk;
    int initialMaxHP;
    int initialAtk;
    int initialDef;
    int initialSpd;
    int MaxHP;
    int currentHP;
    int atk;
    int def;
    int spd;

    public LiveObject(){
        currentHP=initialMaxHP;
        MaxHP=initialMaxHP;
        atk=initialAtk;
        def=initialDef;
        spd=initialSpd;
    }
}
