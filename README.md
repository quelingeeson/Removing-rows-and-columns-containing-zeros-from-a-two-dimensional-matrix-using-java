# Removing-rows-and-columns-containing-zeros-from-a-two-dimensional-matrix-using-java
Given an integer matrix of size, say, M x N, you have to write a program to remove all the rows and columns consisting of all zeros. Your program must remove those rows and columns that consist of zero valued elements only. That is, if all the elements in a row (column) are zeros, then remove that row (column). All the remaining rows and columns should be output. 

Input Specification: • The first line of input will have two integers, say, M and N. M specifies the number of rows in the matrix and N specifies the number of columns in the matrix. • This will be followed by M lines, each consisting of N integers. Note: Assume 1 &lt;= M &lt;= 10 and 1 &lt;= N &lt;= 10. Also, you may assume that there is at least one non-zero element in the given matrix. 

Output Specification: The output should be the resulting matrix. Each row of the output matrix should be terminated by a newline character. There should be exactly one space (not tab) between successive elements in each row.

example1:<br/>
Sample Input:<br/>
4 4<br/>
1 2 3 4<br/>
0 0 0 0<br/>
5 6 7 8<br/>
0 0 0 3<br/>
Sample Output:<br/>
1 2 3 4<br/>
5 6 7 8<br/>
0 0 0 3<br/>


example2:<br/>
Sample Input:<br/>
4 5<br/>
1 2 0 3 5<br/>
0 0 0 0 0<br/>
4 5 0 6 9<br/>
7 8 0 9 1<br/>
Sample Output:<br/>
1 2 3 5<br/>
4 5 6 9<br/>
7 8 9 1<br/>
