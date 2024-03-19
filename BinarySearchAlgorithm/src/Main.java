public class Main {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5,6,7};
        int x=4;
       boolean result= binarySearch(A,x,1,A.length);
        if(result){
            System.out.println("Found it");
        }else{
            System.out.println("Didn't find it");
        }
    }
     static boolean binarySearch(int[] A, int x, int firstIndex, int lastIndex) {
        //dizinin ilk indexi son indexinden kucuk mu kontrol ediyoruz
         if (firstIndex<=lastIndex) {
             //sonra dizdeki orta elemani buluyoruz
             int middle = firstIndex + (lastIndex - firstIndex) / 2;
             //eger orta elaman indexi x e esit ise aranan elemani bulduk
             if (A[middle] == x) {
                 return true;
             //eger esit degilse orta indexdeki elemandan buyuk ise ortadan sona olan indexe kadar birdaha fonksiyonu cagiririz
             } else if (A[middle] < x) {
                return binarySearch(A, x, middle + 1, lastIndex);
             //eger x kucukse ortadaki index elemanindan ilk numaradan orta numaranin bir onceki numarasina kadar fonksiyonu tekrar calistirir
             } else {
                return binarySearch(A, x, firstIndex, middle - 1);
             }
         }
         //x elemanini dizide yoksa
         return false;
     }
}