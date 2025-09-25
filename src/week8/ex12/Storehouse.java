package week8.ex12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    protected Map<String, Integer> prices = new HashMap<String, Integer>();
    protected Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int stock = stocks.getOrDefault(product, 0);
        if (stock <= 0) return false;
        stocks.put(product, stock-1);
        return true;
    }

    public Set<String> products() {
        return stocks.keySet();
    }
}
