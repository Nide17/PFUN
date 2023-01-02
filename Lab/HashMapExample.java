import java.util.HashMap;


public class HashMapExample {
    
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "John");
        map.put("age", "30");
        map.put("job", "programmer");
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("job"));
        System.out.println(map);
    }
}
