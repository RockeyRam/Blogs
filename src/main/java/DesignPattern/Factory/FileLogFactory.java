package DesignPattern.Factory;

public class FileLogFactory extends LoggerFactory{

    @Override
    public ILog CreateLogger() {
        return new FileLogger();
    }
}
