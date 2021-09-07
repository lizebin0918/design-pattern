package com.lzb.oop.demo1.player;

import com.lzb.oop.demo1.monster.Monster;
import com.lzb.oop.demo1.weapon.Weapon;
import lombok.Data;

@Data
public abstract class Player {
      Weapon weapon;
      String name;

      public Player(String name) {
            this.name = name;
      }

      public void attack(Monster monster) {
            monster.receiveDamageBy(weapon, this);
      }
}


