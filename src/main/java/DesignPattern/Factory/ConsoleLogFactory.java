package DesignPattern.Factory;

public class ConsoleLogFactory extends LoggerFactory{
    @Override
    public ILog CreateLogger() {
        return new ConsoleLogger();
    }
}
