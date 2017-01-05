package com.example.administrator.carddungeon.Cards;

/**
 * Created by Administrator on 2017/1/4.
 */
// a card on board
public abstract class Card {
    boolean attackable;
    boolean movable;
    boolean canAttack;
    String name;

    public String showName(){
        return "acs";
    }

}
