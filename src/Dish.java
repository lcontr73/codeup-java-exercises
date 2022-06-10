public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish() {

    }
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;

    }

    public void printSummary () {
        System.out.printf("Cost: %d%n Name: %s%n Recommended: %b%n", costInCents, nameOfDish, wouldRecommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
