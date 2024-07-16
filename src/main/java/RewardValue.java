public class RewardValue {
    private int miles;
    private double money;

    RewardValue(double money) {
         this.money = money;
    }

    RewardValue(int miles) {
        this.miles = miles;
    }

    double getCashValue() {
        return money;
    }

    double getMilesValue() {
        return (money / 0.0035);
    }
}
