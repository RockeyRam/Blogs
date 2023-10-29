package DesignPattern.AbstractFactory;

public class ConsoleLogger implements ILog{
    @Override
    public void log(String data) {
        System.out.println("Logging in console: "+ data);
    }
}
