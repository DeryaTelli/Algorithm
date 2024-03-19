public class Main {
    public static void main(String[] args)
    {
        System.out.println(power(2,5));
    }

    //kuvet almak icin fonksiyon
    static int power(int x , int kuvvet){
        //eger kuvvet 0 ise 1 donecektir
        if(kuvvet==0){
            return 1;
        }
        //eger kuvvet 1 ise tabani vericektir
        if(kuvvet==1){
            return x;
        //kuvvet cift ise kuvveti yariya bolup sadece bir degeri bulurum ve obur degerle carpip sonucu elde ederim
        }if(kuvvet%2==0){
            int result= power(x,kuvvet/2);
            return result*result;
        // eger kuvvet tek ise kuvet 1 cikartip yariya bolerim ve o degeri elde edip hem x tabani ve buldugum islem ile carpip sonucu elde ederim
        }else{
            int result= power(x,(kuvvet-1)/2);
            return result*result*x;
        }
        //kodu bu sekilde yazmam onun daha hizli calismasini saglayacaktir 
    }

}