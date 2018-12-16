package com.example.deepak.mvpdemo;

public class LoginInteractorImp implements ILoginInteractor {
    LoginInteractorImp() {
    }


    @Override
    public String login(String username, String Password) {
        if (username.equals("deepak") && Password.equals("admin"))
            return "success";
        else
            return "fail";
    }
}
