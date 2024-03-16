public class Main {
    public static void main(String[] args) {
        int[] A ={12,11,13,5,6};
        int n = A.length;
        insertionSort(A,n);
        for(int i=0; i<n ; i++){
            System.out.println(A[i]);
        }
    }
    static void insertionSort(int[] A, int n) {
        for(int j=1 ; j<n; j++){
            int key=A[j];
            int i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i-=1;
            }
            A[i+1]=key;
        }
    }


}
