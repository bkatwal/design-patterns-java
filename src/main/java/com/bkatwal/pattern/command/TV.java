package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class TV implements IDevice {

  @Override public void on() {
    System.out.println("TV is on!");
  }

  @Override public void off() {
    System.out.println("TV is off!");
  }
}
