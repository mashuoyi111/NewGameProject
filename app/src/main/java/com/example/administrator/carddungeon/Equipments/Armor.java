package com.example.administrator.carddungeon.Equipments;

/**
 * Created by Administrator on 2017/1/4.
 */

public abstract class Armor {
    String name;
    int addAtk=0;
    int addDef=0;
    int addMagicAtk=0;
    int addMagicDef=0;
    int addSpd=0;
    int extra=0;

    public Armor(int extraEffect){
        extra=extraEffect;
    }

    public void changeEffect(int extraEffect){
        extra=extraEffect;
    }
}
