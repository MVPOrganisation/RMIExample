package Server;

import Shared.IStudentAdmin;
import Shared.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Created by Max Meijer on 04/04/2017.
 * Fontys University of Applied Sciences, Eindhoven
 */
public class StudentAdmin extends UnicastRemoteObject implements IStudentAdmin {

    private ArrayList<Student> students;

    protected StudentAdmin() throws RemoteException {
        students = new ArrayList<>();
    }

    @Override
    public int getNumberOfStudents() {
        return 0;
    }

    @Override
    public Student getStudent(int nr) {
        return null;
    }

    @Override
    public Student addStudent(String firstName, String lastName, int birthYear) {
        return null;
    }
}
