package Services;
import java.util.ArrayList;
import java.util.List;

import Models.User;

public class UserServices {
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
        System.out.println("Usuario adicionado com sucesso!!");
    }

    public void removeUser(String email){
        users.removeIf(users -> users.getEmail().equals(email));
        System.out.println("Usuario removido!!");
    }

    public User searchUser(String email){
        return users.stream()
            .filter(user -> user.getEmail().equals(email))
            .findFirst()
            .orElse(null);
    }

    public void listUsers(){
        if (users.isEmpty()){
            System.out.println("Nenhum usuario cadastrado!!");
        } else {
            users.forEach(System.out::println);
        }
    }
}
