import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Database {
    private final Map<String, User> users;
    
    public Database() {
    	users = new LinkedHashMap<>();
    }
    
    
    public User getUser(String i) {
    	return users.get(i); 
    }
    
    public void insertUser(String i, User user) {
    	users.put(i, user); 
    }
    
    public ArrayList<String> getUserNames() {
    	ArrayList<String> names = new ArrayList<>();
    	
    	Iterator<String> iterator = null;
    	Set hasMapKeys = users.keySet();
    	iterator =  hasMapKeys.iterator();
        while ( iterator.hasNext())
        {
           String key = (String) iterator.next();
	       names.add(users.get(key).getFirst_name());                        	
        }
    	return names; 
    	
    }

}
