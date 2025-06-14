1. $(a)$

    If we choose $\{(S,A),(S,C),(S,E)\}$, the total cost is $10+15+18=43$

    If we choose $\{(S,A),(S,C),(E,F)\}$, the total cost is $10+15+15=40$

    If we choose $\{(S,A),(S,C),(F,G)\}$, the total cost is $10 +15+10=35$

    If we choose $\{(S,A),(C,B),(S,E)\}$, the total cost is $10 +15+18=43$

    If we choose $\{(S,A),(C,B),(E,F)\}$, the total cost is $10 +15+15=40$

    If we choose $\{(S,A),(C,B),(F,G)\}$, the total cost is $10 +15+10=35$

    If we choose $\{(A,B),(S,C),(S,E)\}$, the total cost is $8+15+18=41$

    If we choose $\{(A,B),(S,C),(E,F)\}$, the total cost is $8+15+15=38$

    If we choose $\{(A,B),(S,C),(F,G)\}$, the total cost is $8+15+10=33$

    If we choose $\{(A,B),(C,B),(S,E)\}$, the total cost is $8+15+18=41$

    If we choose $\{(A,B),(C,B),(E,F)\}$, the total cost is $8+15+15=38$

    If we choose $\{(A,B),(C,B),(F,G)\}$, the total cost is $8+15+10=33$

    Among all the cases, the min-cut is $\{(A,B),(S,C),(F,G)\}$, which value is $33$. According to the max-flow min-cur theorem, the max-flow is $33$.

    $(b)(i)$

    According to Fold-Fulkerson algorithm.

    Initialization: $Flow = 0$

    ![1.1](D:\Homework\COMP2012\1.1.png)

    ![1.2](D:\Homework\COMP2012\1.2.png)

    Iteration 1: Augmented Path 1: $S-A-B-T\to Flow=Flow+8 = 8$

    ![2.1](D:\Homework\COMP2012\2.1.png)

    ![2.2](D:\Homework\COMP2012\2.2.png)

    Iteration 2: Augmented Path 2: $S-C-B-T\to Flow=Flow+7=15$

    ![3.1](D:\Homework\COMP2012\3.1.png)

    ![3.2](D:\Homework\COMP2012\3.2.png)

    Iteration 3: Augmented Path 3: $S-C-B-G-D-T\to Flow=Flow+8=23$

    ![4.1](D:\Homework\COMP2012\4.1.png)

    ![4.2](D:\Homework\COMP2012\4.2.png)

    Iteration 4: Augmented Path 4: $S-E-F-G-T\to Flow=Flow+10=33$

    ![5.1](D:\Homework\COMP2012\5.1.png)

    ![5.2](D:\Homework\COMP2012\5.2.png)

    No more possible augmented paths left

    Hence, maximum $Flow = 33$

    $(ii)$

    According to the Edmonds-Karp algorithm

    Initialization $Flow = 0$

    Iteration 1: Augmented Path 1: $S-A-B-T\to Flow=Flow+8 = 8$

    ![2.1](D:\Homework\COMP2012\2.1.png)

    ![2.2](D:\Homework\COMP2012\2.2.png)

    Iteration 2: Augmented Path 2: $S-C-B-T\to Flow=Flow+7=15$

    ![3.1](D:\Homework\COMP2012\3.1.png)

    ![3.2](D:\Homework\COMP2012\3.2.png)

    Iteration 3: Augmented Path 3: $S-C-B-G-T\to Flow=Flow+8=23$

    ![6.1](D:\Homework\COMP2012\6.1.png)

    ![6.2](D:\Homework\COMP2012\6.2.png)

    Iteration 4: Augmented Path 4: $S-E-F-G-T\to Flow=Flow+2=25$

    ![7.1](D:\Homework\COMP2012\7.1.png)

    ![7.2](D:\Homework\COMP2012\7.2.png)

    Iteration 5: Augmented Path 5: $S-E-F-G-D-T\to Flow=Flow+8=33$
    
    ![5.1](D:\Homework\COMP2012\5.1.png)
    
    ![5.2](D:\Homework\COMP2012\5.2.png)
    
    No more possible augmented paths left
    
    Hence, maximum $Flow = 33$
    
    $(c)$
    
    Initial
    
    Vertex Sets: $\{S\},\{A\},\{B\},\{C\},\{D\},\{E\},\{F\},\{G\},\{H\},\{T\}$
    
    Edge chose: $\{\}$
    
    Iteration 1: For edge $(D,B)=5$ , $B$ and $D$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A\},\{B,D\},\{C\},\{E\},\{F\},\{G\},\{H\},\{T\}$
    
    Edge chose: $\{(D,B)\}$
    
    Iteration 2: For edge $(G,C)=5$ , $G$ and $C$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A\},\{B,D\},\{C,G\},\{E\},\{F\},\{H\},\{T\}$
    
    Edge chose: $\{(D,B),(G,C)\}$
    
    Iteration 3: For edge $(H,G)=5$ , $H$ and $G$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A\},\{B,D\},\{C,G,H\},\{E\},\{F\},\{T\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G)\}$
    
    Iteration 4: For edge $(H,T)=5$ , $H$ and $T$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A\},\{B,D\},\{C,G,H,T\},\{E\},\{F\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T)\}$
    
    Iteration 5: For edge $(A,B)=8$ , $A$ and $B$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A,B,D\},\{C,G,H,T\},\{E\},\{F\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T),(A,B)\}$
    
    Iteration 6: For edge $(G,D)=8$ , $G$ and $D$ are not in a set, choose.
    
    Vertex Sets: $\{S\},\{A,B,C,D,G,H,T\},\{E\},\{F\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T),(A,B),(G,D)\}$
    
    Iteration 7: For edge $(D,T)=8$ , $D$ and $T$ are in a set, not choose.
    
    Iteration 8: For edge $(H,D)=8$ , $H$ and $D$ are in a set, not choose.
    
    Iteration 9: For edge $(S,A)=10$ , $S$ and $A$ are not in a set, choose.
    
    Vertex Sets: $\{S,A,B,C,D,G,H,T\},\{E\},\{F\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T),(A,B),(G,D),(S,A)\}$
    
    Iteration 10: For edge $(B,G)=10$ , $B$ and $G$ are in a set, not choose.
    
    Iteration 11: For edge $(F,G)=10$ , $F$ and $G$ are not in a set, choose.
    
    Vertex Sets: $\{S,A,B,C,D,F,G,H,T\},\{E\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T),(A,B),(G,D),(S,A),(F,G)\}$
    
    Iteration 12: For edge $(G,T)=10$ , $G$ and $T$ are in a set, not choose.
    
    Iteration 13: For edge $(S,C)=15$ , $S$ and $C$ are in a set, not choose.
    
    Iteration 14: For edge $(C,B)=15$ , $C$ and $B$ are in a set, not choose.
    
    Iteration 15: For edge $(E,F)=15$ , $E$ and $F$ are not in a set, choose.
    
    Vertex Sets: $\{S,A,B,C,D,E,F,G,H,T\}$
    
    Edge chose: $\{(D,B),(G,C),(H,G),(H,T),(A,B),(G,D),(S,A),(F,G),(E,F)\}$
    
    Now, all the vertexes are in a set. 
    
    We obtain the final spanning tree is ${(D,B),(G,C),(H,G),(H,T),(A,B),(G,D),(S,A),(F,G),(E,F)}$
    
    whose value is $5+5+5+5+8+8+10+10+15=71$


