public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if(!this.flying){
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky");
        }
    }

    @Override
    public int ascend(int value) {
        this.altitude += value;
        if(this.flying && this.altitude >= 0){
            System.out.println(this.getName() + " flies upward, altitude: " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public int descend(int value) {
        this.altitude -= value;
        if(this.flying && this.altitude > 0){
            System.out.println(this.getName() + " flies downward, altitude: " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if(this.flying && this.altitude > 0){
            System.out.println(this.getName() + " glides into the air.");
        }
    }

    @Override
    public void land() {
        if(this.flying && this.altitude > 1){
            System.out.println(this.getName() + " is too high, it can't land.");
        } else {
            this.altitude = 0;
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground");
        }
    }

}
