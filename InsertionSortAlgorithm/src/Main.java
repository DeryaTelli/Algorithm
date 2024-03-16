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
        // once kodu for dongusu ile dolasiyoruz
        for(int j=1 ; j<n; j++){
            // anahtarima a nin dizi elemanlarini atiyorum tek tek
            int key=A[j];
            // j degerini 1 azaltip i ye esitliyorum
            int i=j-1;
            //while dongusunde kotrol ediyorum
            while(i>=0 && A[i]>key){
                //kiyaslama yaptiktan sonra adizimdeki i index degerini yeni yerine atiyorum i yi bir azaltiyorum
                A[i+1]=A[i];
                i-=1;
            }
            // anahtar degerimi yeni degerine atiyorum ve dongu kucukten buyuge dogru siralanincaya kadar donguyu devam ettiyorum
            A[i+1]=key;
        }
    }


}
