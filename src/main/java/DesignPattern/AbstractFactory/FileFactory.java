package DesignPattern.AbstractFactory;

public class FileFactory implements LoggerFactory{
    @Override
    public ILog CreateLogger() {
        return new FileLogger();
    }

    @Override
    public IFormatter CreateFormatter() {
        return new JsonFormatter();
    }
}
