package com.lzb;

import com.lzb.oop.demo1.monster.MDragoon;
import com.lzb.oop.demo1.player.Fighter;
import com.lzb.oop.demo1.weapon.Staff;
import com.lzb.oop.demo1.weapon.Sword;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BattleTest {

    @Test
    @DisplayName("Dragon is immune to attacks")
    public void testDragonImmunity() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword(10, 1);
        fighter.setWeapon(sword);
        MDragoon dragon = new MDragoon(100L, "Dragon");

        // When
        fighter.attack(dragon);

        // Then
        // assertThat(dragon.getHealth()).isEqualTo(100));
        assert dragon.getHealth() == 100L;
    }

    @Test
    public void testEquip() {
        Fighter fighter = new Fighter("Hero");

        Sword sword = new Sword(10, 1);
        fighter.setWeapon(sword);

        Staff staff = new Staff(10, 0);
        fighter.setWeapon(staff);

        //assertThat(fighter.getWeapon()).isInstanceOf(Staff.class); // 错误了
        assert fighter.getWeapon().getClass() == Staff.class;
    }

    /*@Test
    @DisplayName("Dragoon attack dragon doubles damage")
    public void testDragoonSpecial() {
        // Given
        MDragoon dragoon = new MDragoon("Dragoon");
        Sword sword = new Sword("Excalibur", 10);
        dragoon.setWeapon(sword);
        Dragon dragon = new Dragon("Dragon", 100L);

        // When
        dragoon.attack(dragon);

        // Then
        assertThat(dragon.getHealth()).isEqualTo(100 - 10 * 2);
    }

    @Test
    @DisplayName("Orc should receive half damage from physical weapons")
    public void testFighterOrc() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword("Excalibur", 10);
        fighter.setWeapon(sword);
        Orc orc = new Orc("Orc", 100L);

        // When
        fighter.attack(orc);

        // Then
        assertThat(orc.getHealth()).isEqualTo(100 - 10 / 2);
    }

    @Test
    @DisplayName("Orc receive full damage from magic attacks")
    public void testMageOrc() {
        // Given
        Mage mage = new Mage("Mage");
        Staff staff = new Staff("Fire Staff", 10);
        mage.setWeapon(staff);
        Orc orc = new Orc("Orc", 100L);

        // When
        mage.attack(orc);

        // Then
        assertThat(orc.getHealth()).isEqualTo(100 - 10);
    }*/
}