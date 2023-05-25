public class Main {

    //Find the reverse of an array

    //Creating function
    public static void reverse(int number[]){
        int first = 0, last = number.length-1;

        while (first < last){ //Condition

            int temp = number[last]; //The last will be stored in the temp variable, then
            number[last] = number[first]; //first will be stored at the last index, then
            number[first] = temp; //value of temp variable will be stored at the first index

            first++; //increasing
            last--; //decreasing
        }
    }
    public static void main(String[] args) {

        int number[] = {1,2,3,4,5,};

        reverse(number);

        //Calling function
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}