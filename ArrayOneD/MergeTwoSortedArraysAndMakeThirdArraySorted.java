package ArrayOneD;

public class MergeTwoSortedArraysAndMakeThirdArraySorted {
    public static void main(String[] args) {
        int[] A= {1,10,11,1000,10056};
        int[] B= {23,33};
        int n= A.length;
        int m= B.length;
        int i=0;
        int j=0;
        int k=0;
        int[] C= new int[n+m];
        while(i<n || j<m){
            if(i==n){
                C[k]=B[j];
                k++;
                j++;
            }
            else if(j==m){
                C[k]=A[i];
                k++;
                i++;
            }
            else{
            if(A[i]>B[j]){
                C[k]=B[j];
                k++;
                j++;
            }
            else{
                C[k]=A[i];
                k++;
                i++;
            }
        }
        }
        for(int ind=0; ind<n+m; ind++){
        System.out.print(C[ind]+" ");
        }
    }
}
