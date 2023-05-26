public class Main {

    //Q. Find the sum of every subArray

    //Creating function for the same
    public static void sumOfSubArray(int number[]){

        int sum = 0; //For calculating the sum

        //Outer loop
        for(int i=0; i<number.length; i++){
            int start = i;

            //Inner loop 1st
            for(int j=i; j<number.length; j++){
                int end  = j;
                sum = 0;

                //Inner loop 2nd
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                    sum += number[k];
                }
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10};

        //Calling the function
        sumOfSubArray(number);
    }
}