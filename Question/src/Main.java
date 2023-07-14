
/*
 Q. Given an integer array number, return true if any value appears at least twice in the array,
      and return false if every element is distinct
 */
public class Main {

    //Function
    public static boolean check(int number[]){

        //Outer loop
        for(int i=0; i<number.length-1; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int number[] = {45,55,65,5,75,85,95,35,25,15,5};

        System.out.print(check(number));
    }
}