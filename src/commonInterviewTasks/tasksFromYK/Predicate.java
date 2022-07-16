package commonInterviewTasks.tasksFromYK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {

    public static void main(String[] args) {
        ArrayList<String> list3 = new ArrayList(Arrays.asList("monkey", "donkey","onion"));
        List<String> list4 = list3.stream().filter(each->!"onion".equals(each)).collect(Collectors.toList());
        System.out.println(list4);
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result =  Arrays.asList(names.stream().filter(s->s.toString().startsWith("S")).collect(Collectors.toList()));
        System.out.println(result);
    }

}
