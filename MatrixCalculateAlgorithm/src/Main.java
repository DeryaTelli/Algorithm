public class Main {
    public static void main(String[] args) {

        int [][] matrix3={{1,-3},{2,5}};
        int [][] matrix4={{4,0},{-1,2}};
        //olusuacak matrisi atiyoruz
        int [][] result= matrixCalculate(matrix3,matrix4);

        //olusan matrisi yazdiriyoruz
        for (int i=0 ; i<result.length ;i++){
            for(int j=0; j<result[0].length; j++){
                System.out.println(result[i][j]+" ");
            }
        }

    }

    //bu fonksiyonum bana bir multiple dizi dondurecektir
    public static int[][] matrixCalculate(int[][] matrix1, int[][] matrix2){
        //carpmada size1 matrix1in satiri size2 ise matrix2nin sutunudur
        int size1 = matrix1.length;
        int size2 = matrix2[0].length;
        int [][] result = new int[size1][size2];

        //yeni matrixi olusturmak icin carpma islemini yapiyoruz (mxn * nxm= mxm)
        for(int i=0; i< result.length;i++){
            for(int j=0; j<result[0].length; j++){
                for(int x=0; x<matrix1.length; x++){
                    result[i][j]+=matrix1[i][x]*matrix2[x][j];
                }
            }
        }
       return result;

    }
}