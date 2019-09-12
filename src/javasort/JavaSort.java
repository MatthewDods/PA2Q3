/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Arrays;

/**
 * JavaSort, sorts array using BubbleSort and JavaSort for comparison purposes.
 * @author Matthew Dods 420190038
 */
public class JavaSort {
    
 
    /**
     * printArray, prints the array.
     * @param arr - list
     */
    static void printArray(CatalogueItem arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "ID: " + arr[i].getItemId() + " | "
                    + "Name: " + arr[i].getItemName() + " | "
                    + "Category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }
    
    
    public static void main(String args[])
    {
        OptimisedBubbleSort ob = new OptimisedBubbleSort();
        
        CatalogueItem arr[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        CatalogueItem arr2[] = arr.clone(); // for second sort using JavaSort
        
        System.out.println("The Unsorted array is:\n");
        printArray(arr);
        
        //apply obs sort to first original array
        ob.doOptimisedBubbleSort(arr);
        System.out.println("The array sorted by 'ID' using Optimised Bubble Sort is:\n");
        printArray(arr);
        
        //apply javasort to second array
        Arrays.sort(arr2, (p1, p2) -> p1.getCategory().compareTo(p2.getCategory()));
        System.out.println("The array sorted by 'Category Name' ascending (a-z) using built in Java Sort is:\n");
        printArray(arr2);
        
        // I have this whole paragraph in my report PDF
        System.out.println("\nTalking about which sorting method is better we must look at a couple important things. JavaSort(TimSort) and BubbleSort both show good performance on such a low scale array that the difference is negligible however one is still more efficient than the other and this is shown when large arrays are taken and you try sort them using these methods. An algorithm complexity is shown using the Big O Notation, for these two methods both show a notation of O(n) in their best case scenarios which essentially means that in small scale lists like the one shown in this program the difference is as said negligible. However this changes when the array expands to have more elements. In the worst case scenario JavaSort absolutely destroys BubbleSort in performance, having an average-slightly bad performance ofO(n log n) whereas BubbleSort will drop down to a laughable O(n^2). This means that as the array gets larger BubbleSort will take exponentially longer to sort whereas JavaSort will increase in a large amount (but nowhere near as large as BubbleSort). Their average cases are also uncomparable as JavaSort is again O(n log n) on average while BubbleSort is O(n^2) (both their worst cases.) This alone tells you that if you’re planning on sorting any list that isn’t small you should always choose something like JavaSort over something like BubbleSort. If it is small however the choice doesn’t really matter.");
    }
}
