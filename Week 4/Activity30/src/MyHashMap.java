//**************************************************************
// Activity 30 - hashmaps part 1 of 2
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This class implements a HashMap data structure and provides
// methods to add, remove, and get key/value pairs, as well as
// to display all key/value pairs. The keys and values are both
// strings. To use this class, create an instance of it and then
// call its methods to manipulate the HashMap.
//*****************************************************************


import java.util.HashMap;

public class MyHashMap {
    private HashMap<String, String> map;

    public MyHashMap() {
        map = new HashMap<String, String>();
    }

    public void add(String key, String value) {
        map.put(key, value);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public String getValue(String key) {
        return map.get(key);
    }

    public void display() {
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
