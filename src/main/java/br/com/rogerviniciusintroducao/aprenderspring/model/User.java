package br.com.rogerviniciusintroducao.aprenderspring.model;


public class User {
    private int id;
    private String fullName;
    private String nickName;
    private String password;
    private byte age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    
    
}
