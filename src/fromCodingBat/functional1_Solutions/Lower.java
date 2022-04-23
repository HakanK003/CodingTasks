package fromCodingBat.functional1_Solutions;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {

    public List<String> lower(List<String> strings) {

        return strings.stream().map(x->x.toLowerCase()).collect(Collectors.toList());

    }

}

/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */