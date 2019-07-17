package entity;

public class User {
    private String username;
    private String password;
    private String name;
    private int position;

    public User() {
    }

    public User(String username, String password, String name, int position) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
