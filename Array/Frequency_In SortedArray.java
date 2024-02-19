class Frequency_InSortedArray {
    public static void main(String[] args) {
        int nums[] = { 10, 10, 10, 25, 31, 31, 32 };
        myApproch(nums);
        javaTPoint(nums);
    }

    private static void javaTPoint(int[] nums) {
        int visited = -1;
        int arr[] = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    arr[j] = visited;
                }
            }
            if (arr[i] != visited) {
                arr[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=visited)
                System.out.print(arr[i] + " ");
        }
    }

    public static void myApproch(int nums[]) {
        int count = 1;
        System.out.println("aa");
        for (int i = 1; i < nums.length; i++) {
            // int temp=nums[i];
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                System.out.println("fre of " + nums[i - 1] + " is " + count);
                count--;
            }
        }
        // System.out.println(temp + " " + count);
    }
}