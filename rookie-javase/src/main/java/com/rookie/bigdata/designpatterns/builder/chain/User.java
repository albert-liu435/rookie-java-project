package com.rookie.bigdata.designpatterns.builder.chain;

/**
 * @Class User
 * @Description
 * @Author rookie
 * @Date 2023/5/6 17:22
 * @Version 1.0
 */
public class User {
    String id;
    String name;
    String password;
    String phone;

    private User(Builder builder) {
        id = builder.id;
        name = builder.name;
        password = builder.password;
        phone = builder.phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static final class Builder {
        private String id;
        private String name;
        private String password;
        private String phone;

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder password(String val) {
            password = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
