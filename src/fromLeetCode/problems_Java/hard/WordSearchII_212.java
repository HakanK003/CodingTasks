package fromLeetCode.problems_Java.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
    Related Topics
    -> Array
    -> Matrix
    -> String
    -> Backtracking
    -> Trie
 */

//TODO +do it later
public class WordSearchII_212 {

    private TrieNode root = new TrieNode();
    private int m = 0;
    private int n = 0;
    private Set<String> set = new HashSet<>();
    private int[] dir = new int[] {1, 0, -1, 0, 1};

    public List<String> findWords(char[][] board, String[] words) {
        for (String w : words) {
            insert(w);
        }
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                bt(i, j, board, new boolean[m][n], root);
            }
        }

        return new ArrayList<String>(set);
    }

    private void bt(int x, int y, char[][] board, boolean[][] visited, TrieNode node) {
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) {
            return;
        }

        int idx = board[x][y] - 'a';
        if (node.children[idx] == null) {
            return;
        }

        if (node.children[idx].w != null) {
            set.add(node.children[idx].w); // Notice: do not return. cause there may have a longer word!
        }

        visited[x][y] = true;

        for (int i = 0; i < dir.length-1; i++) {
            bt(x+dir[i], y + dir[i+1], board, visited, node.children[idx]);
        }

        visited[x][y] = false;
    }

    private void insert(String w) {
        TrieNode node = root;
        for (char ch : w.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }

        node.w = w;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String w;

}



//TODO 20ms example solution
//
//class Solution {
//    private static final char HASH_TAG = '#';
//    private Tree root = new Tree();
//
//    public List<String> findWords(char[][] board, String[] words) {
//        for (String word : words) {
//            Tree temp = root;
//            // Test case 60/63
//            for (int i = word.length() - 1; i >= 0; i--) {
//                int idx = word.charAt(i) - 'a';
//                if (temp.val[idx] == null) {
//                    temp.val[idx] = new Tree();
//                    temp.size += 1;
//                    temp.val[idx].parent = temp;
//                    temp.val[idx].idx = idx;
//                }
//                temp = temp.val[idx];
//            }
//            temp.word = word;
//        }
//        return searchWord(board);
//    }
//
//    private List<String> searchWord(char[][] board) {
//        List<String> res = new ArrayList<>();
//
//        for (int i = 0; i < board.length; i++)
//            for (int j = 0; j < board[0].length; j++) {
//                Tree temp = root;
//                checkWord(res, i, j, board, temp);
//            }
//
//        return res;
//    }
//
//    private void checkWord(List<String> res, int y, int x, char[][] board, Tree temp) {
//
//        if (x >= board[0].length || x < 0
//            || y >= board.length || y < 0)
//            return;
//
//        char ch = board[y][x];
//        if (ch== HASH_TAG || temp.val[ch - 'a'] == null)
//            return;
//
//        temp = temp.val[ch - 'a'];
//
//        if (temp.word != null) {
//            res.add(temp.word);
//            temp.word = null; // Test case 17/63: When there is more than one answer
//            Tree ptr = temp;
//            while (ptr.parent != null && ptr.isEmpty()) {
//                int idx = ptr.idx;
//                ptr = ptr.parent;
//                ptr.val[idx] = null;
//                ptr.size -= 1;
//            }
//        }
//
//        board[y][x] = HASH_TAG;
//
//        checkWord(res, y    , x + 1, board, temp);
//        checkWord(res, y    , x - 1, board, temp);
//        checkWord(res, y + 1, x    , board, temp);
//        checkWord(res, y - 1, x    , board, temp);
//
//        board[y][x] = ch;
//    }
//}
//
//class Tree {
//    Tree parent;
//    Tree[] val = new Tree[26];
//    String word;
//    int idx;
//    int size;
//
//    public boolean isEmpty() {
//        return size <= 0;
//    }
//}


//TODO 40300kb example solution
//
//class Solution {
//    List<String> res = new LinkedList<>();
//    TrieNode root = new TrieNode();
//    int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
//    int n, m;
//    public List<String> findWords(char[][] board, String[] words) {
//        n = board.length;
//        m = board[0].length;
//        for(String s: words) {
//            buildTree(s);
//        }
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                dfs(board, i, j, root);
//            }
//        }
//
//        return res;
//    }
//
//    private void dfs(char[][] board, int i, int j, TrieNode root) {
//        char oldChar = board[i][j];
//
//        int p = oldChar - 'a';
//        if(root.children[p] == null) return;
//
//        root = root.children[p];
//        if(root.word != null) {
//            res.add(root.word);
//            root.word = null;
//        }
//
//        board[i][j] = '#';
//        for(int[] d: directions) {
//            int nx = i + d[0];
//            int ny = j + d[1];
//            if(nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] != '#') {
//                int next = board[nx][ny] - 'a';
//                dfs(board, nx, ny, root);
//            }
//        }
//        board[i][j] = oldChar;
//        return ;
//    }
//
//    private void buildTree(String s) {
//        TrieNode p = root;
//        for(int i = 0; i < s.length(); i++) {
//            int cur = s.charAt(i) - 'a';
//            if(p.children[cur] == null) {
//                p.children[cur] = new TrieNode();
//            }
//            p = p.children[cur];
//        }
//        p.word = s;
//    }
//
//    class TrieNode{
//        private TrieNode[] children;
//        private String word;
//        TrieNode() {
//            children = new TrieNode[26];
//            word = null;
//        }
//    }
//
//}