​    

2. $(a)$

    We use vertexes $A,B,C,D,E$ to represent **Adam**, **Bob**, **Cathy**, **David**, **Elise** respectively.

    And we use vertexes $1,2,3,4,5$ to represent **TJ1**, **TJ2**, **TJ3**, **TJ4**, **TJ5** respectively.

    We can get graph as below.

    ![a](D:\Homework\COMP2012\Q2\a.png)

    $(b)$

    We use the Ford-Fulkerson algorithm because the maximum flow is not exceed $5$. We can create the initial graph below

    Initial $Flow=0$

    ![1.1](D:\Homework\COMP2012\Q2\1.1.png)

     ![1.2](D:\Homework\COMP2012\Q2\1.2.png)

    Iteration 1: Augmented path 1: $S-A-1-T\to Flow=Flow+1=1$

    ![2.1](D:\Homework\COMP2012\Q2\2.1.png)

    ![2.2](D:\Homework\COMP2012\Q2\2.2.png)

    Iteration 2: Augmented path 1: $S-B-1-A-2-T\to Flow=Flow+1=2$

    ![3.1](D:\Homework\COMP2012\Q2\3.1.png)

    ![3.2](D:\Homework\COMP2012\Q2\3.2.png)

    Iteration 3: Augmented path 1: $S-C-3-T\to Flow=Flow+1=3$

    ![4.1](D:\Homework\COMP2012\Q2\4.1.png)

    ![4.2](D:\Homework\COMP2012\Q2\4.2.png)

    

    Iteration 4: Augmented path 1: $S-D-4-T\to Flow=Flow+1=4$

    ![5.1](D:\Homework\COMP2012\Q2\5.1.png)

     ![5.2](D:\Homework\COMP2012\Q2\5.2.png)

    Iteration 5: Augmented path 1: $S-E-5-T\to Flow=Flow+1=5$

    ![6.1](D:\Homework\COMP2012\Q2\6.1.png)

    ![6.2](D:\Homework\COMP2012\Q2\6.2.png)

    No more possible augmented paths left

    Hence, maximum $Flow = 5$

    Thus, the final assignment is $(Adam\to TJ2),(Bob\to TJ1),(Cathy\to TJ 3),(David\to TJ4),(Elise\to TJ5)$

    

