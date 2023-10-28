package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry implements IRegistry {
    private Map<String, Object> registry = new HashMap<>();


    @Override
    public void addToRegistry(String key, Object object) {
        registry.put(key,object);
    }

    @Override
    public Object getRegistry(String key) {
        return registry.get(key);
    }
}
