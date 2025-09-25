package week8.ex12;

public class Purchase {
    private String product;
    private int quantity;
    private int unitPrice;

    public Purchase(String product, int amount,int unitPrice) {
        this.product = product;
        this.quantity = amount;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.quantity;
    }

    public void increaseAmount() {
        this.quantity += 1;
    }

    @Override
    public String toString(){
        return this.product + ": " + this.quantity;
    }
}
