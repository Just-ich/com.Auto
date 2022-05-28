package Map;

import java.util.HashMap;
import java.util.Map;

public class User {


    private String name;
    private String lastName;
    private int age;
    private String phoneNumber;



    public User(String name, String lastName, int age, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
