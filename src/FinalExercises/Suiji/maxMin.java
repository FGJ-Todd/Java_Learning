package FinalExercises.Suiji;

public class maxMin {
    public static void main(String[] args) {

        int [] arr = new int[10];
        int i = 0;
        while (i <10){
            int r = (int) (Math.random() * 1000);
            arr[i] = r;
            i++;
        }
        maxMin1(arr);
    }

    public static void maxMin1(int[] nums){
        int max = nums[0];
        int min = max;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("最大值：" + max + "，最小值：" + min);
    }
}
