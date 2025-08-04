//Assignment 1

//You are given a water tank with a series of compartment walls, any of which can be removed.
//You must figure out the maximum amount of water the tank can hold.
//The compartment walls have different heights, represented by an array of integers, and are 1 step apart from each other.
//You are only allowed to keep two of them, any two.
//The output should be the largest area of water that can be held.

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = scanner.nextInt();

        int[] height = new int[n];  

        System.out.println("Enter the heights: ");

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        } 

        scanner.close();

    System.out.println("Maximum water: " + maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            int width = right - left;
            int currentWater = Math.min(height[left], height[right]) * width;
            maxWater = Math.max(maxWater, currentWater);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
