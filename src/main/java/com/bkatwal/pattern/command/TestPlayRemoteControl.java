package com.bkatwal.pattern.command;

/**
 * created by bikas katwal on 22/08/19
 */
public class TestPlayRemoteControl {

  public static void main(String[] args) {

    RemoteControlDevice remoteControlDevice = new RemoteControlDevice();

    remoteControlDevice.tvOnButton().pressButton();

    remoteControlDevice.tvOffButton().pressButton();

    remoteControlDevice.setTopBoxOnButton().pressButton();

    remoteControlDevice.setTopBoxOffButton().pressButton();
  }
}
