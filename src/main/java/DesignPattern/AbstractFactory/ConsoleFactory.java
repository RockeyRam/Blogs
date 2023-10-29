package DesignPattern.AbstractFactory;

public class ConsoleFactory implements LoggerFactory{
    @Override
    public ILog CreateLogger() {
        return new ConsoleLogger();
    }

    @Override
    public IFormatter CreateFormatter() {
        return new SimpleFormatter();
    }
}
