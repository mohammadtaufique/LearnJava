package JavaPractice;

public class MultiDArray {
    public static void main(String[] args) {
        int mA[][] = new int[3][4];
        for(int i=0;i< mA.length;i++){
            for(int j=0;j<mA[i].length;j++){
                mA[i][j] = (int) (Math.random()*10);
            }
        }
        for(int i=0;i< mA.length;i++){
            for(int j=0;j<mA[i].length;j++){
                System.out.print(mA[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] i : mA){
            for(int j:i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
