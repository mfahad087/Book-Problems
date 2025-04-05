/*(Clock Class) Create a class called Clock that includes three instance variables—an hour (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. The set method should set the value of all three variables to 0 if the value of hour is more than 23, the value of minute is more than 59, and the value of second is more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write a test app named ClockTest that demonstrates class Clock’s capabilities.*/

class Clock {
	int hour;
	int min;
	int sec;

	// Constructor
	Clock(int hour, int min , int sec){
	this.hour = hour;
	this.min = min;
	this.sec = sec;
	}

	// Setter
	public void setHour(int hour){
		if( 0 <= hour && hour <= 23){
			this.hour = hour;
		} else{
			this.hour = 0;
		}
	}
	
	public void setMin(int min){
		if( 0 <= min && min <= 59){
			this.min = min;
		} else{
			this.min = 0;
		}
	}
	
	public void setSec(int sec){
		if( 0 <= sec && sec <= 59){
			this.sec = sec;
		} else{
			this.sec = 0;
		}
	}
	
	// Getter
	public int getHour(){
		return this.hour;
	}
	
	public int getMin(){
		return this.min;
	}
	
	public int getSec(){
		return this.sec;
	}
	
	// Clock Test method
	public void clockTest(){
		System.out.printf("%d:%d:%d",hour, min, sec);
	}
}


public class ch7_13 {
	public static void main(String [] args){
		Clock c1 = new Clock(2,14,90);
		c1.clockTest();
	}
}





