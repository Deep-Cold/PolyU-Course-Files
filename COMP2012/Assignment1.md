1. Suppose that there is not a number that greater or equal than $m$. 

    The original sum of $a_i$, $\sum_{i=1}^n a_i = n\cdot m$.

    Since there is not a number that greater than $m$. 

    Let $t$ be the largest less than $m$, we have $t<m$ . 

    Under this situation, let the new numbers we get be $a_i'$. The maximal possible sum of $a_i'$ is $\sum_{i=1}^na_i' = t\cdot n<n\cdot m =\sum_{i=1}^na_i$. Which is contradictory to the original sum of $a_i$. 

    Thus, there must be a number that grater or equal than $m$.

2. Suppose that $(A-B)\ \cap\ (B-A) \not= \varnothing$

    Which means $\{x\mid x\in A\ \and \ x\notin B\}\ \cap\ \{x\mid x\in B\ \and\ x\notin A \} \not= \varnothing$

    $\exist x, x\in A\ \and\ x\notin B\ \and \ x\in B\ \and x\notin A$ is True.

    Since $x\in A\ \and x\notin A = F, x\in B\ \and\ x\notin B =F$

    So, there is a contradictory in our assumption.

    Thus, $(A-B)\ \cap\ (B-A) \not= \varnothing$

3. (a) Let $(\neg r\ \and\ (p\to\neg q)) \to r$ be $A$, $p\to(q\to r)$ be $B$.

    | $p$  | $q$  | $r$  | $p\to \neg q$ | $\neg r$ | $\neg r\ \and\ (p\to\neg q)$ | $A$  | $q\to r$ | $B$  |
    | ---- | ---- | ---- | ------------- | -------- | ---------------------------- | ---- | -------- | ---- |
    | T    | T    | T    | F             | F        | F                            | T    | T        | T    |
    | T    | T    | F    | F             | T        | F                            | T    | F        | F    |
    | T    | F    | T    | T             | F        | F                            | T    | T        | T    |
    | T    | F    | F    | T             | T        | T                            | F    | T        | T    |
    | F    | T    | T    | T             | F        | F                            | T    | T        | T    |
    | F    | T    | F    | T             | T        | T                            | F    | F        | T    |
    | F    | F    | T    | T             | F        | F                            | T    | T        | T    |
    | F    | F    | F    | T             | T        | T                            | F    | T        | T    |

    It can be shown that column $A$ and $B$ are **not** identical. So, $(\neg r\ \and\ (p\to\neg q)) \to r$ and $p\to(q\to r)$ are **not** logically equivalent.

    (b) Let $p\leftrightarrow q $ be $C$, $(p\ \and\ q) \ \or\ (\neg p\ \and\ \neg q)$ be $D$.

    | $p$  | $q$  | $C$  | $p\ \and\ q$ | $\neg p \ \and\ \neg q$ | $D$  |
    | ---- | ---- | ---- | ------------ | ----------------------- | ---- |
    | T    | T    | T    | T            | F                       | T    |
    | T    | F    | F    | F            | F                       | F    |
    | F    | T    | F    | F            | F                       | F    |
    | F    | F    | T    | F            | T                       | T    |

    It can be shown that column $C$ and column $D$ are identical. So $p\leftrightarrow q $ and $(p\ \and\ q) \ \or\ (\neg p\ \and\ \neg q)$ are logically equivalent.

4. (a) $D = \{6,\ 8,\ 9,\ 10,\ 12,\ 14,\ 15,\ 16,\ 18,\ 20\}$

    $P(x)$ can be $x\ mod\ 2 = 0$, $Q(x)$ can be $x\ mod\ 2 = 1$.

    Within $D, \{6,\ 8,\ 10,\ 12,\ 14,\ 16,\ 18,\ 20\}$ can satisfy $P(x)$, $\{9,\ 15\}$  can satisfy $Q(x)$

    And since any integer $x$ can not satisfy $x\ mod \ 2 = 0$ and $x\ mod  \ 2 = 1$ at the same time due to the only value of the remainder. So, $\neg(\exist z\in D\ P(z)\ \and\ Q(z))$ is true. 

    (b) Try to prove $(A\ \cap\ B)' =A'\ \cup\ B'$

    ![Q4b](D:\Homework\COMP2012\Q4b.png)

    It can be shown that both the area of $(A\ \cap\ B)' $ and $A'\ \cup\ B'$ can be represent by the area colored **blue** in the graph. So, we can prove that $(A\ \cap \ B)' =A'\ \cup\ B'$.

