package cookies;

import java.sql.SQLOutput;

public class OrderApp {
    /*
        The OrderApp Class

        Add 4 orders
        Total the boxes purchased
        Show the list
        Remove a variety and give feedback on how many boxes were removed
        Show the updated list*/
    public static void main(String[] args) {
        CookieOrder order1 = new CookieOrder("Thin Mints", 4);
        CookieOrder order2 = new CookieOrder("Thin Mints", 2);
        CookieOrder order3 = new CookieOrder("Tagalongs", 5);
        CookieOrder order4 = new CookieOrder("Thin Mints", 1);

        MasterOrder master = new MasterOrder();

        master.addOrder(order1);
        master.addOrder(order2);
        master.addOrder(order3);
        master.addOrder(order4);

        master.showOrder();

        master.removeVariety("Thin Mints");
        System.out.println("After removal");

        master.showOrder();

        System.out.println(master.getOrders().size());
        System.out.println(master.getTotalBoxes());

        System.out.println("total orders: " + master.getOrders().size());
        System.out.println("total boxes: "+ master.getTotalBoxes());
    }
}
