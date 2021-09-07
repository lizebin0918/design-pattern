package com.lzb.oop.demo1.monster;

import com.lzb.oop.demo1.player.Player;
import com.lzb.oop.demo1.weapon.Weapon;

/**
 * 兽人
 */
public class Orc extends Monster {
    public Orc(Long health, String name) {
        super(health, name);
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (weapon.getDamageType() == 0) {
            this.setHealth(this.getHealth() - weapon.getDamage() / 2); // Orc的物理防御规则
        } else {
            super.receiveDamageBy(weapon, player);
        }
    }
}


