public class Radio {
private boolean powerOn;
private int volume;
private double frequency;

    public Radio() {
    }

    public Radio(boolean powerOn, int volume, double frequency) {
        this.powerOn = powerOn;
        this.volume = volume;
        this.frequency = frequency;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 10){
            System.out.println("Fehler: Falscher Lautstärkebereich");
        } else {
            this.volume = volume;
        }
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        if (frequency < 85 || frequency > 110) {
            System.out.println("Fehler: Falscher Frequenzbereich");
        } else {
            this.frequency = frequency;
        }
    }

    public void lauter(){
        if (powerOn) {
            setVolume(getVolume()+1);
        }
    }

    public void leiser(){
        if (powerOn) {
            setVolume(getVolume()-1);
        }
    }

    public void an(){
        setPowerOn(true);
    }

    public void aus(){
        setPowerOn(false);
    }

    public String toString(){
        String powerstate;
        if (isPowerOn()){
            powerstate = "an";
        }
        else {
            powerstate = "aus";
        }
        return "Radio " + powerstate + ": Freq=" + getFrequency() + ", Laut=" + getVolume();
    }

    public void waehleSender(double frequenz){
        if (frequenz < 85 || frequenz > 110) {
            setFrequency(99.9);
        } else {
            setFrequency(frequenz);
        }
    }
}
