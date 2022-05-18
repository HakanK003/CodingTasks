package fromHackerRank.javaPractices.practice7;

public class JavaInheritanceI {
}

//java 8

class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }

    void sing()
    {
        System.out.println("I am singing");
    }

}

class Solution{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}