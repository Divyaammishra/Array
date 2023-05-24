public class Main {

    //Q. Find the largest element in given array.

    //Creating function to find the largest element
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        //Integer.MIN_VALUE is java's inbuilt function which help us to the find largest and smallest

        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10};

        System.out.print(getLargest(number)); //Calling function
    }
}