package DesignPattern.AbstractFactory;

public class JsonFormatter implements IFormatter{
    @Override
    public String  format(String data) {
        return "JSON Formatted: "+data;
    }
}
