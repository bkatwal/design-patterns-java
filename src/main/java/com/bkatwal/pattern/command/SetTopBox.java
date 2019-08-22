package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class SetTopBox implements IDevice{


  @Override public void on() {
    System.out.println("SetTopBox is on!");
  }

  @Override public void off() {
    System.out.println("SetTopBox is off!");
  }
}
