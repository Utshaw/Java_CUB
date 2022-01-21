public class Lift {

//    -2 to 25
    byte floorPosition;

    // -2 to 90
    //
    public void moveLift(byte floorPosition) {
        if(floorPosition >= -2 && floorPosition <= 110) {
            this.floorPosition  = floorPosition;
        }
    }
}
