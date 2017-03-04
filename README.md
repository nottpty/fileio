# File Input and Output

I ran the tasks on a MacBook Pro, and got
these results:

Task                                                  | Time
------------------------------------------------------|-------:
1.) Copy file one byte at a time.                     | 0.092714 sec
2.) Copy a file using a byte array of size 8 Bytes    | 0.013946 sec
3.) Copy a file using a byte array of size 32 Bytes   | 0.003638 sec
4.) Copy a file using a byte array of size 512 Bytes  | 0.000368 sec
5.) Copy a file using BufferedReader and PrintWriter  | 0.004953 sec

## Explanation of Results

4th task is the fastest run time because 4th task can copy many file more than 1st, 2nd,
3rd and 5th task at a time. The first task is the slowest task because it can copy file
just only one byte at a time. For a file using a byte array will faster if you increase size
of a byte array.
