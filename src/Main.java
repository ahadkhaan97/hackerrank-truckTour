import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(truckTour(Arrays.asList(Arrays.asList(1, 5), Arrays.asList(10, 3), Arrays.asList(3, 4))));
    }

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int sum = 0;
        int start = 0;
        for (int i = 0; i < petrolpumps.size(); i++) {
            sum += petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);

            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }

        return start;
    }
}