5. (a)

    ![Q5a.drawio](D:\Homework\COMP2012\Q5a.drawio.png)

    Let students choose **AIoT** within the set $A$, choose **Data Science** within the set $D$, and choose **Metaverse** within the set $M$. The Venn Diagram can be represent by the graph above.

    $|A\ \cup\ D| = |A|+|D| -|A\ \cap\ D|=150+140-50=240$

    $|(A\ \cap M)\ \cup\ (D\ \cap\ M)|=|A\ \cap\ M|+|D\ \cap\ M|-|A\ \cap\ D\ \cap\ \ M| = 45 +55-30=70$

    $|A\ \cup\ D\ \cup\ M| =|A\ \cup\ D|+|M|-|(A\ \cap\ M)\ \cup\ (D\ \cap\ M)|=240+160-70=330$

    So, the total number of Year 4 COMP students of this Academic Year is 330.

    (b)

    Suppose the student completes above or equal than two elective courses are within the set $P$

    Then, $|P| = |A\ \cap\ D|+|D\ \cap\ M|-|A\ \cap\ D\ \cap\ M|=55+50-30=75$.

    So, there are 75 persons will be eligible to receive this. 

6. (a)

    1. $b\to m$
    2. $r\to b$
    3. $(b\ \and\neg r)\to f$

    (b)

    Since David is a member of the library, and he borrowed a book but did not return the book within two weeks. So be can obtain $m,\ b,\ \neg r$.

    According to the (a)3, $(b\ \and\neg r)\to f$. So, $f$ is true, which means David will be fined.

7. The photo is attached below.![微信图片_20241013104028](D:\Homework\COMP2012\微信图片_20241013104028.png)

