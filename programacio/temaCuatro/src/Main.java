//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
}

interface IsVehicle{
    String getName();
    void setName(String name);
    int getMaxPassengers();
    void setMaxPassengers(int maxPassengers);
    int getMaxSpped();
    void setMaxSpped(int maxSpped);
}

interface IsLandVehicle extends IsVehicle{
    int getNumWheels();
    void setNumWheels(int numWheels);
    void drive();

}

interface IsSeaVessel extends IsVehicle{
    int getDisplacement();
    void setDisplacement(int displacement);
    void launch();

}

class Jeep implements IsLandVehicle{
    int numWheels;
    int speed;
    int maxPassengers;
    String name;


    @Override
    public void drive() {
        System.out.println("Jeep drawing");
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.getMaxPassengers();
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpped() {
        return this.getMaxSpped();
    }

    @Override
    public void setMaxSpped(int maxSpped) {
        this.speed = speed;


    }
}

class Frigate implements IsSeaVessel {
    int displacement;
    int maxSpeed;
    int maxPassengers;
    String name;

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }
    @Override
    public void setMaxPassengers(int maxPassengers) {

    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    void  fireGun(){
        System.out.println("Firing...");
    }
}

class HoverCraft implements IsLandVehicle, IsSeaVessel {
    int displacement;
    int numWheels;
    String name;
    int maxPassengers;
    int maxSpeed;

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {

    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(int displacement) {

    }
    @Override
    public void launch() {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {

    }

    @Override
    public int getMaxSpped() {
        return 0;
    }

    @Override
    public void setMaxSpped(int maxSpped) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed){
}


    void enterLand(){
        System.out.println("Entering land");
    }

    void enterSea(){
        System.out.println("Entering sea");
    }

    interface IsEmergency{
        void soundSiren;
    }

    class PoliceCar implements IsEmergency, IsLandVehicle{

        @Override
        public void soundSiren(){
            System.out.println("UOOUOUUOUOUOUUOUOUUOOU");
        }

        @Override
        public int getNumWheels() {
            return 0;
        }

        @Override
        public void setNumWheels(int numWheels) {

        }

        @Override
        public void drive() {

        }

        @Override
        public String getName() {
            return "";
        }

        @Override
        public void setName(String name) {

        }

        @Override
        public int getMaxPassengers() {
            return 0;
        }

        @Override
        public void setMaxPassengers(int maxPassengers) {

        }

        @Override
        public int getMaxSpped() {
            return 0;
        }

        @Override
        public void setMaxSpped(int maxSpped) {

        }
    }
}