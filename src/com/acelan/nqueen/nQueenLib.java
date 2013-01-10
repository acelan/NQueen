package com.acelan.nqueen;

public class nQueenLib {

	final static int MAX_SIZE= 20;

	private static int[] cols= new int[MAX_SIZE+1];
	private static int[] x= new int[2*MAX_SIZE];
	private static int[] y=new int[2*MAX_SIZE];

	public static int queen( int n, int row)
	{
	        if( row == n+ 1)
	                return 1;

	        int num= 0;
	        for( int col= 1; col <= n; col++)
	        {
	                if( ( cols[ col] == 0) && ( x[ n- row+ col] == 0) && ( y[ row+ col- 1] == 0))
	                {
	                        cols[ col]= x[ n- row+ col]= y[ row+ col- 1]= 1;
	                        num+= queen( n, row+ 1);
	                        cols[ col]= x[ n- row+ col]= y[ row+ col- 1]= 0;
	                }
	        }

	        return num;
	}

	public static int nQueenCount( int n)
	{
	        for( int i= 0; i<= n; i++)
	                cols[ i]= x[ i]= y[ i]= 0;
	        int row= 1;
	        return queen( n, row);
	}
	
}
