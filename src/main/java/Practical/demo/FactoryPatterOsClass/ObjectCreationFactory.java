package Practical.demo.FactoryPatterOsClass;

public class ObjectCreationFactory {

    public Os getInstance(String value){

        if (value.equals("Android"))
            return new Android();
        else if (value.equals("IOS"))
            return new Ios();
        else
            return new Windows();
    }
}
