package com.chrisweb.designpatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String login, String password) {
        isAdmin = "ali".equals(login) && "passw".equals(password);
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.executeCommand(cmd);
        } else {
            if (cmd.contains("rm")) {
                throw new Exception("You don't have access to execute this command.");
            } else {
                commandExecutor.executeCommand(cmd);
            }
        }
    }
}
