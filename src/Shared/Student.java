package Shared;

import java.io.Serializable;

/**
 * Created by Max Meijer on 04/04/2017.
 * Fontys University of Applied Sciences, Eindhoven
 */
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Student(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
