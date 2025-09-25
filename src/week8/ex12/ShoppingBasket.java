package week8.ex12;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public ShoppingBasket(){}

    public void add(String product, int price){
        if (this.purchases.containsKey(product)){
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Purchase p : purchases.values()) {
            total += p.price();
        }
        return total;
    }

    public void print(){
        for (Purchase p : purchases.values()) {
            System.out.println(p);
        }
    }
}