3. $(a)$

    ![1](D:\Homework\COMP2012\Q3\1.png)

    $(b)$

    It's not a balanced tree. Because for leaves $6$ are not at height $h=4$ or $h-1=3$, their height is $2$

    $(c)$

    pre-order: $46,9,6,42,21,45,99,56,76,82$

    $(d)$

    post-order: $6,21,45,42,9,82,76,56,99,46$

    $(e)$

    in-order: $6,9,21,42,45,46,56,76,82,99$

    $(f)$

    First, when we delete $46$, we need to replace it by the minimum node in its right subtree: $56$

    When we need to delete $56$, it has one child, we replace $56$ by $76$

    Thus the final tree is

    ![2](D:\Homework\COMP2012\Q3\2.png)

4. $(a)$

    The K-map can be represented as below

    |                | $BC$ | $\overline{B}C$ | $\overline{BC}$ | $B\overline{C}$ |
    | -------------- | ---- | --------------- | --------------- | --------------- |
    | $A$            | 1    | 1               |                 | 1               |
    | $\overline{A}$ | 1    |                 |                 |                 |

     Thus, $F(A,B,C)$ can be simplify as $F(A,B,C)=BC+AB+AC$

    $(b)(i)$

    The table can be represented as below

    | $A$  | $B$  | $C_{in}$ | $S$  | $C_{out}$ |
    | ---- | ---- | -------- | ---- | --------- |
    | 0    | 0    | 0        | 0    | 0         |
    | 0    | 0    | 1        | 1    | 0         |
    | 0    | 1    | 0        | 1    | 0         |
    | 0    | 1    | 1        | 0    | 1         |
    | 1    | 0    | 0        | 1    | 0         |
    | 1    | 0    | 1        | 0    | 1         |
    | 1    | 1    | 0        | 0    | 1         |
    | 1    | 1    | 1        | 1    | 1         |

    $(ii)$ The logic of $S$ is $S = A\oplus B \oplus C_{in}$ 

    $(iii)$ The logic of $C_{out}$ is $C_{out} = AB+BC_{in}+AC_{in} = C_{in}(A\oplus B) + AB$, which is the same as $4(a)$

    $(iv)$ It can be represented by the graph below.

    ![Full adder](D:\Homework\COMP2012\Q3\Full adder.png)

    

5. $(a)$

    It can be represented by the graph below (*Note that all the unit of length is **Meter(s)***)

    ![graph](D:\Homework\COMP2012\Q5\graph.png)

    $(b)$

    Suppose that in this situation $M$ cannot directly go to $VA$

    We use Dijkstra's algorithm start from point $Q$

    Initialization:

     $Dis =(Q:0),(M:\infin),(VA:\infin),(R:\infin),(S:\infin),(T:\infin),(W:\infin)$

    Iteration 1:

    Exact vertex $Q$, update vertex $M,R,T$

    $Q:d=0\ meter$

    $Dis =(M:20),(VA:\infin),(R:40),(S:\infin),(T:50),(W:\infin)$

    Iteration 2:

    Exact vertex $M$, update vertex $R,S$

    $Q: d=0\ meter,M:d=20\ meters$

    $Dis =(VA:\infin),(R:30),(S:35),(T:50),(W:\infin)$

    Iteration 3:

    Exact vertex $R$, update vertex $VA$

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters$

    $Dis =(VA:100),(S:35),(T:50),(W:\infin)$

    Iteration 4:

    Exact vertex $S$, update vertex $VA,W,T$

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters, S=35\ meters$

    $Dis =(VA:95),(T:50),(W:85)$

    Iteration 5:

    Exact vertex $T$, update vertex $W$

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters, S=35\ meters, T=50\ meters$

    $Dis =(VA:95),(W:85)$

    Iteration 6:

    Exact vertex $W$

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters, S=35\ meters, T=50\ meters, W=85\ meters$

    $Dis =(VA:95)$

    Iteration 7:

    Exact vertex $VA$

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters, S=35\ meters, T=50\ meters, W=85\ meters, VA=95\ meters$

    So the final result is:

    $Q: d=0\ meter,M:d=20\ meters, R: d= 30\ meters, S=35\ meters, T=50\ meters, W=85\ meters, VA=95\ meters$

    $(c)$

    According to the description, we need to go from $W$ to $Q$.

    Because of all the path is undirected. So the minimum distance from $W\to Q$ is equal to the minimum distance from $Q\to W$. According to the steps in $(b)$, $d_W=d_S+d(S,W)=d_M+d(M,S)+d(S,W)=d_Q+d(Q,M)+d(M,S)+d(S,W)$

    So the path from $W$ to $Q$  is $W\to S\to M\to Q$, whose length is $85\ meters$.



