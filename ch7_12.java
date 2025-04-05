/*(Car Class) Create a class called Car that includes three instance variables—a model (type String), a year (type String), and a price (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the price is not positive, do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second. Display each Car’s price again.*/

class Car{
	
	// Variable instances
	String model;
	String year;
	double price;
	
	// Setters
	public void setModel(String model){
		this.model = model;
	}
	public void setYear(String year){
		this.year = year;
	}
	public void setPrice(double price){
		if(price > 0){
			this.price = price;
		}
	}
	
	
	// Getters
	public String getModel(){
		return model;
	}
	public String getYear(){
		return year;
	}
	public double getPrice(){
		return price;
	}
	
}



public class ch7_12 {

	public static void main(String[] args){
	
		Car Audi = new Car();
		Audi.setModel("Audi A4");
		Audi.setYear("2020");
		Audi.setPrice(50000000);
		
		Car landCruiser = new Car();
		landCruiser.setModel("Land cruiser v8");
		landCruiser.setYear("2017");
		landCruiser.setPrice(1200000000);
		
		System.out.println("Audi");
		System.out.printf("Model: %s\nYear: %s\nPrice :%f \n", Audi.getModel() , Audi.getYear() , Audi.getPrice());
		
		System.out.println("Land Cruiser");
		System.out.printf("Model: %s\nYear: %s\nPrice :%f \n", landCruiser.getModel() , landCruiser.getYear() , landCruiser.getPrice());
		
		Audi.setModel("Audi A4");
		Audi.setYear("2020");
		Audi.setPrice(Audi.getPrice() - (Audi.getPrice() * 5) / 100);
		
		landCruiser.setModel("Land cruiser v8");
		landCruiser.setYear("2017");
		landCruiser.setPrice(landCruiser.getPrice() - (landCruiser.getPrice() * 7) / 100);
		
		System.out.printf("Model: %s\nYear: %s\nPrice :%f \n", Audi.getModel() , Audi.getYear() , Audi.getPrice());
		
		System.out.printf("Model: %s\nYear: %s\nPrice :%f \n", landCruiser.getModel() , landCruiser.getYear() , landCruiser.getPrice());
		
	
	}
}







