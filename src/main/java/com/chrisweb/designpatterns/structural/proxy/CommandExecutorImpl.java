package com.chrisweb.designpatterns.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void executeCommand(String cmd) throws Exception {
        System.out.println("Command " + " * " + cmd + " * " + " was succesfully executed");
    }
}
