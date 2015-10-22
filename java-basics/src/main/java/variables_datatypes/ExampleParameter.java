package variables_datatypes;

/**
 * Created by ajayk on 09/10/2015.
 */
public class ExampleParameter {



    public int addNumber (int aNumber) {
        int a_Value = aNumber + 20;
        System.out.println(a_Value);
        return a_Value;
    }

    public int addTotal( int aNumber ) {
        int a_Value = aNumber + 50;
        System.out.print(a_Value);

        return a_Value;
    }

    public static void main(String args[]){
        ExampleParameter parameter=new ExampleParameter();
        parameter.addNumber(1);
        parameter.addTotal(12);



    }


}
