package pl.sdacademy.decorator;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileOperationAsDecorator {

    public static void main(String[] args) throws IOException {
        var text = "prosty przyklad, ktory zapiszemy do pliku";
        var fileName = "decorator-test.txt";
        var fileName2 = "decorator-test2.txt";

        Files.deleteIfExists(Path.of(fileName));

        try(var writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            log.error("problem", e);
        }

        Files.deleteIfExists(Path.of(fileName2));
        try(var writer = new PrintWriter(new FileWriter(fileName2))) {
            writer.println(text);
        } catch (IOException e) {
            log.error("problem", e);
        }

    }
}
