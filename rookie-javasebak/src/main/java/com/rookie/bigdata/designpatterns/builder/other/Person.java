package com.rookie.bigdata.designpatterns.builder.other;

/**
 * @ClassName Person
 * @Description Person
 * @Author
 * @Date 2020/4/15 16:30
 * @Version 1.0
 */
public class Person {

    private String name;
    private int age;
    private String address;
    private String idCard;

    public Person() {

    }

    public Person(String name, int age, String address, String idCard) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idCard = idCard;
    }


    public static SelfBuilder self() {
        return new SelfBuilder();
    }

    public static class SelfBuilder {
        private String name;
        private int age;
        private String address;
        private String idCard;

        public SelfBuilder buildName(String name) {
            this.name = name;

            return this;
        }

        public SelfBuilder buildAge(int age) {
            this.age = age;
            return this;
        }

        public SelfBuilder buildAddress(String address) {
            this.address = address;
            return this;
        }

        public SelfBuilder buildIDCard(String idCard) {
            this.idCard = idCard;
            return this;

        }

        public Person build() {
            Person person = new Person();
            person.address = address;
            person.name = name;
            person.idCard = idCard;
            person.age = age;
            return person;
        }


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
