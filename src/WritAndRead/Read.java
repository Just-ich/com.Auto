package WritAndRead;

import WritAndRead.Exception.SimpleException;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read {

    public List<String> readAll(String input) throws SimpleException {

        Path inputPath = Paths.get(input);
        List<String> result = null;

        try {
            result= Files.readAllLines(inputPath);
        }catch (IOException e){
            throw new SimpleException(" Error Read", e);
        }
        return result;
    }
}
