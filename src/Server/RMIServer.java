package Server;

import Client.RMIClient;

import java.rmi.registry.Registry;

/**
 * Created by Max Meijer on 04/04/2017.
 * Fontys University of Applied Sciences, Eindhoven
 */
public class RMIServer {

    private boolean createRegistry;
    private int portNumber;
    private String bindingName;
    private Registry registry;

    public RMIServer() {
        createRegistry = true;
        portNumber = 1099;
        bindingName = "StudentAdmin";
        registry = null;
    }

    private Registry createRegistry(int portNumber) {
        return null;
    }

    private void bindStudentAdministrationUsingRegistry() {

    }

    private void bindStudentAdministrationUsingNaming(int portNumber) {

    }

    private void printIPAdresses() {

    }

    public void main(String[] args) {

    }
}
