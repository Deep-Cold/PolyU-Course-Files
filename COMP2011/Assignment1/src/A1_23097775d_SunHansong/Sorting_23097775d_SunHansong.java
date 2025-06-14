package A1_23097775d_SunHansong;

import java.util.Arrays;

public class Sorting_23097775d_SunHansong
{
    static class Element implements Comparable<Element> {
        private int originalPos;
        private int secret;

        public Element(int i, int s) {
            if (s <= 0) {
                throw new IllegalArgumentException("The secret value must be a positive integer.");
            }
            originalPos = i;
            secret = s;
        }

        /*
         * For this assignment, you do <i>not</i> need to understand the {@code compareTo} method.
         */
        @Override public int compareTo(Element other) {
            int a = secret, b = other.secret;
            if (a == b) return 0; // can be removed.
            while (a != 1 && b != 1) {
                if (a / 2 * 2 == a) a /= 2;
                else a = a * 3 + 1;
                if (b / 2 * 2 == b) b /= 2;
                else b = b * 3 + 1;
            }
            return a - b;
        }

        public String toString() {
            return (String.valueOf(secret)) + " (" + String.valueOf(originalPos) + ")";
        }
    }

    /**
     * VERY IMPORTANT.
     *
     * I've discussed this question with the following students:
     *     1. None
     *
     * I've sought help from the following Internet resources and books:
     *     1. None
     *
     * Running time: O(n^2). Note: n represent the length of the array
     */
    public static void insertionSort(Element[] a)
    {
        for(int i = 1; i < a.length; i++)
        {
            int l = 0, r = i - 1, pos = i;
            while(l <= r)
            {
                int mid = l + r >> 1;
                if(a[i].compareTo(a[mid]) < 0)
                {
                    r = mid - 1;
                    pos = mid;
                }
                else l = mid + 1;
            }
            Element t = a[i];
            for(int j = i; j > pos; j--) a[j] = a[j - 1];
            a[pos] = t;
        }
    }

    public static void main(String[] args) {
        int input[] = {3, 10, 20, 3}; // try different inputs.
        int n = input.length;
        Element[] a = new Element[n];
        for (int i = 0; i < input.length; i++)
            a[i] = new Element(i, input[i]);

        System.out.println("Original: " + Arrays.toString(a));
        insertionSort(a);
        System.out.println("After sorted: " + Arrays.toString(a));
    }
}
