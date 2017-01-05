package com.example.administrator.carddungeon.characters;

import com.example.administrator.carddungeon.Equipments.Armor;
import com.example.administrator.carddungeon.Equipments.Weapon;
import com.example.administrator.carddungeon.Equipments.Weapons.WoodWand;

/**
 * Created by Administrator on 2017/1/4.
 */

public abstract class Character {
    String roleName;
    int initialMaxHP;
    int initialAtk;
    int initialDef;
    int initialMagicAtk;
    int initialMagicDef;
    int initialSpd;
    Weapon initialWeapon;
    Armor initialArmor;
    int MaxHP;
    int atk;
    int MagicAtk;
    int def;
    int MagicDef;
    int currectHP;
    int spd;
    Weapon weapon;
    Armor armor;

    public Character(){
        MaxHP=initialMaxHP;
        atk=initialAtk;
        MagicAtk=initialMagicAtk;
        def=initialDef;
        MagicDef=initialMagicDef;
        currectHP=initialMaxHP;
        weapon=initialWeapon;
        armor=initialArmor;
        spd=initialSpd;
    }

}
