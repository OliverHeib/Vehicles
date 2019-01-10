package models;

//import Start.ServletsHome;

/** 
 * Stores a record from table vehicle in a class
 * @author Oliver Heib
 */
public class Vehicle {
	private int vehicle_id;
	private String make;
	private String model;
	private int year;
	private int price;
	private String license_number;
	private String colour;
	private int number_doors;
	private String transmission;
	private int mileage;
	private String fuel_type;
	private int engine_size;
	private String body_style;
	private String condition;
	private String notes;
	
	/** 
	 * Initiates an object of Vehicle class
	 * @param vehicle_id ID for Vehicle
	 * @param make The vehicle make
	 * @param model The vehicle model
	 * @param year The year the vehicle was registered
	 * @param price The price of the vehicle
	 * @param license_number The vehicle Licence number
	 * @param colour The colour of the car
	 * @param number_doors Number of doors on the vehicle
	 * @param transmission The vehicle transmission types
	 * @param mileage The miles the vehicle has covered
	 * @param fuel_type The type of fuel the car runs on
	 * @param engine_size The Cubic Capacity of the engine
	 * @param body_style The style of the vehicle Body
	 * @param condition The Condition of the vehicle
	 * @param notes Notes on the vehicle
	 */
	public Vehicle(int vehicle_id, String make, String model, int year, int price, String license_number, String colour, int number_doors, String transmission, int mileage, String fuel_type, int engine_size, String body_style, String condition, String notes) 
	{
		this.setVehicle_id(vehicle_id);
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setPrice(price);
		this.setLicense_number(license_number);
		this.setColour(colour);
		this.setNumber_doors(number_doors);
		this.setTransmission(transmission);
		this.setMileage(mileage);
		this.setFuel_type(fuel_type);
		this.setEngine_size(engine_size);
		this.setBody_style(body_style);
		this.setCondition(condition);
		this.setNotes(notes);
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLicense_number() {
		return license_number;
	}

	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumber_doors() {
		return number_doors;
	}

	public void setNumber_doors(int number_doors) {
		this.number_doors = number_doors;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public int getEngine_size() {
		return engine_size;
	}

	public void setEngine_size(int engine_size) {
		this.engine_size = engine_size;
	}

	public String getBody_style() {
		return body_style;
	}

	public void setBody_style(String body_style) {
		this.body_style = body_style;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String toString()
	{
		return vehicle_id +", " + make +", " + model +", " + year +", " + price +", " + license_number +", " + colour +", " + number_doors +", " + transmission +", " + mileage +", " + fuel_type +", " + engine_size +", " + body_style +", " + condition +", " + notes; 
	}
}
