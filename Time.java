public class Time {
 
    private int hours;
    private int minutes;
    private int seconds;

 
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

  
    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        this.hours = hours;
    }

    // Getter method for minutes
    public int getMinutes() {
        return minutes;
    }


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

  
    public int getSeconds() {
        return seconds;
    }

  
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    public int calcTotalSeconds() {
        return (hours * 3600) + (minutes * 60) + seconds;
    }


    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }


    public static void main(String[] args) {
     
        Time time1 = new Time();
        System.out.println("Time1: " + time1.toString());
        System.out.println("Total seconds: " + time1.calcTotalSeconds());

     
        Time time2 = new Time(2, 30, 45);
        System.out.println("Time2: " + time2.toString());
        System.out.println("Total seconds: " + time2.calcTotalSeconds());

        time2.setHours(5);
        time2.setMinutes(15);
        time2.setSeconds(20);
        System.out.println("Time2 (modified): " + time2.toString());
        System.out.println("Total seconds: " + time2.calcTotalSeconds());
    }
}
