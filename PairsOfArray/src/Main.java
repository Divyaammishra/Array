public class Main {

    //Q. Make a pair of an array

    //Creating function for the same
    public static void pairs(int number[]){

        //Inner loop - which produce the current value
        for(int i=0; i<number.length; i++){
            int current = number[i];

            //Outer loop - which produce the next value for every current value
            for(int j=i+1; j< number.length; j++){
                System.out.print("(" + current + "," + number[j] + ")");
            }
            System.out.println(); //for the next line
        }
    }
    public static void main(String[] args) {

        int number[] = {2,3,4,5,6};

        //Calling function
        pairs(number);
    }
}