package Models;

public class User {
    private String name;
    private int age;
    private String email;
    private String password;
    

    public User(String name, int age, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usuario{ Nome='" + name + "', Email='" + email + "', Idade=" + age + " }";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return email.equals(user.email);
    }
    
    @Override
    public int hashCode() {
        return email.hashCode();
    }
    
}
