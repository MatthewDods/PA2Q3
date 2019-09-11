/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Arrays;

/**
 *
 * @author Jeff
 */
public class JavaSort {
    
 
    /* Prints the array */
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
    
    // Driver method to test above
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
        CatalogueItem arr2[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        System.out.println("The Unsorted array is:\n");
        printArray(arr);
        
        //apply obs sort
        ob.doOptimisedBubbleSort(arr);
        System.out.println("The array sorted by 'ID' using Optimised Bubble Sort is:\n");
        printArray(arr);
        
        //apply javasort
        Arrays.sort(arr2, (p1, p2) -> p1.getCategory().compareTo(p2.getCategory()));
        System.out.println("The array sorted by 'Category Name' using built in Java Sort is:\n");
        printArray(arr2);
    }
}
