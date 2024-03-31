// TO BE IGNORED!!!

// public class test {
//     public static void main(String[] args) {
//         int high, low;
//         int nums[] = { 7, 1, 5, 3, 6, 4 };
//         high = 0;
//         low = 0;

//         for (int i = 0; i < nums.length; i++) {
//             System.out.println(i + " -> " + nums[i]);
//             if (nums[i] < nums[low]) {
//                 low = i;
//                 System.out.println(low + " (low) -> " + nums[low]);
//             }
//             if (nums[i] > nums[high]) {
//                 high = i;
//                 System.out.println(high + " (high) -> " + nums[high]);
//             }
//         }

//         System.out.println(high + " (high) -> " + nums[high]);
//         System.out.println(low + " (low) -> " + nums[low]);

//     }
// }

public class test {
    public static void profit(int array[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < array.length; i++) {
            if (buyPrice < array[i]) {
                int profit = array[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = array[i];
            }
        }
        System.out.println("the max profit is " + maxProfit);
    }

    public static void maxMin(int array[]) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[low]) {
                low = i;
            }
            if (array[i] > array[high]) {
                high = i;
            }
        }
        System.out.println(array[low]);
        System.out.println(array[high]);

    }

    public static void main(String[] args) {
        int numbers[] = { 7, 1, 5, 3, 6, 4 };
        profit(numbers);
        maxMin(numbers);
    }
}