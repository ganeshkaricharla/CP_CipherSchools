class LCS 
{
int lcs( char[] X, char[] Y, int m, int n ) 
{ 
	int mat[][] = new int[m+1][n+1]; 
	for (int i=0; i<=m; i++) 
	{ 
	for (int j=0; j<=n; j++) 
	{ 
		if (i == 0 || j == 0) 
			mat[i][j] = 0; 
		else if (X[i-1] == Y[j-1]) 
			mat[i][j] = mat[i-1][j-1] + 1; 
		else
			mat[i][j] = max(mat[i-1][j], mat[i][j-1]); 
	} 
	} 
return mat[m][n]; 
} 
int max(int a, int b) 
{ 
	return (a > b)? a : b; 
} 

public static void main(String[] args) 
{ 
	LCS lcs = new LCS(); 
	String s1 = "AGGTAB"; 
	String s2 = "GXTXAYB"; 

	char[] X=s1.toCharArray(); 
	char[] Y=s2.toCharArray(); 
	int m = X.length; 
	int n = Y.length; 

	System.out.println(lcs.lcs( X, Y, m, n ) ); 
} 

} 
