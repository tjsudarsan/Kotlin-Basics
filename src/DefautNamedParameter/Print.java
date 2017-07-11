package DefautNamedParameter;

/**
 * Created by Sudarsan on 23-05-2017.
 */
public class Print {
    public static void main(String args[]){
        System.out.println(FunctionsKt.add(5)); //Single parameter passing requires @JVMOverloads in kotlin file
        //otherwise we need to give two parameters compulsory
        System.out.println(FunctionsKt.add(8,0.10));
    }
}
