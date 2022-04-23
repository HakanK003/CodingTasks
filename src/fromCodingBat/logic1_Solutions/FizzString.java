package fromCodingBat.logic1_Solutions;

public class FizzString {

    public String fizzString(String str) {

        String result = "";

        if(str.startsWith("f")){result+="Fizz";}
        if(str.endsWith("b")){result+="Buzz";}

        return result.isEmpty()? str : result ;

    }

}

/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
(See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */