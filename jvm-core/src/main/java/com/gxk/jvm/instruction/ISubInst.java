package com.gxk.jvm.instruction;

import com.gxk.jvm.rtda.Frame;

public class ISubInst implements Instruction {

  @Override
  public void execute(Frame frame) {
    Integer v2 = frame.popInt();
    Integer v1 = frame.popInt();
    frame.pushInt(v1 - v2);
  }

  @Override
  public String format() {
    return "isub";
  }
}
