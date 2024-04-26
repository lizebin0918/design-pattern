package com.lzb.vistor.dp;

/**
 * <br/>
 * Created on : 2024-04-04 18:33
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        // 组合模式
        Commander commander = new Commander(
                new Sergeant(new Soldier(), new Soldier(), new Soldier()),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );

        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }

}
