package model;

public class User {
    private String name;
    private  String username;
    private String password;
    private boolean isGameMaster;
    private int userId;

    public User(String name, String username, String password) {
        this.username = username;
        this.password = password;
        this.name=name;
    }
    public User( String username, String password) {
        this.username = username;
        this.password = password;}

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public  String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isGameMaster() {
        return isGameMaster;
    }

    public void setGameMaster(boolean gameMaster) {
        isGameMaster = gameMaster;
    }
}