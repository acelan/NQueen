#include "nqueen.h"
#include <android/log.h>

using namespace std;

const int MAX_SIZE= 20;

int cols[ MAX_SIZE+ 1], x[ 2* MAX_SIZE], y[ 2* MAX_SIZE];

int queen( int n, int row)
{
        if( row == n+ 1)
                return 1;

        int num= 0;
        for( int col= 1; col <= n; col++)
        {
                if( !( cols[ col] || x[ n- row+ col] || y[ row+ col- 1]))
                {
                        cols[ col]= x[ n- row+ col]= y[ row+ col- 1]= 1;
                        num+= queen( n, row+ 1);
                        cols[ col]= x[ n- row+ col]= y[ row+ col- 1]= 0;
                }
        }

        return num;
}

int nQueenCount( int n)
{
        for( int i= 0; i<= n; i++)
                cols[ i]= x[ i]= y[ i]= 0;
        __android_log_print(ANDROID_LOG_INFO, __FILE__, "log test");
        int row= 1;
        return queen( n, row);
}
