package Client;

import Shared.IStudentAdmin;

import java.rmi.registry.Registry;

/**
 * Created by Max Meijer on 04/04/2017.
 * Fontys University of Applied Sciences, Eindhoven
 */
public class RMIClient {
    private boolean locateRegistry;
    private String bindingName;
    private Registry registry;
    private IStudentAdmin studentAdmin;

    public RMIClient(String ipAdress, int portNumber) {
        locateRegistry = true;
        bindingName = "StudentAdmin";
        registry = null;
        studentAdmin = null;
    }

    private Registry locateRegistry(String ipAdress, int portNumber) {
        return null;
    }

    private void printContentsRegistry() {
    }

    private IStudentAdmin bindStudentAdministrationUsingRegistry() {
        return null;
    }

    private IStudentAdmin bindStudentAdministrationUsingNaming(String ipAdress, int portNumber) {
        return null;
    }

    private void testStudentAdministration() {

    }

    public void main(String[] args) {

    }
}
