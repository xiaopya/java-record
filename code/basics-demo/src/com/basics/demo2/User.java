package com.basics.demo2;

import java.time.LocalDate;

/**
 * @projectName: code
 * @package: com.basics.demo2
 * @className: User
 * @author: chenYongLong
 * @description: TODO
 * @date: 2024/1/19 19:40
 * @version: 1.0
 */
public class User {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthday;

    public User(){

    }

    public User(Long id, String name, String gender, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
