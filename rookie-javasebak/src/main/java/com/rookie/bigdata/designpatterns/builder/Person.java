package com.rookie.bigdata.designpatterns.builder;

/**
 * @Class Person
 * @Description
 * @Author rookie
 * @Date 2023/5/6 14:59
 * @Version 1.0
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;


    public static class PersonBuilder {
        private Person person;

        public PersonBuilder(Person person) {
            this.person = person;
        }

        public PersonBuilder(int id, String name) {
            person.setId(id);
            person.setName(name);
        }

        public PersonBuilder age(int val) {
            person.setAge(val);
            return this;
        }

        public PersonBuilder sex(String val) {
            person.setSex(val);
            return this;
        }

        public PersonBuilder phone(String val) {
            person.setPhone(val);
            return this;
        }

        public PersonBuilder address(String val) {
            person.setAddress(val);
            return this;
        }

        public PersonBuilder desc(String val) {
            person.setDesc(val);
            return this;
        }

        public Person build() {
            return person;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder(new Person());
    }


}
