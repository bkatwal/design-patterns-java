package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class RemoteButton {

  private Command command;

  public RemoteButton(Command command){
    this.command = command;
  }

  public void pressButton(){
    command.execute();
  }
}
