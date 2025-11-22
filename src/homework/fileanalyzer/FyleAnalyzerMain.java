package homework.fileanalyzer;

import java.io.IOException;
import java.util.Collections;

public class FyleAnalyzerMain {

    private static final String FILE_PATH = "C:\\Users\\samve\\IdeaProjects\\JavaCore\\src\\homework\\fileanalyzer\\file\\text.txt";

    static void main() throws IOException {

        FileAnalyzer fileAnalyzer = new FileAnalyzer();

        System.out.println("Words-counts: " + fileAnalyzer.wordMap(FILE_PATH));
        System.out.println("Total words count: " + fileAnalyzer.totalWordCount(FILE_PATH));
        System.out.println("Unique words count: " + fileAnalyzer.uniqueWordCount(FILE_PATH));
        System.out.println("Top frequent words: " + fileAnalyzer.topFrequentWords(FILE_PATH, 5));
        System.out.println("Count of word occurrences: " + fileAnalyzer.countWordOccurrences(FILE_PATH, "java") );

    }
}
