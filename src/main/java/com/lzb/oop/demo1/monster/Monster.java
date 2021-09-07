package com.lzb.oop.demo1.monster;

import com.lzb.oop.demo1.player.Player;
import com.lzb.oop.demo1.weapon.Weapon;
import lombok.Data;

@Data
public abstract class Monster {
    Long health;
    String name;

    public Monster(Long health, String name) {
        this.health = health;
        this.name = name;
    }

    public void receiveDamageBy(Weapon weapon, Player player) {
        this.health -= weapon.getDamage(); // 基础规则
    }
}



