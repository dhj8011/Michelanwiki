package com.example.scitmaster.michelanwiki.Model;

/**
 * Created by SCITMASTER on 2018-07-17.
 */

public class Member {

    private String Id;
    private String Password;
    private String Nickname;

    public Member(){

    }

    public Member(String Id, String Password, String Name){
        this.Id=Id;
        this.Password=Password;
        this.Nickname=Name;
    }

    public String getId() {
        return Id;
    }

    public String getPassword() {
        return Password;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setNickname(String name) {
        Nickname = name;
    }

    @Override
    public String toString() {
        return "Id="+Id+", Password="+Password+", Nickname="+Nickname+" ";
    }
}
