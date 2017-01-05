package com.example.administrator.carddungeon.Cards.Monsters;

import com.example.administrator.carddungeon.Cards.LiveObject;

/**
 * Created by Administrator on 2017/1/4.
 */
public class Goblin extends LiveObject {
    static final String name="Goblin";
    static final int initialMaxHP=30;
    static final boolean magicAtk=false;
    static final int initialAtk=2;
    static final int initialDef=0;
    static final int initialSpd=4;
    int MaxHP;
    int currentHP;
    int atk;
    int def;
    int spd;

    public Goblin(){
        super();
    }
}
