package com.lzb.oop.demo1.weapon;

import lombok.Data;

/**
 * 法杖
 */
@Data
public class Staff extends Weapon {
    public Staff(int damage, int damageType) {
        super(damage, damageType);
    }
}