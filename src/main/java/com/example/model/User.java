package com.example.model;

import java.io.Serializable;

/**
 * 
 **/
public class User implements Serializable{
	private static final long serialVersionUID = -1L;
    /**  **/
    private java.lang.Long userId;
    /** 密码 **/
    private java.lang.String passWord;
    /** 姓名 **/
    private java.lang.String name;
    
    public User() {
		// TODO Auto-generated constructor stub
	}
    
    
    public User(String passWord, String name) {
		super();
		this.passWord = passWord;
		this.name = name;
	}


	public java.lang.Long getUserId(){
        return userId;
    }
    public void setUserId(java.lang.Long userId){
        this.userId = userId;
    }
    public java.lang.String getPassWord(){
        return passWord;
    }
    public void setPassWord(java.lang.String passWord){
        this.passWord = passWord;
    }
    public java.lang.String getName(){
        return name;
    }
    public void setName(java.lang.String name){
        this.name = name;
    }
}