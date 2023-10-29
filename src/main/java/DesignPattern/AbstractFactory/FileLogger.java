package DesignPattern.AbstractFactory;

public class FileLogger implements ILog{
    @Override
    public void log(String data) {
        System.out.println("Logging in file: "+ data);
    }
}
