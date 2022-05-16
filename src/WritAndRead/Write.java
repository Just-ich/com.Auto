package WritAndRead;

import WritAndRead.Exception.SimpleException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Write {


    public void writeAll(String output, List<String> outputList) throws SimpleException{
        Path outputPath = Paths.get(output);
        try {
            Files.write(outputPath, outputList);
        } catch (IOException e){
            throw new SimpleException(e);
        }


    }
}
