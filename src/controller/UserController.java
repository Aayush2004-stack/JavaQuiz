package controller;

import dao.UserDAO;
import model.User;
import view.GameMasterView;
import view.PlayerView;

public class UserController {
    private  UserDAO userdao = new UserDAO();

    public boolean signUp(String username, String password)
    {

        User user = new User(username, password);
        return userdao.insertUser(user); //returns either true or false
    }
    public boolean logIn(String username, String password){

        User user=new User(username,password);

        if(userdao.getUser(user)!=null){
            if(user.isGameMaster()){
                GameMasterView.view(user);
            }
            else{
                PlayerView.view(user);
            }
            return true;
        }
        else {
            return false;
        }
    }
}