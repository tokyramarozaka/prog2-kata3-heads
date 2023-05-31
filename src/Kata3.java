import java.util.ArrayList;
import java.util.List;

public class Kata3 {
    /**
     * Return a two-dimensional containing all the possible combinations of an array of doubles.
     * Each possible combination will be of a fixed size, which must be equal or less the size of
     * the array input.
     * @param array : the input array we want to get all possible combinations from
     * @param size : an integer fixing the size of each combination.
     * @return a two-dimensional list of doubles, containing all possible combinations of the array
     */
    public static List<List<Double>> generatePossibleCombinations(double[] array, int size) {
        List<List<Double>> combinations = new ArrayList<>();

        generate(combinations, new ArrayList<>(), array, size, 0);

        return combinations;
    }

    /**
     * A somewhat complex recursive algorithm to insert all possible combinations of a given array
     * into a two-dimensional list of doubles, starting with the first index and moving its way
     * forward, with a fixed size per combination.
     *
     * <h2>NOTE : THIS FUNCTION IS GRANTED TO MAKE THIS KATA EASIER... JUST USE IT.</h2>
     *
     * @param combinations : a two-dimensional list containing all possible combinations
     * @param current : the current combination to be built
     * @param array : the original input array
     * @param size : an integer describing the size of each combination
     * @param start : the index to start looking for all combinations
     */
    private static void generate(
            List<List<Double>> combinations,
            List<Double> current,
            double[] array,
            int size,
            int start
    ){
        if (current.size() == size) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            generate(combinations, current, array, size, i + 1);
            current.remove(current.size() - 1);
        }
    }

    /**
     * Returns in a double list the following elements in order :
     * <ol>
     *     <li>the minimum average out of all the doubles in the scores array</li>
     *     <li>the average score out of possible combinations(size=9) of the scores array</li>
     *     <li>the median value of the scores array</li>
     *     <li>the maximum average out of all the doubles in the scorers array</li>
     * </ol>
     * @param scores : the array containing all 12 scores from the jury
     * @return a list doubles where on each index contains the following values :
     * 0) the min average (2 points)
     * 1) the average value, (3 points)
     * 2) the median score (3 points)
     * 3) the max average (2 points)
     */
    public static List<Double> fetchScoreDetails(double[] scores){
        // TODO : Write your code here. Good luck !
        return null;
    }

    /**
     * Test Data. No need to round the values if there are many decimals.
     */
    public static void main(String[] args) {
        double[] input1 = new double[]{6.7, 4.2, 4.3, 7.0, 0.0, 2.8, 3.9, 1.3, 6.9, 6.0, 7.3, 3.2};
        double[] input2 = new double[]{7.1, 9.6, 0.9, 3.9, 7.4, 3.3, 7.5, 2.6, 2.9, 8.4, 6.4, 0.3};

        System.out.println(fetchScoreDetails(input1)); // [3.600, 4.667, 4.250, 5.500]
        // min 3.600 average 4.467 median 4.250 max 5.500

        System.out.println(fetchScoreDetails(input2)); // [3.867, 5.025, 5.150, 6.278]
        // min 3.867 average 5.025 median 5.150 max 6.278
    }
}
