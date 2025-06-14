import java.io.*;

public class FinalProject_23097775d_SunHansong {

    static class booleanNumber {
        int val;
        booleanNumber() {
            val = 0;
        }
        public boolean get(int p) {
            return (val >>> p & 1) == 1;
        }
        public void set(int p) {
            val |= 1 << p;
        }
        public void clear() {
            val = 0;
        }
    }

    private static final int N = 1 << 30, NB = 1 << 25, NP = (int) (6e7+10);
    private static final int ROUND = 1 << 30;
    private static final booleanNumber[] notPrime = new booleanNumber[NB];
    private static final int[] primes = new int [NP];
    private static long counter = 0, limit = 1L << 60;

    private static void clear() {
        for(int i = 0; i < NB; i++)
            notPrime[i].clear();
    }

    private static int getN(long val) {
        return (int) ((val % N) / 32);
    }

    private static int getP(long val) {
        return (int) ((val % N) % 32);
    }

    private static long ceilDiv(long a, long b) {
        return (a + b - 1) / b;
    }

    // Running time: O(n log (log (n)))
    /*
        Analysis:

        First, I use the linear sieve to obtain all the primes below 2^30.

        We can prove that each composite number will be marked only once.
        Suppose that p_i is a prime, if a composite number is marked twice X = i * p_i = p_j * j,
        then we have p_j | i, p_i | j, suppose that p_i < p_j, when we at the iteration processing
        p * j, because p_i is a smaller prime factor, so we will not encounter p_j. Thus, the situation
        will not happen.

        Then we can prove that the next unmarked number must be prime number.
        If it is not prime, suppose that p is the minimum prime factor of X, then we have X = p * i.
        Then if X is unmarked, i must have a smaller prime factor than p, thus it is contradictory to
        our assumption. We can prove that X must be a prime.


        For the second part, we use a similar method like Eratosthenes sieve method.
        We can prove that for any non-prime number X, it must have a prime factor less
        or equal than sqrt(X), so we use the prime number obtained by the first part to mark
        the numbers in an interval [l,r]. We do this because the mark for larger number need
        extra space, but we do not have that enough space. In each iteration i, we have r - l + 1 = 2 ^ 30,
        means we will get the all the prime numbers between (i + 1) * 2 ^ 30 and (i + 2) * 2 ^ 30 - 1.
        Because that the maximum round number is sqrt(n), we need to perform sqrt(n) primes
        like Eratosthenes sieve method. So this part the time complexity is O(sqrt(n) * sqrt(n) * log ( log( sqrt(n))))
        = O (n * log( log( sqrt(n)))) = O (n * log( log( n))), and we go through all the numbers is O(n)
        So, the final time complexity is O (n * log(log(n))).

        And for the space consumption, we need to store 2 ^ 30 boolean values and all the prime
        numbers obtained in the first part. Because java's boolean may have a consumption larger
        than 1 bit in reality, I use one integer to represent 32 boolean values.
        Thus, the total space consumption of the storage is around (2 ^ 25 + 6 * 10 ^ 7) * 8 / 1024 / 1024 = 713 MBytes;
     */
    public static void smallestPrimes(String fileName) throws IOException {
        File file = new File(fileName);
        if(!file.exists()) file.createNewFile();
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));

        for(int i = 0; i < NB; i++) notPrime[i] = new booleanNumber();

        int cnt = 0;
        notPrime[0].set(1);
        for(int i = 2; i < N; i++) {
            if(!notPrime[getN(i)].get(getP(i))) {
                primes[cnt ++] = i;
                out.write((i + "\n").getBytes());
                counter ++;
            }
            for(int j = 0; (long) i * primes[j] < N && j < cnt; j++) {
                long v = (long) i * primes[j];
                notPrime[getN(v)].set(getP(v));
                if(i % primes[j] == 0) break;
            }
        }
        out.flush();

        for(int i = 0; i < ROUND; i++) {
            clear();
            long l = (long) (i + 1) * N, r = (long) (i + 2) * N - 1;
            if(l > limit) break;
            for(int j = 0; j < cnt; j++) {
                if((long) primes[j] * primes[j] > r) break;
                long mn = ceilDiv(l, primes[j]) * primes[j];
                while(mn <= r) {
                    notPrime[getN(mn)].set(getP(mn));
                    mn += primes[j];
                }
            }
            for(long j = l; j <= r; j++) {
                if(!notPrime[getN(j)].get(getP(j))) {
                    if(j > limit) break;
                    out.write((j + "\n").getBytes());
                    counter ++;
                }
            }
            out.flush();
        }

        out.close();
    }
    public static void main(String[] args) throws IOException {
        counter = 0;
        limit = 1L << 60;
        long start = System.currentTimeMillis();
        try {
            smallestPrimes("23097775d_SunHansong.txt");
        } catch (OutOfMemoryError outOfMemoryError) {
            //Log the info
            System.err.println("Array size too large");
            System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
        }
        long end = System.currentTimeMillis();
        System.out.println("I found " + counter + " primes below " + limit + " in " + (end - start) / 1000. + " seconds.");
    }
}