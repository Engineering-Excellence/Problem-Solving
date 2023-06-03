package silver.iv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 나는야 포켓몬 마스터 이다솜
public class BOJ_1620_PokemonMaster {

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int M = Integer.parseInt(numbers[1]);

        StringBuilder ans = new StringBuilder();
        Map<Integer, String> pokemonMap = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            pokemonMap.put(i, pokemon);
            reverseMap.put(pokemon, i);
        }
        for (int i = 1; i <= M; i++) {
            String prob = br.readLine();
            try {
                ans.append(pokemonMap.get(Integer.parseInt(prob))).append("\n");
            } catch (NumberFormatException e) {
                ans.append(reverseMap.get(prob)).append("\n");
            }
        }
        System.out.print(ans);
    }
}
