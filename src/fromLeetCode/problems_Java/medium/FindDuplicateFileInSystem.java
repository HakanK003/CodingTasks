package fromLeetCode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindDuplicateFileInSystem {

    public List<List<String>> findDuplicate(String[] paths) {

        List<List<String>> duplicatedPaths = new ArrayList<>();

        LinkedList<String> contents = new LinkedList<>();

        for (String path : paths) {
            contents.add( path.substring(path.indexOf("(")+1, path.indexOf(")")) );
        }

        for (int i = 0; i < contents.size(); i++) {
            String current = contents.pop();
            boolean duplicated = false;
            List<String> groupOfPaths = new ArrayList<>();

            for (int j = 0; j < contents.size(); j++) {

                if (contents.get(j).equals(current)){
                    duplicated = true;
                    groupOfPaths.add(paths[j]);
                }
            }

            if (duplicated) {
                groupOfPaths.add(current);
                duplicatedPaths.add(groupOfPaths);
            }


            contents.offer(current);

        }

        return duplicatedPaths;
    }

}
