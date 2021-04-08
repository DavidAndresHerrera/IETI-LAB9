package eci.ieti.data.model;


import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String email, name;

    public User( String email, String name) {
        this.email = email;
        this.name = name;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, email='%s', name='%s']",
                id,email,name);
    }
}
