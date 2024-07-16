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
        if (money == 0) {
            return (miles * 0.0035);
        }
        return money;
    }

    int getMilesValue() {
        if (miles == 0) {
            return (int) (money / 0.0035);
        }
        return miles;
    }
}
