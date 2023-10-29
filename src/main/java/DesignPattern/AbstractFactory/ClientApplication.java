package DesignPattern.AbstractFactory;

public class ClientApplication {


    public void Run()
    {
        LoggerFactory factory = new ConsoleFactory();
        ILog consoleLog = factory.CreateLogger();
        IFormatter simpleFormat = factory.CreateFormatter();

        String data = "Test";
        consoleLog.log(simpleFormat.format(data));

        factory = new FileFactory();
        ILog fileLog = factory.CreateLogger();
        IFormatter formatter = factory.CreateFormatter();

        fileLog.log(formatter.format(data));

    }
}
