package Shared;

import java.rmi.Remote;

/**
 * Created by Max Meijer on 04/04/2017.
 * Fontys University of Applied Sciences, Eindhoven
 */
public interface IStudentAdmin extends Remote {

    public int getNumberOfStudents();

    public Student getStudent(int nr);

    public Student addStudent(String firstName, String lastName, int birthYear);
}
