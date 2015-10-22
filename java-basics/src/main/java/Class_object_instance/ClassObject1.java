package Class_object_instance;

/**
 * Created by AjjuBujji on 05/10/2015.
 */
public class ClassObject1 {


//     object 1
    public void method1(){
        System.out.println("This is method 1");
    }

//    object2
    public void method2(){
        System.out.println("this is method 2");
    }

    public static void main(String[] args){
        ClassObject1 CO1= new ClassObject1();// creating class instance or instantiating the class
        CO1.method1();
        CO1.method2();
    }

}
