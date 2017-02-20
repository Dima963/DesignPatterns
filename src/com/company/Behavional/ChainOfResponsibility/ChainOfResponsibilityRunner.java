package com.company.Behavional.ChainOfResponsibility;

public class ChainOfResponsibilityRunner {

    public static void main(String[] args) {

        Logger smsLogger = new SMSLogger(Logger.ERR);
        smsLogger.writeMessage("Every think all right", Logger.Info);
        smsLogger.writeMessage("System have error", Logger.ERR);

        Logger fileLogger = new FileLogger(Logger.Debug);
        fileLogger.writeMessage("All right Level error", Logger.ERR);
        fileLogger.writeMessage("All right Level info", Logger.Info);
        fileLogger.writeMessage("All right Level debug", Logger.Debug);

        smsLogger.setNext(fileLogger);

    }
}
