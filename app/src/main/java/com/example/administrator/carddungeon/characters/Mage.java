package com.example.administrator.carddungeon.characters;

import com.example.administrator.carddungeon.Equipments.Armor;
import com.example.administrator.carddungeon.Equipments.Armors.DirtyCloth;
import com.example.administrator.carddungeon.Equipments.Weapon;
import com.example.administrator.carddungeon.Equipments.Weapons.WoodWand;

/**
 * Created by Administrator on 2017/1/4.
 */

public class Mage extends Character {

    static final String roleName="Warrior";
    static final int initialMaxHP = 80;
    static final int initialAtk=2;
    static final int initialDef=2;
    static final int initialMagicAtk=11;
    static final int initialMagicDef=4;
    static final Weapon initialWeapon=new WoodWand(0);
    static final Armor initialArmor=new DirtyCloth(0);
    static final int initialSpd=5;

    int MaxHP;
    int atk;
    int MagicAtk;
    int def;
    int MagicDef;
    int currectHP;
    int spd;
    Weapon weapon;
    Armor armor;

    public Mage(){
        super();
    }
}
