package com.lzb.oop.demo1.weapon;

import lombok.Data;

@Data
public abstract class Weapon {
    int damage;
    int damageType; // 0 - physical, 1 - fire, 2 - ice etc.

    public Weapon(int damage, int damageType) {
        this.damage = damage;
        this.damageType = damageType;
    }
}