package shop;

import bank.Bank;
import main.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OnlineShop {
    private final Bank bank;
    private final Person spOwner;
    private final List<ShopItem> availableItems = new ArrayList<>(List.of(
            new ShopItem("Spezi", 20),
            new ShopItem("Cola", 30),
            new ShopItem("Sprite", 25)
    ));
    private final HashMap<Person, List<ShopItem>> loeewfewl = new HashMap<>();

    public OnlineShop(Bank bank, Person shopOwner) {
        this.bank = bank;
        this.spOwner = shopOwner;
    }

    public List<ShopItem> getAvailableItems() {
        return availableItems;
    }

    public void addToCart(Person buyer, ShopItem item){
        // TODO: Add the item to the buyer's cart. If the buyer doesn't have a cart yet, create one.
    }

    public boolean placeOrder(Person buyer) {
        // TODO:
        // 1. Check if the buyer has a cart.
        // 2. Sum the total price of all items in the cart.
        // 3. Use the bank to transfer the total amount from the buyer to the shop owner.
        // 4. If successful, store the sold items for potential refund and clear the buyer's cart.
        // 5. Return true if purchase succeeded, false otherwise.
        return false;
    }
}
