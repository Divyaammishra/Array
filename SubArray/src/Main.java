public class Main {

    //Sub Array

    //Creating function
    public static void subArray(int number[]){

        //Outer loop
        for(int i=0; i<number.length; i++){
            int start = i;

            //Inner loop 1
            for(int j=i; j<number.length; j++){
                int end = j;

                //Inner loop 2
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int number[] = {1,2,3,4,5};

        //Calling function
        subArray(number);
    }
}