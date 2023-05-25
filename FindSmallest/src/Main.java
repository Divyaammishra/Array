import java.util.Scanner;

public class Main {

    //Q. Find the smallest element in given array

    //Creating function for given statement
    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE; //We have used inbuilt function for the same

        for(int i=0; i<number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number[] = {2,6,4,8,10};

        //Calling function
        System.out.print(getSmallest(number));
    }
}