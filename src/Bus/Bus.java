package Bus;

public class Bus {

    private int numberBus;
    private char emblema;
    private String marschrut;
    private double kolwoMest;

    public static class Builder{
        private Bus newBus;

        public Builder(){
            newBus=new Bus();
        }

        public Builder withNumberBus(int numberBus){
            newBus.numberBus=numberBus;
            return this;
        }

        public Builder withEmblema(char emblema){
            newBus.emblema=emblema;
            return this;
        }

        public Builder withMarschrut(String marschrut){
            newBus.marschrut=marschrut;
            return this;
        }

        public Builder withKolwoMest(double kolwoMest){
            newBus.kolwoMest=kolwoMest;
            return this;
        }

        public Bus build(){
            return newBus;
        }

    }


    @Override
    public String toString() {
        return "Bus: \n" +
                " numberBus=" + numberBus +
                ",\n emblema=" + emblema +
                ",\n marschrut='" + marschrut + '\'' +
                ",\n kolwoMest=" + kolwoMest;
    }

}
