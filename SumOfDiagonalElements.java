class SumOfDiagonalElements {
     
    public static int difference(int arr[][], int n)
    {
        int d1 = 0, d2 = 0;        
         
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                
                if (i == j)
                    d1 += arr[i][j];
      
                
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }
      
        
        return Math.abs(d1 - d2);
    }
     
    
    public static void main(String[] args) 
    {
        int n = 3;
          
        int arr[][] =
        {
            {16, 24, 5},
            {1 , 1, 4},
            {13, 7, 3}
        };
      
        System.out.print(difference(arr, n));
        
    }
