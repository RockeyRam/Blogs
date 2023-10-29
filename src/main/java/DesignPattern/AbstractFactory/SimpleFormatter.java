package DesignPattern.AbstractFactory;

public class SimpleFormatter implements IFormatter{
    @Override
    public String format(String data) {
        return "Simple Formatted: "+data;
    }
}
