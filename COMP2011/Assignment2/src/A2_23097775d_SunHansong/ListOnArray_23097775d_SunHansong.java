package A2_23097775d_SunHansong;

import java.util.Arrays;
import java.security.SecureRandom;

/**
 * 
 * @author yixin cao (September 28, 2020)
 * 
 * Simulating a linked list with an array.
 * 
 */
public class ListOnArray_23097775d_SunHansong {
    private int[] data;
    int size;

    /*
     * The constructor is slightly different to Lab 5.
     * But the difference is irrevalent to the task.
     */
    public ListOnArray_23097775d_SunHansong(int n) {
        size = (n + 1) << 1;
        data = new int[size];
        
        data[0] = 0; // may be omitted in Java.
        for (int i = 2; i < size - 2; i += 2)
            data[i] = i + 1;
        data[size - 1] = 1;
        data[size - 2] = 0;
    }
    
    public boolean isEmpty() {
        return data[0] == 0;
    }
    
    public boolean isFull() {
        return data[size - 1] == 0;
    }
    
    public void err() {
        System.out.println("Oops...");
    }

    /*
     * Insert a new element as the new head of the list.
     */
    public void insertFirst(int x) {
        if (isFull()) { err(); return; }
        int i = data[size - 1];
        data[size - 1] = data[i + 1];
        data[i + 1] = data[0];
        data[0] = i;
        data[i] = x;
    }

    /**
     * The *in-place* quicksort algorithm.
     *
     * VERY IMPORTANT.
     * 
     * I've discussed this question with the following students:
     *     1. None
     *     ...
     * 
     * I've sought help from the following Internet resources and books:
     *     1. None
     *     ...
     * 
     * Running time: O(n log n) in average case, O(n ^ 2) in the worst case.
     */
    private void quickSort(int l, int r) {
        if(data[l + 1] == r) return;
        int cur = data[l + 1], nex, pivot = data[cur], lTail = l, rTail = cur, rHead = cur;
        cur = data[cur + 1];
        while(cur != r) {
            nex = data[cur + 1];
            if(data[cur] < pivot) {
                data[lTail + 1] = cur;
                lTail = cur;
            }
            else {
                data[rTail + 1] = cur;
                rTail = cur;
            }
            cur = nex;
        }
        data[lTail + 1] = rHead;
        data[rTail + 1] = r;
        quickSort(l, rHead);
        quickSort(rHead, r);
    }
    public void quicksort() {
        quickSort(-1, 0);
    }

    /*
     * Output the elements stored in the list in order.
     */
    public String toString() {
        if (isEmpty()) return "The list is empty.";
        StringBuilder sb = new StringBuilder();
        int i = data[0];
        sb.append(data[i++]);
        while (data[i] != 0) {
            i = data[i];
            sb.append(" -> ").append(data[i++]);
        }
        return sb.append('\u2193').toString(); 
    }

    /*
     * Todo: add at least ten more test cases to test your code.
     * Todo: modify the list (removing and adding elements) and sort it again.
     *
     * The use of data structures from Java libraries is allowed here and only here.    
     */
    public static void main(String[] args) {
        int[][] testData = { // try different inputs.
                {},
                {1, 1, 1, 1, 1, 1, 1},
                {10, 8, -4, 89, 2, 0, 4, -19, 200},
                {5, 4, 3, 2, 1, 1, 0, 0, -1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8},
                {3, 2, 6, 13, 8, 4, 10, 7, 14, 11, 12, 5, 9},
                {65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55},
                {10, 8, 14, 89, 32, 50, 77, 38},
                {0, 0},
                {3, 1},
                {1},
                {2, 4, 3},
                {1, 2},
                {1, 3, 2, 4, 1}
            };
        for (int[] a : testData) {
              int n = a.length;
              SecureRandom random = new SecureRandom();
              ListOnArray_23097775d_SunHansong list = new ListOnArray_23097775d_SunHansong(n + random.nextInt(1 + (n << 2)));  // you don't need to understand this line.
              System.out.println("The original array: " + Arrays.toString(a));
              for (int i = n - 1; i >= 0; i--) list.insertFirst(a[i]);
              System.out.println("The original list: " + list);
              // You can uncomment the following line to print out how the elements are stored
              // System.out.println("The internal storage: " + Arrays.toString(list.data));
              list.quicksort();
              System.out.println("The sorted list: " + list);
        }
  }
}
