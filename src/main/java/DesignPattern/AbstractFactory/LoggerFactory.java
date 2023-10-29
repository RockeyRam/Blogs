package DesignPattern.AbstractFactory;

public interface LoggerFactory {
    ILog CreateLogger();
    IFormatter CreateFormatter();
}
