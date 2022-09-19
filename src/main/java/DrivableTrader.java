/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

public class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a Trader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param money The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable o) {
        if (o instanceof Tradable) {
            return ((Tradable) o).getPrice() + o.getMaxSpeed();
        } else {
            return Tradable.MISSING_PRICE;
        }
    }
}