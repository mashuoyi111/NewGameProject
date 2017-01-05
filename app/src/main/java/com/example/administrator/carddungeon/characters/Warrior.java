package com.example.administrator.carddungeon.characters;

import com.example.administrator.carddungeon.Equipments.Armor;
import com.example.administrator.carddungeon.Equipments.Armors.DirtyCloth;
import com.example.administrator.carddungeon.Equipments.Weapon;
import com.example.administrator.carddungeon.Equipments.Weapons.IronSword;

/**
 * Created by Administrator on 2017/1/4.
 */

public class Warrior extends Character {

    static final String roleName="Warrior";
    static final int initialMaxHP = 100;
    static final int initialAtk=10;
    static final int initialDef=5;
    static final int initialMagicAtk=1;
    static final int initialMagicDef=3;
    static final Weapon initialWeapon=new IronSword(0);
    static final Armor initialArmor=new DirtyCloth(0);
    static final int initialSpd=6;
    int MaxHP;
    int atk;
    int MagicAtk;
    int def;
    int MagicDef;
    int currectHP;
    int spd;
    Weapon weapon;
    Armor armor;

    public Warrior(){
        super();
    }
}
