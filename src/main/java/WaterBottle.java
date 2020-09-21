public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -=10;
    }

    public void explode() {
        this.volume = 0;
    }

    public void rematerialise(){
        while (this.volume <100) {
            this.volume +=1;
        }
    }
}
