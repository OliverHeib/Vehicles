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
	
	/** 
	 * Returns the value in vehicle_id
	 * @return int The Vehicle ID
	 */
	public int getVehicle_id() {
		return vehicle_id;
	}

	/** 
	 * Sets the value of vehicle_id
	 * @param vehicle_id The Value to assign to vehicle id
	 */
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	/** 
	 * Returns the value in make
	 * @return String The Vehicle make
	 */
	public String getMake() {
		return make;
	}

	/** 
	 * Sets the value of make
	 * @param make The Value to assign to vehicle make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/** 
	 * Returns the value in model
	 * @return String The Vehicle model
	 */
	public String getModel() {
		return model;
	}

	/** 
	 * Sets the value of model
	 * @param model The Value to assign to vehicle model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/** 
	 * Returns the value in year
	 * @return int The Vehicle year
	 */
	public int getYear() {
		return year;
	}

	/** 
	 * Sets the value of year
	 * @param year The Value to assign to vehicle year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/** 
	 * Returns the value in price
	 * @return int The Vehicle price
	 */
	public int getPrice() {
		return price;
	}

	/** 
	 * Sets the value of price
	 * @param price The Value to assign to vehicle price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/** 
	 * Returns the value in License_number
	 * @return String The Vehicle License number
	 */
	public String getLicense_number() {
		return license_number;
	}

	/** 
	 * Sets the value of license_number
	 * @param license_number The Value to assign to vehicle license number
	 */
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}

	/** 
	 * Returns the value in colour
	 * @return String The Vehicle colour
	 */
	public String getColour() {
		return colour;
	}

	/** 
	 * Sets the value of colour
	 * @param colour The Value to assign to vehicle colour
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/** 
	 * Returns the value in number_doors
	 * @return int The number of doors the Vehicle has
	 */
	public int getNumber_doors() {
		return number_doors;
	}

	/** 
	 * Sets the value of number_doors
	 * @param number_doors The Value to assign to number of doors the Vehicle has
	 */
	public void setNumber_doors(int number_doors) {
		this.number_doors = number_doors;
	}

	/** 
	 * Returns the value in transmission
	 * @return String The number Vehicle transmission
	 */
	public String getTransmission() {
		return transmission;
	}

	/** 
	 * Sets the value of transmission
	 * @param transmission The Value to assign to Vehicle transmission
	 */
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	/** 
	 * Returns the value in mileage
	 * @return int The number Vehicle mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/** 
	 * Sets the value of mileage
	 * @param mileage The Value to assign to Vehicle mileage
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/** 
	 * Returns the value in fuel_type
	 * @return String The number Vehicle fuel type
	 */
	public String getFuel_type() {
		return fuel_type;
	}

	/** 
	 * Sets the value of fuel_type
	 * @param fuel_type The Value to assign to Vehicle fuel type
	 */
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	/** 
	 * Returns the value in engine_size
	 * @return int The number Vehicle engine size
	 */
	public int getEngine_size() {
		return engine_size;
	}

	/** 
	 * Sets the value of engine_size
	 * @param engine_size The Value to assign to Vehicle engine size
	 */
	public void setEngine_size(int engine_size) {
		this.engine_size = engine_size;
	}

	/** 
	 * Returns the value in body_style
	 * @return String The number Vehicle body style
	 */
	public String getBody_style() {
		return body_style;
	}

	/** 
	 * Sets the value of body_style
	 * @param body_style The Value to assign to Vehicle body style
	 */
	public void setBody_style(String body_style) {
		this.body_style = body_style;
	}

	/** 
	 * Returns the value in condition
	 * @return String The number Vehicle condition
	 */
	public String getCondition() {
		return condition;
	}

	/** 
	 * Sets the value of condition
	 * @param condition The Value to assign to Vehicle condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/** 
	 * Returns the value in notes
	 * @return String The number Vehicle notes
	 */
	public String getNotes() {
		return notes;
	}

	/** 
	 * Sets the value of notes
	 * @param notes The Value to assign to Vehicle notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/** 
	 * Returns a string of the values in all variables in the Vehicle object
	 * @return String Values in all variables in the Vehicle object
	 */
	public String toString()
	{
		return vehicle_id +", " + make +", " + model +", " + year +", " + price +", " + license_number +", " + colour +", " + number_doors +", " + transmission +", " + mileage +", " + fuel_type +", " + engine_size +", " + body_style +", " + condition +", " + notes; 
	}
}
