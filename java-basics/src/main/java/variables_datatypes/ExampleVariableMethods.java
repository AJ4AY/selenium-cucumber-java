package variables_datatypes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by ajayk on 09/10/2015.
 */
public class ExampleVariableMethods {

    int i;
    String fawad;

    public String Automation(){
        fawad="Fawad is Automation Expert";
        System.out.println(fawad);
        return fawad;
    }

    public int sanjeev(int i){
        i=100;
        System.out.println(i);
        return i;
    }

    public void atif(String S){
        S="I am Java Programmer";
        System.out.println(S);

    }

    public static void main(String[] args){
        ExampleVariableMethods Ex=new ExampleVariableMethods();
        Ex.atif("");
        Ex.sanjeev(1);
        Ex.Automation();

}}
