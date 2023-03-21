package Java_Stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L1_Streams {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"vale"));
        users.add(new User(2,"Hale"));
        users.add(new User(3,"jale"));
        users.add(new User(4,"Dale"));
        users.add(new User(5,"Kale"));
        users.add(new User(6,"Bale"));

        /**  FOR EACH  */
        users.stream().forEach(user ->
        {
            System.out.println(user.toString());
            System.out.println("Java 8");
        }
        );

        users.stream().forEach(user ->user.talk());
        users.stream().forEach(User::talk);

        /** Filter - count */
        Long count = users.stream().filter(user -> user.id>4).count();
        System.out.println(count);

        /** Filter - Collect */
        List<User> filteredList = users.stream().filter(user -> user.id>4).collect(Collectors.toList());
        filteredList.stream().forEach(User::talk);


        /** Map - Collect */
        System.out.println("Map List");
        users.stream().map(user -> new User(user.id+100, user.name)).collect(Collectors.toList()).forEach(User::talk);
        users.stream().map(user -> new User(user.id+100, user.name)).collect(Collectors.toList()).forEach(user -> System.out.println(user.toString()));

        /** Collectors-toMap */
        Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
        userMap.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}

class User{
    int id;
    String name;

    public User(int id, String name){
        this.id= id;
        this.name = name;
    }

    public String toString(){
        return "User [id=" + id + ", name=" + name + "]";
    }

    public void talk(){
        System.out.println("Hi, I am " + this.name);
    }
}
