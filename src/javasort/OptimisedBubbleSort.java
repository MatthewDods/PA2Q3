package javasort;

/**
 *
 * @author Jeff
 */
public class OptimisedBubbleSort {
    
    /**
     *
     * @param a
     */
    public static void doOptimisedBubbleSort(CatalogueItem a[]) {
        int lastSwap = a.length-1;
        for(int i=1; i<a.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;

            for(int j=0; j < lastSwap; j++) {
              if(a[j].getItemId() > a[j+1].getItemId()) {
                    CatalogueItem temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    is_sorted = false;
                    currentSwap = j;
              }
            }
        if(is_sorted) return;
        lastSwap = currentSwap;
        }
    }
    
    /* Prints the array */
    void printArray(CatalogueItem arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }
}