8. (a)
    $$
    C^T=
    \begin{bmatrix}
    1&3&5\\
    2&4&6
    \end{bmatrix}\Rightarrow
    (C^T)^T=
    \begin{bmatrix}
    1&2\\
    3&4\\
    5&6
    \end{bmatrix}\\
    (C^T)^TB=
    \begin{bmatrix}
    1&2\\
    3&4\\
    5&6
    \end{bmatrix}
    \begin{bmatrix}
    2&-1\\
    1&3
    \end{bmatrix}=
    \begin{bmatrix}
    1\times2+2\times1&1\times(-1)+2\times3\\
    3\times2+4\times1&3\times(-1)+4\times3\\
    5\times2+6\times1&5\times(-1)+6\times3
    \end{bmatrix}=
    \begin{bmatrix}
    4&5\\
    10&9\\
    16&13
    \end{bmatrix}
    $$
    (b)

    Let $X=A^2+2AB+B^2,Y=(A+B)^2$
    $$
    \begin{align}
    X&=A^2+2AB+B^2\\
    &=
    \begin{bmatrix}1&0\\2&-1\end{bmatrix}
    \begin{bmatrix}1&0\\2&-1\end{bmatrix}+
    2\begin{bmatrix}1&0\\2&-1\end{bmatrix}
    \begin{bmatrix}2&-1\\1&3\end{bmatrix}+
    \begin{bmatrix}2&-1\\1&3\end{bmatrix}
    \begin{bmatrix}2&-1\\1&3\end{bmatrix}\\
    &=\begin{bmatrix}1&0\\0&1\end{bmatrix}+
    \begin{bmatrix}4&-2\\6&-10\end{bmatrix}+
    \begin{bmatrix}3&-5\\5&8\end{bmatrix}\\
    &=\begin{bmatrix}8&-7\\11&-1\end{bmatrix}\\\\
    Y&=(A+B)^2\\
    &=\left(\begin{bmatrix}1&0\\2&-1\end{bmatrix}+
    \begin{bmatrix}2&-1\\1&3\end{bmatrix}\right)^2\\
    &=\left(\begin{bmatrix}3&-1\\3&2\end{bmatrix}\right)^2\\
    &=\begin{bmatrix}6&-5\\15&1\end{bmatrix}\\\\
    
    \end{align}
    $$
    $\because X!=Y,\ \therefore A^2+2AB+B^2\not=(A+B)^2$

    (c)
    $$
    \begin{align}
    D\begin{bmatrix}x&3\\y&3\end{bmatrix}&=E\\
    \begin{bmatrix}-6&5\\4&1\end{bmatrix}\begin{bmatrix}x&3\\y&3\end{bmatrix}&=\begin{bmatrix}-20&-3\\22&15\end{bmatrix}\\
    \begin{bmatrix}-6x+5y&-3\\4x+y&15\end{bmatrix}&=\begin{bmatrix}-20&-3\\22&15\end{bmatrix}\\
    \end{align}
    $$
    
    $$
    \begin{equation}
    \left\{
    \begin{array}{lr}
    -6x+5y=-20 &\\
    4x+y=22&
    \end{array}
    \right.
    \end{equation}
    $$
    We can obtain $x=5,\ y=2$, from the equation.

9. 
    $$
    \begin{flalign}
    &\textup{Insertion-Sort(Array}\ A,\ \textup{Integer}\ n)\\
    &1.\ \textup{for integer }i\leftarrow2\textup{ to }n\\
    &2.\ \qquad k\leftarrow A[i]\\
    &3.\ \qquad j\leftarrow i-1\\
    &4.\ \qquad \textup{while }j>0\textup{ and } A[j]>k\ do\\
    &5.\ \qquad \qquad A[j+1]\leftarrow A[j]\\
    &6.\ \qquad \qquad j\leftarrow j-1\\
    &7.\ \qquad A[j+1]=k&
    \end{flalign}
    $$
    For Selection-Sort

    | Line                                                      | Cost  | Frequency(Best case) | Frequency(Worst case) |
    | --------------------------------------------------------- | ----- | -------------------- | --------------------- |
    | $1.\ \textup{for integer } i\leftarrow1\textup{ to }n-1$  | $c_1$ | $n-1$                | $n-1$                 |
    | $2.\ k\leftarrow i$                                       | $c_2$ | $n-1$                | $n-1$                 |
    | $3.\ \textup{for integer } j\leftarrow i+1\textup{ to }n$ | $c_3$ | at most $n^2$        | at most $n^2$         |
    | $4.\ \textup{if }A[k]>A[j]\textup{ then}$                 | $c_4$ | at most $n^2$        | at most $n^2$         |
    | $5.\ k\leftarrow j$                                       | $c_5$ | at most $n$          | at most $n^2$         |
    | $6.\ \textup{swap } A[i]\textup{ and }A[k]$               | $c_6$ | $n-1$                | $n-1$                 |

    We can obtain that both Best case and Worst case for Selection-Sort the complexity is $O(n^2)$

    For Insertion-Sort

    | Line                                                  | Cost  | Frequency(Best case) | Frequency(Worst case) |
    | ----------------------------------------------------- | ----- | -------------------- | --------------------- |
    | $1.\ \textup{for integer }i\leftarrow2\textup{ to }n$ | $c_1$ | $n-1$                | $n-1$                 |
    | $2.\ k\leftarrow A[i]$                                | $c_2$ | $n-1$                | $n-1$                 |
    | $3.\ j\leftarrow i-1$                                 | $c_3$ | $n-1$                | $n-1$                 |
    | $4.\ \textup{while }j>0\textup{ and } A[j]>k\ do$     | $c_4$ | $n-1$                | at most $n^2$         |
    | $5.\ A[j+1]\leftarrow A[j]$                           | $c_5$ | $0$                  | at most $n^2$         |
    | $6.\ j\leftarrow j-1\\$                               | $c_6$ | $0$                  | at most $n^2$         |
    | $7.\ A[j+1]=k$                                        | $c_7$ | $n-1$                | $n-1$                 |

    We can obtain that the complexity for the Best case of Insertion-Sort is $O(n)$, while the Worst case is $O(n^2)$

    From the analysis above, we find that for Selection-Sort, the complexity is same for all the cases, but Insertion-Sort works at a lower complexity for better case. And their complexity at the worst case is the same. So, Insertion-Sort is more efficient.

10. When $n=1$,
    $$
    LHS= \sum_{r=1}^1 r^2=1^2=1\\
    RHS=\frac{1}{6}\times1\times(1+1)\times(2\times1+1)=1\\
    LHS=RHS
    $$
    Assume that for some $k\in\N$, we have $\sum_{r=1}^kr^2=\frac{1}{6}k(k+1)(2k+1)$.

    For $n=k+1$, 
    $$
    \begin{align}
    LHS&=\sum_{r=1}^{k+1}r^2=\sum_{r=1}^{k}r^2+(k+1)^2\\
    &=\frac1 6k(k+1)(2k+1)+(k+1)^2\\
    &=(k+1)(\frac{2k^2+k+6k+6}{6})\\
    &=\frac16(k+1)(2k^2+7k+6)\\
    &=\frac16(k+1)(k+2)(2k+3)\\
    &=\frac16(k+1)((k+1)+1)(2(k+1)+1)\\
    &=RHS
    \end{align}
    $$
    By the principle of Mathematical Induction we can obtain that for $\forall n\in\N$, we have the conclusion that:
    $$
    \sum_{r=1}^nr^2=\frac16n(n+1)(2n+1)
    $$