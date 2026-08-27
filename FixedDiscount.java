/** Strategy (Part 2): ลดราคาเป็นจำนวนเงินคงที่ เช่น new FixedDiscount(100) = ลด 100 บาท */
public class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be >= 0");
        this.amount = amount;
    }

    @Override public double applyDiscount(Order order) {
        double total = Math.max(0, order.getTotalPrice()-amount );
        // TODO (2b): คืน (ราคารวม - amount) แต่ต้องไม่ต่ำกว่า 0
        //   hint: Math.max(order.getTotalPrice() - amount, 0)
        return total ;
    }
}
