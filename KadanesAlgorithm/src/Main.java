public class Main {

    //Kadanes Algorithm
    public static void kadanes(int number[]){

        int currentSUm = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            currentSUm = currentSUm + number[i];

            if(currentSUm < 0){
                currentSUm = 0;
            }
            maxSum = Math.max(currentSUm, maxSum);
        }
        System.out.print("Maximum sum is : " + maxSum);
    }
    public static void main(String[] args) {

        int number[] = {-1,2,-3,4,5};

        kadanes(number);
    }
}