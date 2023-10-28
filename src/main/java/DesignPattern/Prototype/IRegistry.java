package DesignPattern.Prototype;

public interface IRegistry {
    void addToRegistry(String key,Object object);
    Object getRegistry(String key);
}
