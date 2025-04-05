class Time2 {
    private int secondsSinceMidnight; // Stores total seconds since 00:00:00

    // Default constructor (midnight)
    public Time2() {
        this(0, 0, 0);  // Calls the next constructor
    }

    // Constructor with hour, minute, second
    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Set method (converts h, m, s into total seconds)
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time values!");
        }
        secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    // Get methods (convert seconds back into hours, minutes, seconds)
    public int getHour() {
        return secondsSinceMidnight / 3600;
    }

    public int getMinute() {
        return (secondsSinceMidnight % 3600) / 60;
    }

    public int getSecond() {
        return secondsSinceMidnight % 60;
    }

    // Convert time to universal format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // Convert time to standard format (HH:MM:SS AM/PM)
    public String toStandardString() {
        int hour = getHour();
        return String.format("%02d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12, 
                getMinute(), getSecond(), 
                (hour < 12) ? "AM" : "PM");
    }
}

// Test Program
public class chap8_05
 {
    public static void main(String[] args) {
        Time2 t1 = new Time2(13, 45, 30); // 1:45:30 PM

        System.out.println("Universal Time: " + t1.toUniversalString());
        System.out.println("Standard Time: " + t1.toStandardString());

        t1.setTime(23, 59, 59); // 11:59:59 PM
        System.out.println("\nAfter Changing Time:");
        System.out.println("Universal Time: " + t1.toUniversalString());
        System.out.println("Standard Time: " + t1.toStandardString());
    }
}
