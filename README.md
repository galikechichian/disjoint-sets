I implemented a disjoint set (partition) data structure with union and find operations using arrays.
Here I modeled a partition of n elements with distinct integers raging from 0 to n-1 (each element has a representative integers).

Here are some examples of me running the union method:
```
6 set(s):
0 : 0
1 : 1
2 : 2
3 : 3
4 : 4
5 : 5

-> Union 2 and 3
5 set(s):
0 : 0
1 : 1
3 : 2,3
4 : 4
5 : 5

-> Union 2 and 3
5 set(s):
0 : 0
1 : 1
3 : 2,3
4 : 4
5 : 5

-> Union 2 and 1
4 set(s):
0 : 0
3 : 1,2,3
4 : 4
5 : 5

-> Union 4 and 5
3 set(s):
0 : 0
3 : 1,2,3
5 : 4,5

-> Union 3 and 1
3 set(s):
0 : 0
3 : 1,2,3
5 : 4,5

-> Union 2 and 4
2 set(s):
0 : 0
3 : 1,2,3,4,5
```
