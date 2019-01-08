import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) 
	{
		Scanner reader1 = new Scanner(System.in);
		Scanner returna = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("-------------------------");
		System.out.println("Vehicle Inventory System");
		System.out.println("Choose from these options");
		System.out.println("-------------------------");
		System.out.println("1 - Retreve all vehicles");
		System.out.println("2 - Search for Vehicle");
		System.out.println("3 - Insert new vehicle into database");
		System.out.println("4 - Update existing vehicle details");
		System.out.println("5 - Delete vehicle from database");
		System.out.println("6 - Exit");
		System.out.print("Enter choice >");
		choice = reader1.nextInt();
			
		switch (choice)
		{
			case 1: choice = 1;
				VehiclesPrintAll();
				break;
			case 2: choice = 2;
				getVehicle();
				break;
			case 3: choice = 3;
				InsertVehicle();
				break; 
			case 4: choice = 4;
				UpdateVehicle();
				break;
			case 5: choice = 5;
				DeleteVehicle();
				break;
			case 6: choice = 6;
				break;
			default:
				System.out.println("Invalid Value");
		}
		
		reader1.close();
		returna.close();
	}
	
	private static void VehiclesPrintAll()
	{
		VehicleDAO a = new VehicleDAO();
		ArrayList<Vehicle> b = new ArrayList<Vehicle>() ;
		b = new ArrayList<Vehicle>(a.getAllVehicle());
		System.out.println("Retrieving all vehicles ....");
		System.out.println("DBQuery = SELECT * FROM vehicles;");
		for (Vehicle i : b) 
		{
			System.out.println("Vehicle ID = " + i.getVehicle_id());
			System.out.println("Vehicle Make = " + i.getMake());
			System.out.println("Vehicle Model = " + i.getModel());
			System.out.println("Registration Year = " + i.getYear());
			System.out.println("Price = " + i.getPrice());
			System.out.println("License Number = " + i.getLicense_number());
			System.out.println("Colour = " + i.getColour());
			System.out.println("Number of Doors = " + i.getNumber_doors());
			System.out.println("Transmition = " + i.getTransmission());
			System.out.println("Mileage = " + i.getMileage());
			System.out.println("Fuel Type = " + i.getFuel_type());
			System.out.println("Engine Size = " + i.getEngine_size());
			System.out.println("Body Style = " + i.getBody_style());
			System.out.println("Condition = " + i.getCondition());
			System.out.println("Notes = " + i.getNotes());
			System.out.println("-------------------------");
		}
	}
	
	private static void getVehicle()
	{
		int getChoice;
		Scanner readerawd = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Vehicle ID >");
		
		getChoice = readerawd.nextInt();
		VehicleDAO a = new VehicleDAO();
		System.out.println(a.getVehicle(getChoice));
		readerawd.close();
		
	}
	
	private static void VehiclesPrintSearch()
	{
		Scanner reader = new Scanner(System.in);
		int choice = 0;
		Scanner reader2 = new Scanner(System.in);
		int input;
		String input2;
		VehicleDAO a = new VehicleDAO();
		ArrayList<Vehicle> b = new ArrayList<Vehicle>();
		
		System.out.println("1 - ID");
		System.out.println("2 - make");
		System.out.println("3 - model");
		System.out.println("4 - year");
		System.out.println("5 - price");
		System.out.println("6 - license number");
		System.out.println("7 - colour");
		System.out.println("8 - number_doors");
		System.out.println("9 - transmission");
		System.out.println("10 - mileage");
		System.out.println("11 - fuel type");
		System.out.println("12 - engine size");
		System.out.println("13 - body style");
		System.out.println("14 - condition");
		System.out.println("15 - notes");
		System.out.print("Choose a field to search by >");
		
		choice = reader.nextInt();
		reader.close();
		
		int count = 0;
		
		switch (choice)
		{
			case 1:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("vehicle_id", input));
				reader2.close();
				break;
			}
			case 2:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("make", input2));
				reader2.close();
				break;
			}
			case 3:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("model", input2));
				reader2.close();
				break;
			}
			case 4:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("year", input));
				reader2.close();
				break;
			}
			case 5:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("price", input));
				reader2.close();
				break;
			}
			case 6:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("license_number", input2));
				reader2.close();
				break;
			}
			case 7:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("colour", input2));
				reader2.close();
				break;
			}
			case 8:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("number_doors", input));
				reader2.close();
				break;
			}
			case 9:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("transmission", input2));
				reader2.close();
				break;
			}
			case 10:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("mileage", input));
				reader2.close();
				break;
			}
			case 11:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("fuel_type", input2));
				reader2.close();
				break;
			}
			case 12:
			{
				System.out.println();
				System.out.print("Input search term >");
				input = reader2.nextInt();
				b = new ArrayList<Vehicle>(a.SearchVehicleInt("engine_size", input));
				reader2.close();
				break;
			}
			case 13:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("body_style", input2));
				reader2.close();
				break;
			}
			case 14:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("condition", input2));
				reader2.close();
				break;
			}
			case 15:
			{
				System.out.println();
				System.out.print("Input search term >");
				input2 = reader2.nextLine();
				b = new ArrayList<Vehicle>(a.SearchVehicleString("notes", input2));
				reader2.close();
				break;
			}
			default:
			{
				System.out.println("Invalid Value");
				reader2.close();
				count--;
			}
		}
		
		
		
		System.out.println();
		for (Vehicle i : b) 
		{
			System.out.println("Vehicle ID = " + i.getVehicle_id());
			System.out.println("Vehicle Make = " + i.getMake());
			System.out.println("Vehicle Model = " + i.getModel());
			System.out.println("Registration Year = " + i.getYear());
			System.out.println("Price = " + i.getPrice());
			System.out.println("License Number = " + i.getLicense_number());
			System.out.println("Colour = " + i.getColour());
			System.out.println("Number of Doors = " + i.getNumber_doors());
			System.out.println("Transmition = " + i.getTransmission());
			System.out.println("Mileage = " + i.getMileage());
			System.out.println("Fuel Type = " + i.getFuel_type());
			System.out.println("Engine Size = " + i.getEngine_size());
			System.out.println("Body Style = " + i.getBody_style());
			System.out.println("Condition = " + i.getCondition());
			System.out.println("Notes = " + i.getNotes());
			System.out.println("-------------------------");
			count++;
		}
		if(count == 0)
			System.out.println("No records match your search criteria");
	}
	
	private static void InsertVehicle()
	{
		Scanner reader = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		String make;
		String model;
		int year;
		int price;
		String license_number;
		String colour;
		int number_doors;
		String transmission;
		int mileage;
		String fuel_type;
		int engine_size;
		String body_style;
		String condition;
		String notes;
		
		System.out.println();
		System.out.println("Input make >");
		make = reader2.nextLine();
		
		System.out.println();
		System.out.println("Input Model >");
		model = reader.nextLine();
		
		System.out.println();
		System.out.println("Input year >");
		year = reader2.nextInt();
		
		System.out.println();
		System.out.println("Input Price >");
		price = reader.nextInt();
		
		System.out.println();
		System.out.println("Input license number >");
		license_number = reader2.next();
		
		System.out.println();
		System.out.println("Input colour >");
		colour = reader.next();
		
		System.out.println();
		System.out.println("Input number of doors >");
		number_doors = reader2.nextInt();
		
		System.out.println();
		System.out.println("Input transmission >");
		transmission = reader.next();
		
		System.out.println();
		System.out.println("Input mileage >");
		mileage = reader2.nextInt();
		
		System.out.println();
		System.out.println("Input fuel type >");
		fuel_type = reader.next();
		
		System.out.println();
		System.out.println("Input engine size >");
		engine_size = reader2.nextInt();
		
		System.out.println();
		System.out.println("Input body style >");
		body_style = reader.next();
		
		System.out.println();
		System.out.println("Input condition >");
		condition = reader2.next();
		
		System.out.println();
		System.out.println("Input notes >");
		notes = reader.next();
		
		VehicleDAO a = new VehicleDAO();
		Vehicle b = new Vehicle(1,make,model,year,price,license_number,colour,number_doors,transmission,mileage,fuel_type,engine_size,body_style,condition,notes) ;
		a.InsertVehicle(b);
		reader.close();
		reader2.close();
	}
	
	private static void UpdateVehicle()
	{
		System.out.println();
		System.out.println("Vehicle ID >");
		
		Scanner reader = new Scanner(System.in);
		
		int upChoice = reader.nextInt();
		
		VehicleDAO a = new VehicleDAO();
		Vehicle upVehicle = null;
		
		ArrayList<Vehicle> b = a.SearchVehicleInt("vehicle_id", upChoice);
		System.out.println();
		reader.close();
		
		int count = 0;
		for (Vehicle i : b) 
		{
			upVehicle = i;
			count++;
		}
		
		if(count == 0)
			System.out.println("No records match your search criteria");
		else
		{
			String make;
			String model;
			int year;
			int price;
			String license_number;
			String colour;
			int number_doors;
			String transmission;
			int mileage;
			String fuel_type;
			int engine_size;
			String body_style;
			String condition;
			String notes;
			
			Scanner reader2 = new Scanner(System.in);
			
			System.out.println("Vehicle Make = " + upVehicle.getMake());
			System.out.println("enter new >");
			make = reader2.next();
			System.out.println("Vehicle Model = " + upVehicle.getModel());
			System.out.println("enter new >");
			model = reader2.next();
			System.out.println("Registration Year = " + upVehicle.getYear());
			System.out.println("enter new >");
			year = reader2.nextInt();
			System.out.println("Price = " + upVehicle.getPrice());
			System.out.println("enter new >");
			price = reader2.nextInt();
			System.out.println("License Number = " + upVehicle.getLicense_number());
			System.out.println("enter new >");
			license_number = reader2.next();
			System.out.println("Colour = " + upVehicle.getColour());
			System.out.println("enter new >");
			colour = reader2.next();
			System.out.println("Number of Doors = " + upVehicle.getNumber_doors());
			System.out.println("enter new >");
			number_doors = reader2.nextInt();
			System.out.println("Transmition = " + upVehicle.getTransmission());
			System.out.println("enter new >");
			transmission = reader2.next();
			System.out.println("Mileage = " + upVehicle.getMileage());
			System.out.println("enter new >");
			mileage = reader2.nextInt();
			System.out.println("Fuel Type = " + upVehicle.getFuel_type());
			System.out.println("enter new >");
			fuel_type = reader2.next();
			System.out.println("Engine Size = " + upVehicle.getEngine_size());
			System.out.println("enter new >");
			engine_size = reader2.nextInt();
			System.out.println("Body Style = " + upVehicle.getBody_style());
			System.out.println("enter new >");
			body_style = reader2.next();
			System.out.println("Condition = " + upVehicle.getCondition());
			System.out.println("enter new >");
			condition = reader2.next();
			System.out.println("Notes = " + upVehicle.getNotes());
			System.out.println("enter new >");
			notes = reader2.next();
			Vehicle v = new Vehicle(upVehicle.getVehicle_id(),make,model,year,price,license_number,colour,number_doors,transmission,mileage,fuel_type,engine_size,body_style,condition,notes);
			a.UpdateVehicle(v);
			reader2.close();
		}
	}
	
	private static void DeleteVehicle()
	{
		System.out.println();
		System.out.println("Vehicle ID >");
		
		Scanner reader = new Scanner(System.in);
		int delChoice = reader.nextInt();
	
		VehicleDAO a = new VehicleDAO();
		
		a.DeleteVehicle(delChoice);
		
		reader.close();
	}

}