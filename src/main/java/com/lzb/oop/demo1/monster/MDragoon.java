package com.lzb.oop.demo1.monster;

import com.lzb.oop.demo1.player.PDragoon;
import com.lzb.oop.demo1.player.Player;
import com.lzb.oop.demo1.weapon.Weapon;

public class MDragoon extends Monster {

    public MDragoon(Long health, String name) {
        super(health, name);
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (player instanceof PDragoon) {
            this.setHealth(this.getHealth() - weapon.getDamage() * 2); // 龙骑伤害规则
        }
        // else no damage, 龙免疫力规则
    }
}