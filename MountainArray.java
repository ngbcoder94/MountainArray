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
        public boolean validateMountainArray(int[] arr){
                
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

                        //If I am not at the end, I have a few things to check/keep track of.
                        if(i == 0 && arr[i] < arr[i+1]){
                                
                                up = true;          //Here I need to signal the mountain is going upward.
                                start = false;      //Set start to false to signal I am no longer at the start.
                                continue;           //Go on to the next iteration.
                        }
                        else if(arr[i] < arr[i+1] && up){
                                
                                continue;   //If I end up in here, I am continuing to climb and skip to next iteration.
                        }
                        else if(arr[i] > arr[i+1] && down == false && start == false){
                                
                                up = false;         //Signal that I am no longer going up.
                                down = true;        //Signal that I am now going down.
                                continue;           //Go on to the next iteration.
                        }
                        else if(arr[i] > arr[i+1] && down){
                                
                                continue;           //Just skip on to the next iteration.
                        }
                        else{
                                return false;       //If I end up in here, then I need to return false bec I don't have a mountain array.
                        }
                }

                //If I get this far, something went wrong and I need to just print an error and return false.
                System.out.println("Error");
                return false;

        }


        //Need to create a main method for testing. 
        public static void main(String[] args){
                
                int[] tmpArr = {0, 1, 2, 3, 2, 1, 0};           //Create some temp data. 
                
                MountainArray tmpObj = new MountainArray();     //Create a new instance on the class for testing.

                System.out.println(tmpObj.validateMountainArray(tmpArr));
        }
}
