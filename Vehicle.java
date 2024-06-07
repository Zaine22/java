public class Vehicle {

    private int seats;
    private int wheels;


    public Vehicle() {
        this.seats = 0;
        this.wheels = 0;
    }


    public Vehicle(int seats, int wheels) {
        this.seats = seats;
        this.wheels = wheels;
    }


    public int getSeats() {
        return seats;
    }


    public void setSeats(int seats) {
        this.seats = seats;
    }


    public int getWheels() {
        return wheels;
    }


    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public void showVehicle() {
        System.out.println("Vehicle: seats " + seats + ", wheels " + wheels);
    }


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.showVehicle(); 


        Vehicle vehicle2 = new Vehicle(4, 4);
        vehicle2.showVehicle();


        vehicle2.setSeats(2);
        vehicle2.setWheels(2);
        vehicle2.showVehicle();
    }
}
