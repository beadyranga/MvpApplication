package com.rawtechworld.mvpapplication.main_activity.presenter;

import com.rawtechworld.mvpapplication.main_activity.model.User;

public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateUserDetails(String fullName,String email){
        user.setFullName(fullName);
        user.setEmail(email);
        view.updateUserInfoDetails(user.toString());

    }

    public interface View{
        void updateUserInfoDetails(String info);

    }
}
