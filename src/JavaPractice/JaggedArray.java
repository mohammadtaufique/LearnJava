package JavaPractice;

public class JaggedArray {
    public static void main(String[] args) {

        /*int[][] num = new int[3][];
        num[0] = new int[5];
        num[1] = new int[3];
        num[2] = new int[4];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]= (int)(Math.random()*10);
            }
        }
        for(int[] i:num){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        student s1 = new student();
        s1.name = "Test1";
        s1.roll = 1;
        student s2 = new student();
        s2.name = "Test2";
        s2.roll = 2;
        student s3 = new student();
        s3.name = "Test2";
        s3.roll = 3;
        student ss[] = new student[3];
        ss[0]=s1;
        ss[1]=s2;
        ss[2]=s3;
        /*for(int i = 0;i< ss.length;i++){
            System.out.println(ss[i].name+" : "+ss[i].roll);
        }*/
        for(student s : ss){
            System.out.println(s.name+":"+s.roll);
        }
    }
}
class student{
    int roll;
    String name;
}
