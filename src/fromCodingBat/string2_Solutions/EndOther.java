package fromCodingBat.string2_Solutions;

public class EndOther {

    public boolean endOther(String a, String b) {

        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());

    }

}

/*
Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */