package task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User {
    private String name;
    private long id;

    public User(String name, long id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public static Optional<User> findById(long id, List<User> users){
        Optional<User> result = users.stream()
                .filter(x -> x != null)
                .filter(x -> x.getId() == id)
                .findFirst();
        return result;
    }

}
