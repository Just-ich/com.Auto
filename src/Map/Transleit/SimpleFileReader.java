package Map.Transleit;


import WritAndReadAndException.Exception.SimpleException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SimpleFileReader {

    public List<String> readAll(String input) throws SimpleException {

        Path inputPath = Paths.get(input);
        List<String> result;
        try {
            result = Files.readAllLines(inputPath);
        } catch (IOException e) {
            throw new SimpleException("Error while reading in Simple Reader",e);
        }
        return result;
    }

}
