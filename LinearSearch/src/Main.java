public class Main {

    //Q. Search a particular element from given array

    //Creating a function for the given problem
    public static int linearSearch(int number[], int search){

        //Implementing a loop
        for(int i=0; i<number.length; i++){
            if(number[i] == search){ //If the current element with our searching element
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //creating an array
        int number[] = {2,4,6,8,10};

        //Giving an input to search
        int search = 6; //you can also take an input from user

        int index = linearSearch(number,search);

        if(index == -1){ //if the element is not found
            System.out.print("Element does not exist");
        }else{
            //if element is found
            System.out.print("Element found at : " + index);
        }


    }
}