/*
 * This is the class that I will use in order to solve the Leetcode problem: MountainArray.
 *
 * Author: Nick Burkett
 * Date: 01/14/2025
 *
 * Status: WIP
 */
public class MountainArray{
        
        /*
         * This is my function validMountainArray that will check to see if I have a valid mountain array.
         *
         * @param int[] arr - array passed in for validation.
         * @return boolean - return T/F depending if the array passed in takes a mountain format.
         */
        public boolean validMountainArray(int[] arr){
                
                boolean up = false;         //Initialize up var to track if I am going up the mountain.
                boolean down = false;       //Initialize down var to track if I am going down the mountain.
                boolean start = true;       //Initialize start var to signal if i == 0.

                //Need to check if arr is less than 3, bec I can't have a mountain array with < 3 elements.
                if(arr.length < 3){
                        return false;   //Just return false if I find < 3 elements in the array.
                }
                
                //Need to start to loop through the array. 
                for(int i = 0; i < arr.length; i++){
                        
                        //Need to check if I am at the end of my array. If so, I have a few things to check.
                        if(i == (arr.length-1)){
                                
                                //Need to check if it's a valid ending or not.
                                if(arr[i] < arr[i-1] && down){
                                        return true;    //Need to return true if I am at the end and it's valid.
                                }
                                else{
                                        return false;   //Otherwise, I need to just return false.
                                }
                        }
                }

        }


        //Need to create a main method for testing. 
        public static void main(String[] args){
                
                System.out.println("Hello World");
        }
}
