package com.gxk.jvm.instruction;

import com.gxk.jvm.rtda.Frame;

public class LDivInst implements Instruction {

  @Override
  public void execute(Frame frame) {
    long v2 = frame.popLong();
    long v1 = frame.popLong();
    frame.pushLong(v1 / v2);
  }
}