package org.example;

public class InfoAccount {
    private String nickname;

    private String city;
    private int age;

    private String email;

    public InfoAccount() {

    }
    public InfoAccount(String nickname, String city, int age, String email) {
        this.nickname = nickname;
        this.city = city;
        this.age = age;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "InfoAccount {" +
                "name=" + nickname +
                ", age=" + age + ", city=" + city + "," + "email=" + email +
                "}";
    }
}
