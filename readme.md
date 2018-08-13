BIG O

-Drop the constants: big O describes rate of INCREASE not a runtime
	example O(2N) => O(N)

-Drop the Non-Dominant Terms: ignore smaller (less impactful terms)
      example:
	if O(2N2) is O(N2 * N2), we wouldn't care about latter N2, so we drop it
	therefore if we have
	O(N2 + N), we will similarly, drop the N => O(N2)

      example (B2 + A) will still remain (B2 + A) !!

-Add vs Multiply: add is operations are side by side, multiply if one is nested inside the other
     example:
		forEach(A : arr)
			  forEach(B : arr)    => O(A*B)

     example2: forEach(A : arr)
     	       forEach(B : arr)   => O(A + B)


-Log:
	How many divisions until N = 16, becomes 1
	N=16
	N=8
	N=4
	N=2
	N=1

This can be wrriten in reverse => how many times we have to multiply by 2 to get 16

        N=1
	N=2
	N=4
	N=8
	N=16
2to4th = 16
2K = N

Log2 N = K

-Recursion:
	One function makes 2 calls to itself every time its called ==> expenential growth
	O( Branches to Variable) ... O(2 to Nth)

