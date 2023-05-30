public class Main {

    //Q. Given n non-negative integer representing an elevation map where the width of each bar is 2, compute how much water it
    // can trap alternating


    //Creating function for the given problem statement
    public static int trappingRainWater(int height[]){

        //First we have to calculate the left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0]; //for the boundary which is on zeroth position
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]); //To calculate left max boundary
        }

        //Now, we have to calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1]; //for the boundary which is on last position
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]); //To calculate right max boundary
        }

        int trappedWater = 0;
        for(int i=0; i<height.length; i++){

            //To water calculate trapped water, we need level of water
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += (waterLevel - height[i])*2; //(waterLevel - heightOfBoundary) * widthOfBoundary
        }
        return trappedWater;
    }
    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};

        System.out.print("The Trapped water is : ");
        System.out.print(trappingRainWater(height));
        


    }
}