package fromHackerRank.javaPractices.practice7;

public class JavaSingletonPattern {
}

//java 8

class Singleton{

    private static Singleton singleton;

    String str;

    private Singleton(){}

    public static Singleton getSingleInstance(){

        if (singleton==null)
        {
            return new Singleton();
        }
        else
        {
            return singleton;
        }

    }


}