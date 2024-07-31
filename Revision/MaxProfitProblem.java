package Revision;
public class MaxProfitProblem {

    public static void main(String[] args) {
        int timeUnit = 13; // Example input
        int[] result = maximizeEarnings(timeUnit);
        System.out.println("T: " + result[0] + " P: " + result[1] + " C: " + result[2]);
    }

    public static int[] maximizeEarnings(int timeUnit) {
        int maxEarnings = 0;
        int maxTheatres = 0;
        int maxPubs = 0;
        int maxCommercialParks = 0;

        for (int t = 0; t <= timeUnit / 5; t++) {
            for (int p = 0; p <= timeUnit / 4; p++) {
                for (int c = 0; c <= timeUnit / 10; c++) {
                    int totalTime = t * 5 + p * 4 + c * 10;
                    if (totalTime <= timeUnit) {
                        int earnings = t * 1500 + p * 1000 + c * 3000;
                        if (earnings > maxEarnings) {
                            maxEarnings = earnings;
                            maxTheatres = t;
                            maxPubs = p;
                            maxCommercialParks = c;
                        }
                    }
                }
            }
        }

        return new int[]{maxTheatres, maxPubs, maxCommercialParks};
    }
}
