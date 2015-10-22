package Class_object_instance;

/**
 * Created by AjjuBujji on 05/10/2015.
 */
public class MultipleInstance {

    public static void motor(){
        String colour="blue";
        int i=555;
        System.out.println(i+"" +"" +colour);
    }

    public static void main(String args[]){
        ClassObject CO=new ClassObject();
        ClassObject1 CO1=new ClassObject1();
        StaticMethod SM=new StaticMethod();
        StaticMethod.engin();
        System.out.println("*****" + SM.doors + "*******" + SM.colour);
        System.out.println(CO.id);
        CO1.method2();
        CO1.method1();
        motor();
         }
}
