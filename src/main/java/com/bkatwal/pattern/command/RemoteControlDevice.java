package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */

/**
 * This is remote control class as remote can have multiple buttons
 * you can have multiple commands here
 */
public class RemoteControlDevice {

  private RemoteButton tvOnButton;

  private RemoteButton tvOffButton;

  private RemoteButton setTopBoxOnButton;

  private RemoteButton setTopBoxOffButton;

  public RemoteControlDevice() {
    tvOnButton = new RemoteButton(new OnCommand(new TV()));
    tvOffButton = new RemoteButton(new OffCommand(new TV()));
    setTopBoxOnButton = new RemoteButton(new OnCommand(new SetTopBox()));
    setTopBoxOffButton = new RemoteButton(new OffCommand(new SetTopBox()));
  }

  //As remote can have multiple buttons you can have multiple such commands

  public RemoteButton tvOnButton() {
    return tvOnButton;
  }

  public RemoteButton tvOffButton() {
    return tvOffButton;
  }

  public RemoteButton setTopBoxOnButton() {
    return setTopBoxOnButton;
  }

  public RemoteButton setTopBoxOffButton() {
    return setTopBoxOffButton;
  }

}
