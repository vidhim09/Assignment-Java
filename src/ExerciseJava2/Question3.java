package ExerciseJava2;

class Data{
    static int data =10/0;
}
public class Question3 {
    public static void main(String[] args) {
        System.out.println("ClassNotFoundException");
        try{
            Class.forName("com.ExerciseJava2.Test");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("NoClassDefFoundError");
        try{
            Data d1 = new Data();
        }catch(Throwable e){
            System.out.println(e);
        }
        Data d2 = new Data();
    }
}
