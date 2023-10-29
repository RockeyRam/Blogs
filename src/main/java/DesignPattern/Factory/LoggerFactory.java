package DesignPattern.Factory;

public abstract class LoggerFactory {

//    public static ILog getLoggerInstance(String type)
//    {
//        switch (type)
//        {
//            case "console" : return  new ConsoleLogger();
//            case "file" : return new FileLogger();
//        }
//        throw new IllegalArgumentException("Invalid logging type");
//    }

    public abstract ILog CreateLogger();
}
