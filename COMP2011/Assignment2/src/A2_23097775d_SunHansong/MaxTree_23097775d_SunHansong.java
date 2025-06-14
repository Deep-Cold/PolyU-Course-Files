package A2_23097775d_SunHansong;

import java.util.Arrays;

/**
 * 
 * @author Yixin Cao (November 4, 2024)
 *
 * Use a maximum tree (introduced in Lecture 6) to sort an array.
 * 
 */
public class MaxTree_23097775d_SunHansong { // Please change!

    /*
     * No modification to the class {@code Node} is allowed.
     * If you change anything in this class, your work will not be graded.
     */
    private class Node {
        int element;
        public Node leftChild, rightChild;
        public Node(int element) { this.element = element; }
        public String toString() { return String.valueOf(element); }
    }
    Node root;
    
    /**
     * The constructor: Build a maximum tree out of an array.
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
     * Running time: O(n).
     */
    public MaxTree_23097775d_SunHansong(int[] a) {
        int n = a.length;
        Node[] seq = new Node[n];
        for(int i = 0; i < n; i++) {
            seq[i] = new Node(a[i]);
        }
        int cur = n;
        while(cur > 1) {
            for(int i = 0; i < cur; i += 2) {
                Node nw = new Node(i == cur - 1 || seq[i].element > seq[i + 1].element ? seq[i].element : seq[i + 1].element);
                nw.leftChild = seq[i];
                if(i != cur - 1) nw.rightChild = seq[i + 1];
                seq[i >> 1] = nw;
            }
            cur = cur + 1 >> 1;
        }
        if(n > 0) root = seq[0];
    }

    /**
     * Remove the root from a maximum tree and return its element.
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
     * Running time: O(log n).
     */
    Node removeMax(Node cur) {
        if(cur.leftChild == null && cur.rightChild == null) return null;
        if(cur.leftChild == null || (cur.rightChild != null && cur.rightChild.element == cur.element))
            cur.rightChild = removeMax(cur.rightChild);
        else cur.leftChild = removeMax(cur.leftChild);
        if(cur.rightChild == null && cur.leftChild == null) return null;
        if(cur.leftChild == null) cur.element = cur.rightChild.element;
        else if(cur.rightChild == null) cur.element = cur.leftChild.element;
        else cur.element = cur.leftChild.element > cur.rightChild.element ? cur.leftChild.element : cur.rightChild.element;
        return cur;
    }
    public int removeMax() {
        int mx = root.element;
        root = removeMax(root);
        return mx;
    }
    /**
     * The *smart* selection sort.
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
     * Running time: O(n log n); space use: O(n).
     */
    public static void treeSort(int[] a) {
        MaxTree_23097775d_SunHansong tree = new MaxTree_23097775d_SunHansong(a);
        int n = a.length;
        for(int i = n - 1; i >= 0; i--)
            a[i] = tree.removeMax();
    }

    /*
     * Todo: add at least ten more test cases to test your code.
     * The use of data structures from Java libraries is allowed here and only here.
     */
    public static void main(String[] args) {
        int testData[][] = { // try different inputs.
                {},
                {1, 1, 1, 1, 1, 1, 1},
                {10, 8, -4, 89, 2, 0, 4, -19, 200},
                {5, 4, 3, 2, 1, 1, 0, 0, -1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8},
                {3, 2, 6, 13, 8, 4, 10, 7, 14, 11, 12, 5, 9},
                {65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55},
                {10, 8, 14, 89, 32, 50, 77, 38},
                {1},
                {2, 1},
                {1, 1},
                {2, 1, 0},
                {0, 0, 0},
                {0},
                {0, 1},
                {2, 0, 1},
                {1, 2, 0},
                {3, -1}
        };
        for (int[] a:testData) {
            System.out.println("The original array: " + Arrays.toString(a));
            treeSort(a);
            System.out.println("Sorted: " + Arrays.toString(a));
        }
    }
}
