package com.sda.javagdy5.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Path category = getCategory();

        List<Question> questions = readQuestions(category);
        Collections.shuffle(questions);

        for (int i = 0; i < 10; i++) {
            Question question = questions.get(i);

            List<String> answers = question.getAnswers();
            String rightAnswer = answers.get(0);

            Collections.shuffle(answers);


        }

    }

    private static List<Question> readQuestions(Path category) throws IOException {
        try (Scanner scanner = new Scanner(category)) {

            List<Question> allQuestions = new ArrayList<>();
            while (scanner.hasNext()) {
                String content = scanner.nextLine();
                int answersCount = Integer.parseInt(scanner.nextLine());
                List<String> answers = new ArrayList<>(answersCount);
                for (int i = 0; i < answersCount; i++) {
                    answers.add(scanner.nextLine());
                }
                allQuestions.add(new Question(content, answers));
            }

            return allQuestions;
        }
    }

    private static Path getCategory() throws IOException {
        Path dir = Paths.get("src", "main", "resources", "quiz");
        List<Path> categoryFiles = Files
            .list(dir)
            .collect(Collectors.toList());

        System.out.println("Wybierz kategorię:");
        int i = 1;
        for (Path categoryFile : categoryFiles) {
            System.out.println(i + ") " + categoryFile.getFileName()
                .toString()
                .replace(".txt", "")
                .replaceAll("_", " "));
            i = i + 1;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            return categoryFiles.get(scanner.nextInt() - 1);
        }
    }
}
