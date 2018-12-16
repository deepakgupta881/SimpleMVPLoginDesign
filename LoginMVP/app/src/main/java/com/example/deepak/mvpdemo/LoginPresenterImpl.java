package com.example.deepak.mvpdemo;

public class LoginPresenterImpl implements ILoginPresenter {
    private ILoginView view;
    private LoginInteractorImp loginInteractorImp;

    LoginPresenterImpl(ILoginView view) {
        this.view = view;
        this.loginInteractorImp=new LoginInteractorImp();
    }

    @Override
    public void attemptLogin(String username, String pass) {
//        if (username.equals("deepak") && pass.equals("admin"))
            view.showToast(loginInteractorImp.login(username,pass));
//        else view.showError();
    }
}
