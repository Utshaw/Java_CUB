public class Lift {

//    -2 to 25
    byte floorPosition;

    // -2 to 90
    //
    public void moveLift(byte floorPosition, boolean caughtFire) {
        if(caughtFire) {
            try {
                throw new LiftOnFire("Lift is on fire");
            } catch (LiftOnFire liftOnFire) {
                System.out.println("Initializing Fire Extinguisher");
                liftOnFire.printStackTrace();
                System.out.println("Fire is gone now");
            }
        }
        if(floorPosition >= -2 && floorPosition <= 110) {
            this.floorPosition  = floorPosition;
        }
    }
}
