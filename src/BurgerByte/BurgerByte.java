package BurgerByte;

import java.util.ArrayList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private List<Employee> staff;
    private boolean isOpen;

    public BurgerByte(String locn, Manager m) {
        location = locn;
        manager = m;
        staff = new ArrayList<Employee>();
        staff.add(m);
        m.setManagingBranch(this);
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() { return staff; }
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : staff) {
            e.leaveWork();
        }
    }

    // EFFECTS: adds employee e to staff
    public void addStaff(Employee e) {
        staff.add(e);
    }

    // EFFECTS: removes employee e from staff
    public void removeStaff(Employee e) {
        staff.remove(e);
    }

    // EFFECTS: prints out all the employees' names and their wages
    public void computeStaffWages() {
        for (Employee e : staff) {
            System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
        }
    }
}