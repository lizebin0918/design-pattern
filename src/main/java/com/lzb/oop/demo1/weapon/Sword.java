package com.lzb.oop.demo1.weapon;

import lombok.Data;

/**
 * 剑
 */
@Data
public class Sword extends Weapon {
    public Sword(int damage, int damageType) {
        super(damage, damageType);
    }
}