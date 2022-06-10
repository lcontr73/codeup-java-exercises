public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

//    public Dish() {
//
//    }
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;

    }

    public void printSummary () {
        System.out.printf("Cost: %d%n Name: %s%n Recommended: %b%n", costInCents, nameOfDish, wouldRecommend);
    }

}
