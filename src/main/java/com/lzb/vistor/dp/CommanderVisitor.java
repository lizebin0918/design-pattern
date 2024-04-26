package com.lzb.vistor.dp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommanderVisitor implements UnitVisitor {

  @Override
  public void visit(Soldier soldier) {
    // Do nothing
  }

  @Override
  public void visit(Sergeant sergeant) {
    // Do nothing
  }

  @Override
  public void visit(Commander commander) {
    log.info("Good to see you {}", commander);
  }
}