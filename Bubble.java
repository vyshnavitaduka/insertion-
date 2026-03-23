import java.util.Scanner;

class Bubble {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}