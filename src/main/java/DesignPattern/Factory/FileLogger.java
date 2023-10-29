package DesignPattern.Factory;

public class FileLogger implements ILog {

    public void log(String data)
    {
        System.out.println("File logging..."+ data);
    }
}
