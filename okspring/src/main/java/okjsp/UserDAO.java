package okjsp;
 

import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

public class UserDAO {
    
    static List<User> list = new ArrayList<User>() ;
    
    public static void save(User user) {
        // TODO Auto-generated method stub
        list.add(user);
    }
    
    public static int size() {
        return list.size();
    }
    
//    static Map<String, User> list = new H;
//    
//    public static void save(User user) {
//        list.put(user.getId(), user);
//    }
//    
//    public static int size() {
//        return list.size();
//    }
//    
}
