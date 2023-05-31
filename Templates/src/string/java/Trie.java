package string.java;

// 단어 정렬
class Trie {

    private static final int ALPHABET_SIZE = 26;
    private StringBuilder sb = new StringBuilder();
    private TrieNode root;

    private static class TrieNode {

        private TrieNode[] children; // 자식 노드 배열
        private boolean isEndOfWord; // 단어의 끝을 표시하는 플래그

        public TrieNode() {
            children = new TrieNode[ALPHABET_SIZE]; // 알파벳 개수만큼의 배열 생성
            isEndOfWord = false; // 초기값은 단어의 끝이 아님
        }
    }

    public Trie() {
        root = new TrieNode(); // 루트 노드 생성
    }

    public void insert(String word) {

        TrieNode current = root;

        // 단어의 각 문자를 순회
        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; // 문자를 인덱스로 변환

            // 해당 인덱스의 자식 노드가 없으면 새로 생성하여 추가
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index]; // 현재 노드를 자식 노드로 갱신
        }

        current.isEndOfWord = true; // 마지막 노드를 단어의 끝으로 표시
    }

    public void traverseAndPrint(TrieNode node, StringBuilder prefix) {

        if (node.isEndOfWord) {
            sb.append(prefix).append("\n"); // 현재 노드가 단어의 끝이면 prefix를 출력
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            TrieNode child = node.children[i];

            if (child != null) {
                prefix.append((char) (i + 'a')); // 문자를 prefix에 추가
                traverseAndPrint(child, prefix); // 자식 노드로 재귀적으로 순회하고 출력
                prefix.deleteCharAt(prefix.length() - 1); // 다음 자식으로 이동하기 전에 prefix에서 마지막 문자 제거
            }
        }
    }

    public void printSorted() {
        traverseAndPrint(root, new StringBuilder()); // 루트 노드에서 시작하여 빈 prefix로 순회 시작
        System.out.print(sb);
    }
}

/*
    class TrieNode {

        private final Map<Character, TrieNode> children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }

        public Map<Character, TrieNode> getChildren() {
            return children;
        }

        public boolean isEndOfWord() {
            return isEndOfWord;
        }

        public void setEndOfWord(boolean endOfWord) {
            isEndOfWord = endOfWord;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {    // 단어의 각 문자를 순회
                current.getChildren().putIfAbsent(ch, new TrieNode());  // 현재 노드의 자식 중 해당 문자가 없다면 새로운 노드를 생성 후 자식 맵에 추가
                current = current.getChildren().get(ch);    // 현재 문자에 해당하는 자식 노드로 이동
            }

            current.setEndOfWord(true); // 마지막 노드를 단어의 끝으로 표시
        }

        public void traverseAndPrint(TrieNode node, StringBuilder prefix) {

            if (node.isEndOfWord()) {   // 현재 노드가 단어의 끝이라면 prefix를 출력
                System.out.println(prefix);
            }

            for (char ch : node.getChildren().keySet()) {   // 현재 노드의 각 자식 노드를 순회
                prefix.append(ch);
                traverseAndPrint(node.getChildren().get(ch), prefix);   // 자식 노드로부터 시작하는 단어를 재귀적으로 순회하고 출력
                prefix.deleteCharAt(prefix.length() - 1);   // 다음 자식으로 이동하기 전에 prefix에서 마지막 문자를 제거
            }
        }

        public void printSorted() {
            traverseAndPrint(root, new StringBuilder());    // 루트 노드에서 시작하여 빈 prefix로 순회를 시작
        }
    }
*/
