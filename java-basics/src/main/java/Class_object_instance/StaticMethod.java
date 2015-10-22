package Class_object_instance;

/**
 * Created by AjjuBujji on 05/10/2015.
 */
public class StaticMethod {

    public String colour="Blue";
    public int doors=5;


    public static void engin(){
        System.out.println("I am a powerful Engine");
    }

    public void wheel(){
        System.out.println("A Car cannot run Without me");

    }

    public static void main(String args[]){
        StaticMethod SM=new StaticMethod();
        System.out.println(SM.colour);
        System.out.println(SM.doors);
        engin();//static object or method
        SM.wheel();//non-static object or method
    }
}
