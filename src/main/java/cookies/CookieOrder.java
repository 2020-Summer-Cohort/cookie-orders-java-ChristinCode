package cookies;

import org.w3c.dom.ls.LSOutput;

/*The CookieOrder Class

Write this class to keep track of 2 pieces of instance data:
*variety of cookie and numBoxes purchased
*Create the constructor to handle this data and 2 accessor methods
*/
public class CookieOrder {
    private String varietyOfCookies;
    private int numberOfBoxes;

    public CookieOrder(String varietyOfCookies, int numberOfBoxes) {
        this.varietyOfCookies = varietyOfCookies;
        this.numberOfBoxes = numberOfBoxes;
    }

    public String getVarietyOfCookies() {
        return varietyOfCookies;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }
}
