import java.util.Scanner;

public class Time1{
    
    private int hour;
    private int minute;
    private int second;

    public Time1(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour){
        if(hour>=0 && hour<24)
            this.hour=hour;
    }

    public void setMinute(int minute){
        if(minute>=0 && minute<60)
            this.minute=minute;
    }

    public void setSecond(int second){
        if(second>=0 && second<60)
            this.second=second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour==0 || hour==12) ? 12 : hour % 12), minute, second,(hour<12 ? "AM" : "PM"));
    }

    public static void main(String[] args){
    
            Time1 time = new Time1(12, 56, 21);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter hour,minute and second: ");

            try {
                int hour = scanner.nextInt();

                if(hour>=24)
                    throw new Exception("Hour cannot be equal and greater than 24!");
                time.setHour(hour);
            } 
            catch (Exception exc) {
                System.out.println(exc.getMessage());
                System.out.println("Enter new hour: ");
                time.setHour(scanner.nextInt());
            }
            finally{
                System.out.println("DONE!");
            }
            
            int minute = scanner.nextInt();
            int second = scanner.nextInt();
            
            time.setMinute(minute);
            time.setSecond(second);

            System.out.println(time.toString());
            System.out.println(time.toUniversalString());
    }
}