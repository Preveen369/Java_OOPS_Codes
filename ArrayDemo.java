
public class ArrayDemo {
    public static void main(String[] args) {
        // creating static array:
        //int nums[] = {6,7,8,9};
        //nums[2]=5;

        // creating dynamic array:
        int nums[] = new int[4];
        nums[0]=5;
        nums[1]=6;
        nums[2]=7;
        nums[3]=8;

        // accessing values of an array (normal for loop)
        // for (int i=0; i<=3; i++){
        //     System.out.println(nums[i]);
        // }

        // accessing values of an array (enhanced for loop)
        for (int num : nums){
            System.out.println(num);
        }

        /* Drawbacks of using array:
         * 1] Array size is fixed (continous memory locations)
         * 2] Array traversal is sequential manner
         * 3] Store only single type of primitive data types
         */
    }
}
