package model;

public class User {
    private  String username;
    private String password;
    private boolean isGameMaster;
    private int userId;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
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