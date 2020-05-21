package cookies;
/* The MasterOrder Class will maintain a list of cookies being purchased

Declare your ArrayList and name it orders
Create an empty constructor and the following methods
public void addOrder(CookieOrder theOrder) add an order to the list showing variety and quantity
public int getTotalBoxes() keep track of total boxes ordered
public void removeVariety(String variety) give the ability to pick out a variety of cookie and remove it from the list. Hint: When you remove something the list will shrink, you need to consider this when traversing your collection (you don't want to overlook any items)
public int getVarietyBoxes(String variety) returns the total boxes of a given variety.
public void showOrder() to traverse and print the ArrayList*/

import java.util.ArrayList;

public class MasterOrder {

    ArrayList<CookieOrder> orders = new ArrayList<>();

    public MasterOrder() {
    }

    public ArrayList<CookieOrder> getOrders() {
        return orders;
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() { /*cnt declair variabes in the for lop*/
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumberOfBoxes();
        }
        return total;
    }

    public void removeVariety(String variety) {
        boolean iDeletedAll=false;
        while(!iDeletedAll){
            iDeletedAll=true;
            for (int i = 0; i < orders.size(); i++) {
                //System.out.println("###### "+orders.get(i).getVarietyOfCookies() + ": " + orders.get(i).getNumberOfBoxes());
                if (orders.get(i).getVarietyOfCookies().equals(variety)) {
                    orders.remove(i);
                    iDeletedAll=false;
                }
            }
        }
    }

    public int getVarietyBoxes(String variety) {
        int totalOfVariety = 0;
        for (CookieOrder oneOrder : orders) {
            if (oneOrder.getVarietyOfCookies().equals(variety)) {
                totalOfVariety += oneOrder.getNumberOfBoxes();
            }
        } return totalOfVariety;

    }

    public void showOrder() {
        for (CookieOrder oneOrder : orders) {
            System.out.println(oneOrder.getVarietyOfCookies() + ": " + oneOrder.getNumberOfBoxes());
        }
    }
}
