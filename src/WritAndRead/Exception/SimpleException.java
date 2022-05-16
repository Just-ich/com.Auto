package WritAndRead.Exception;

import java.io.IOException;

public class SimpleException extends IOException{

    public SimpleException(){
        super();
    }

    public SimpleException(String log, Exception e){
        super(log, e);
    }

    public SimpleException(String log){
        super(log);
    }

    public SimpleException(Exception e){
        super(e);
    }
}
