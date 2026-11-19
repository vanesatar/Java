package sef.module8.activity;
import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "John");
        map.put("2", "Harry");
        map.put("3", "Daniel");
        map.put("4", "Stacie");

        MapActivity obj = new MapActivity();
        obj.print(map);
    }
    void print(Map map) {
        for (Object key : map.keySet()) {
            IO.println("ID: " + key + " | Name: " + map.get(key));
        }
    }
}
