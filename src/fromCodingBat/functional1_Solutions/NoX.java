package fromCodingBat.functional1_Solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {

    public List<String> noX(List<String> strings) {

        return strings.stream().map(x->x.replaceAll("x","")).collect(Collectors.toList());

    }

}

/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]

 */