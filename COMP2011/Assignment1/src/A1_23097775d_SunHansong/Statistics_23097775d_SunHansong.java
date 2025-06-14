package A1_23097775d_SunHansong;

public class Statistics_23097775d_SunHansong {
    /**
     * Calculates the median of the union of two <i>sorted</i> arrays.
     * The input arrays are both <i>sorted</i> and <i>cannot</i> be both empty.
     *
     * VERY IMPORTANT.
     *
     * I've discussed this question with the following students:
     *     1. None
     *
     * I've sought help from the following Internet resources and books:
     *     1. None
     *
     * Running time: O(log n); space O(1). Note: n is the value of a1.length + a2.length
     */
    static double median(int[] a)
    {
        if(a.length == 0) throw new IllegalArgumentException("The input must be nonempty.");
        if((a.length & 1) == 1) return a[a.length >> 1];
        return (a[a.length >> 1] + a[(a.length >> 1) - 1]) / 2.0;
    }
    static double median(int[] a1, int[] a2)
    {
        if(a1.length == 0 && a2.length == 0)
            throw new IllegalArgumentException("The input must be nonempty.");
        if(a1.length == 0) return median(a2);
        if(a2.length == 0) return median(a1);
        int l = 0, r = a1.length - 1, pos = a1.length - 1, len = a2.length + a1.length >> 1;
        while(l <= r)
        {
            int mid = l + r >> 1;
            if(len - mid - 1 < 0 || (len - mid - 1 < a2.length && a1[mid] >= a2[len - mid - 1]))
            {
                r = mid - 1;
                pos = mid;
            }
            else l = mid + 1;
        }
        if(a1[pos] < a2[len - pos - 1])
        {
            if(((a1.length + a2.length) & 1) == 1)
                return a2[len - pos - 1];
            int v1 = a2[len - pos - 1];
            int v2 = len - pos == 1 ? a1[pos] : a1[pos] >= a2[len - pos - 2] ? a1[pos] : a2[len - pos - 2];
            return (v1 + v2) / 2.0;
        }
        if(((a1.length + a2.length) & 1) == 1)
        {
            if(len - pos < a2.length) return a1[pos] >= a2[len - pos] ? a2[len - pos] : a1[pos];
            return a1[pos];
        }
        int v1 = (len - pos < a2.length && a2[len - pos] <= a1[pos]) ? a2[len - pos] : a1[pos];
        int v2 = pos == 0 ? a2[len - pos - 1] : len - pos - 1 < 0 ? a1[pos - 1] : a1[pos - 1] >= a2[len - pos - 1] ? a1[pos - 1] : a2[len - pos - 1];
        return (v1 + v2) / 2.0;
    }

    public static void main(String[] args) {
        int[][] a = {{-2, 0, 1, 3}, {1, 2, 4, 8, 16}};
        System.out.println("The medians of the two arrays are " + median(a[0]) + ", " + median(a[1])
                + ", and the median of their union is " + median(a[0], a[1]));
    }
}
