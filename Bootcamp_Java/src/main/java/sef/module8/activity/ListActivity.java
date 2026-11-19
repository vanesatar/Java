package sef.module8.activity;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        print(names);
    }
    static void print(List list) {
        for (Object name : list) {
            IO.println(name);
        }
    }
}
