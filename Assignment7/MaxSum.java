class MaxSum
{ 
    int maxSum(int arr[], int n) 
    { 
        int inc=arr[0]; 
        int exc=0; 
        int excnew; 
        int i; 
        for (i = 1; i < n; i++) 
        { 
            excnew=(inc > exc) ? inc : exc; 
            inc=exc + arr[i]; 
            exc=excnew; 
        } 
        return ((inc>exc) ? inc : exc); 
    } 
    public static void main(String[] args) 
    { 
        MaxSum obj=new MaxSum(); 
        int[] arr={5,5,10,40,50,35}; 
        System.out.print(obj.maxSum(arr,arr.length));
    } 
} 