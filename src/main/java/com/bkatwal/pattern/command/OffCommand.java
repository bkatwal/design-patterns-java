package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class OffCommand implements Command {

  private IDevice iDevice;

  public OffCommand(IDevice iDevice) {
    this.iDevice = iDevice;
  }

  @Override public void execute() {
    iDevice.off();
  }
}
