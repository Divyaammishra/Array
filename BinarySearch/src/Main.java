import java.util.Scanner;

public class Main {

    //Question on Binary Search

    //Creating function
    public static int binarySearch(int number[], int search){
        int first = 0, last = number.length-1;

        while(first <= last){
            int mid = (first + last) / 2;

            if(number[mid] == search){
                return mid;
            } else if (number[mid] < search) {
                first = mid + 1;
            }else{
                last = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Enter the element :- ");
        int search = sc.nextInt(); //We take input from user

        int index = binarySearch(number, search);

        //Calling function
        if(index == -1){
            System.out.print("Element does not exist !");
        }else{
            System.out.print("Element found at : " + index);
        }

        /*
        Note -
        The output will be 9, because
        indexing for an array is start from 0
         */
        
    }
}