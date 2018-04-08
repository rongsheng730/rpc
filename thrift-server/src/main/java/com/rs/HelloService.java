package com.rs;

import org.apache.thrift.TException;

public class HelloService implements Hello.Iface {

  @Override
  public String helloString(String para) throws TException {
    return "result:" + para;
  }
}
