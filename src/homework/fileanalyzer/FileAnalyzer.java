package homework.fileanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileAnalyzer implements Comparator {

    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее

        String textFile = Files.readString(Paths.get(path));

        String[] words = textFile.split("\\W+");

        LinkedList<String> wordsList = new LinkedList<>(Arrays.asList(words));

        Map<String, Integer> map = new HashMap<>();

        for (String word : wordsList) {
            if (word.isEmpty()) {
                continue;
            }

            word = word.toLowerCase();

            if (map.containsKey(word)) {

                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        String textFile = Files.readString(Paths.get(path));

        int countOfWords = 0;

        String[] words = textFile.split("\\W+");
        LinkedList<String> wordsList = new LinkedList<>(Arrays.asList(words));

        for (String word : wordsList) {
            if (!word.isEmpty()) {
                countOfWords++;
            }
        }
        return countOfWords;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        String textFile = Files.readString(Paths.get(path));

        String[] words = textFile.split("\\W+");
        LinkedList<String> wordsList = new LinkedList<>(Arrays.asList(words));
        Set<String> uniqueWords = new HashSet<>();

        for (String word : wordsList) {

            if (word.isEmpty()) continue;
            uniqueWords.add(word.toLowerCase());

        }

        return uniqueWords.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        Map<String, Integer> wordCounts = wordMap(path);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        Map<String, Integer> topN = new LinkedHashMap<>();

        for (int i = 0; i < n && i < entries.size(); i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            topN.put(entry.getKey(), entry.getValue());
        }

        return topN;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        int countOfOccWords = 0;
        String textFile = Files.readString(Paths.get(path));

        String[] words = textFile.split("\\W+");
        LinkedList<String> wordsList = new LinkedList<>(Arrays.asList(words));

        for (String s : wordsList) {

            if (s.equalsIgnoreCase(word)) {
                countOfOccWords++;
            }
        }

        return countOfOccWords;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
