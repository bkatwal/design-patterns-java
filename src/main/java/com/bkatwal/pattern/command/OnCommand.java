package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class OnCommand implements Command {

  private IDevice iDevice;

  public OnCommand(IDevice iDevice) {
    this.iDevice = iDevice;
  }

  @Override public void execute() {
    iDevice.on();
  }
}
