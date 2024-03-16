public class Main {
    public static void main(String[] args) {


        int[] A={6,5,4,3,2,1};
        int n=A.length;
        mergeSort(A,n);
        for(int i=0; i<n;i++){
            System.out.println(A[i]);
        }

    }

    static void mergeSort(int A[] ,int n){
        //once siralama merge sortumuza bir dizi ve onun uzunlugunu verdik
        if(n==1){
            return;
        }
        //sonra bu dizinin orta elemanini bulduk
        int middle = n/2;
        //orta elemandan bas olan yeri yeni bir dizi yaptik
        int[] newArray1= new int[middle];
        //orta elemandan sona olan yeri yeni bir dizi yaptik
        int[] newArray2= new int[n-middle];
        //yeni diziyi A dizisi ile  tanimladik
        for(int i=0; i<middle;i++){
             newArray1[i]=A[i];
        }
        // yeni diziyi A dizisi ile tanimladik
        for(int i=middle; i<n;i++){
            newArray2[i-middle]=A[i];
        }
        // tekrar olusan yeni dizilerde sort yaptik recursive fonsiyon ile
        mergeSort(newArray1, middle);
        mergeSort(newArray2,n-middle);

        //en son olusturdugumuz merge sor ile islemi tekrar siraladik
        merge(A,newArray1,newArray2,middle,n-middle);
    }

    static void merge(int[] A, int[] newArray1,int[] newArray2, int left, int right ){
        // merge fonksiyonde a dizisini yeni dizi 1 yeni dizi 2 yi ve bunlarin uzunluklarini tanimladik
        int i=0 , j=0,k=0;
        while(i<left && j<right){
            //sag dizi eleman sayisi ve sol dizi eleman sayisi i ve j den buyuk olana kadar dongu devam edecektor

            //dizi elemanlarini kiyasliyacaktir hangisi kucukse onu yazacaktir dongu durana kadar devam edecektir
            if(newArray1[i]<=newArray2[j]){
                A[k++]=newArray1[i++];
            }else {
                A[k++] = newArray2[j++];
            }
        }
        //yukaridaki dongu durup tek eleman kalmis ise bunuda a dizisine son eleman olarak ekleyecektir while dongusu 
            while(i<left){
                A[k++]=newArray1[i++];
            }while(j<right){
                A[k++]=newArray2[j++];
            }


    }

}