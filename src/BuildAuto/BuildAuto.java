package BuildAuto;

public class BuildAuto {

    public Auto createAuto(Auto.BuildAutoType type) {
        Auto auto = null;

        switch (type) {
            case BMW:
                auto = new BMW();
                auto.BuildBMW();
                break;
            case Mersedes:
                auto = new Mersedes();
                auto.BuildMersedes();
                break;
        }
        return auto;
    }




}
