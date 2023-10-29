package DesignPattern.Factory;

public class ConsoleLogger implements ILog{

    public void log(String data)
    {
        System.out.println("logging in console..." + data);
    }
}
