package DesignPattern.Factory;

public class ClientApplication {

    public void getProducts()
    {
        String logData = "DEBUG: void getProduct()";

//        //Console logger
//        ConsoleLogger consoleLogger = new ConsoleLogger();
//        consoleLogger.log(logData);
//
//        //File logger
//        FileLogger fileLogger = new FileLogger();
//        fileLogger.log(logData);

//        String logType = "console";
//        ILog logger = LoggerFactory.getLoggerInstance(logType);
//        logger.log(logData);

        ConsoleLogFactory console = new ConsoleLogFactory();
        ILog logger = console.CreateLogger();
        logger.log(logData);

        FileLogFactory file = new FileLogFactory();
        ILog fileLogger = file.CreateLogger();
        fileLogger.log(logData);
    }
}
