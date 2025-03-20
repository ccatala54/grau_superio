public class Bycicle {
    final int MAXGEAR = 7;
    double wheelSize = 27; //polzades

    double ratios[] = new double[MAXGEAR];


    int gear = 1;
    int speed; //Velocidad de la bicicleta
    int cadence; //Velocidad dels pedals

    void breack(){
        if (this.speed < 10){
            this.speed = 0;
        }else{
        this.speed = this.speed - 10;
        }

    }

    void changeGearUp(){
        if (this.gear < MAXGEAR){
        this.gear++;
        }
    }

    void changeGearDown(){
        if (this.gear > 1) {
            this.gear--;
        }
    }

    void changeCadence(int rpm){
        this.cadence =rpm;
double rpm2 = this.ratios[this.gear-1]*rpm;
    }
}
