package com.lzb.oop.demo1.player;

import lombok.Data;

@Data
public class Fighter extends Player {
    public Fighter(String name) {
        super(name);
    }
}