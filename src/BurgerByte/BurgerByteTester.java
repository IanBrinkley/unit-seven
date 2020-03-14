package BurgerByte;

import org.w3c.dom.ls.LSOutput;

public class BurgerByteTester {
    public static void main(String[] args) {
        Manager susie = new Manager("Susie", 32);
        BurgerByte b1 = new BurgerByte("Portland", susie);
        Cashier joe = new Cashier("Joe", 23, b1);
        FryCook ryan = new FryCook("Ryan", 27, b1);

        System.out.println("Susie's team: " + susie.getTeam());
        System.out.println("Burgerbyte's staff: " + b1.getStaff());

        System.out.println();

        ryan.startWork(6);
        System.out.println("Ryan's wage after working 6 hours: " + ryan.computeWage());
        System.out.println("Joe's wage after working 0 hours: " + joe.computeWage());

        System.out.println();

        susie.fire(joe);
        susie.hire(joe);
        System.out.println("Joe's workplace after being fired and rehired: " + joe.getWorkPlace());
        System.out.println("Susie's workplace: " + susie.getManagingBranch());
    }
}
