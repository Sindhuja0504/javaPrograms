package pck.parameters;

public class Refvalue {
	//passing reference data type argument
	
	public School Schoolcreate(int rollno, String name) {
		School sch = new School();
		sch.name = name;
		sch.rollno= rollno;
		return sch;
	}
	
	public Hotel Hotellist(String place, int count){
		Hotel ht = new Hotel();
		ht.place=place;
		ht.count=count;
		return ht;
		
	}

	public static void main(String[] args) {
		Refvalue rv = new Refvalue();
		School sch =rv.Schoolcreate(23, "riya");
		System.out.println(sch.name + sch.rollno);
		//System.out.println("name: " + value1.name + " " + "rollno: " + value1.rollno);
		Hotel ht=	rv.Hotellist("T.nagar", 12);
		System.out.println(ht.count + ht.place);
		

	}

}
