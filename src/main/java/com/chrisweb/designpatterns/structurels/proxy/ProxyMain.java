package com.chrisweb.designpatterns.structurels.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("alii", "passwd");

        try {
            commandExecutor.executeCommand("rm some folder");
            commandExecutor.executeCommand("ls -a ");
            //commandExecutor.executeCommand("rm some folder");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
