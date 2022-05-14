public class Auto {

    public void BuildBMW(){
        BMW bmw=new BMW();
        bmw.WiborDeistwija();
    }

    public void BuildMersedes(){
        Mersedes mersedes=new Mersedes();
        mersedes.WiborDeistwija();
    }

    public enum BuildAutoType{
        BMW,
        Mersedes
    }
}
