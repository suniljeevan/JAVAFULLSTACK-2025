//Loose Coupling using Comparator Interface for sorting
// Using Lambda Expression

package MYPACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class PicnicSpot {
	private String name;
	private double distance;
	private boolean hotelAndRestaurantAvailabilty;
	private double ratings;
	// alt shift s to generate getter , setter and constructors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isHotelAndRestaurantAvailabilty() {
		return hotelAndRestaurantAvailabilty;
	}
	public void setHotelAndRestaurantAvailabilty(boolean hotelAndRestaurantAvailabilty) {
		this.hotelAndRestaurantAvailabilty = hotelAndRestaurantAvailabilty;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public PicnicSpot() {
		// default value
	}
	public PicnicSpot(String name, double distance, boolean hotelAndRestaurantAvailabilty, double ratings) {
		this.name = name;
		this.distance = distance;
		this.hotelAndRestaurantAvailabilty = hotelAndRestaurantAvailabilty;
		this.ratings = ratings;
	}
	@Override
	public int hashCode() {
		return Objects.hash(distance, hotelAndRestaurantAvailabilty, name, ratings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PicnicSpot other = (PicnicSpot) obj;
		return Double.doubleToLongBits(distance) == Double.doubleToLongBits(other.distance)
				&& hotelAndRestaurantAvailabilty == other.hotelAndRestaurantAvailabilty
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(ratings) == Double.doubleToLongBits(other.ratings);
	}
	@Override
	public String toString() {
		return "PicnicSpot [name=" + name + ", distance=" + distance + ", hotelAndRestaurantAvailabilty="
				+ hotelAndRestaurantAvailabilty + ", ratings=" + ratings + "]";
	}
	
	
}
public class TEST5 {
	public static void main(String[] args) {
		PicnicSpot ob1=new PicnicSpot();
		ob1.setName("Beach");
		ob1.setDistance(40);
		ob1.setHotelAndRestaurantAvailabilty(true);
		ob1.setRatings(3.5);
		PicnicSpot ob2=new PicnicSpot();
		ob2.setName("Mountain");
		ob2.setDistance(49);
		ob2.setHotelAndRestaurantAvailabilty(false);
		ob2.setRatings(4.5);
		PicnicSpot ob3=new PicnicSpot();
		ob3.setName("Park");
		ob3.setDistance(26.7);
		ob3.setHotelAndRestaurantAvailabilty(true);
		ob3.setRatings(4);
		PicnicSpot ob4=new PicnicSpot();
		ob4.setName("Lake");
		ob4.setDistance(15.8);
		ob4.setHotelAndRestaurantAvailabilty(false);
		ob4.setRatings(4.8);
		PicnicSpot ob5=new PicnicSpot();
		ob5.setName("Forest");
		ob5.setDistance(30.3);
		ob5.setHotelAndRestaurantAvailabilty(false);
		ob5.setRatings(4.1);
		List<PicnicSpot> spots=new ArrayList<PicnicSpot>();
		spots.add(ob1);spots.add(ob2);spots.add(ob3);
		spots.add(ob4);spots.add(ob5);
		System.out.println("Before sorting");
		for(PicnicSpot p:spots)
		System.out.println(p);
		
		//Comparator compare(2 objects of picnicSPot)
		Collections.sort(spots,(x,y)-> {
			return x.getName().compareTo(y.getName());
		}
		);
		
		System.out.println("Sorted by name");
		for(PicnicSpot p:spots)
			System.out.println(p);
		//Comparator compare(2 objects of picnicSPot)
				Collections.sort(spots,(x,y)-> {
					return (int)(x.getDistance()-y.getDistance());
				}
				);	
				System.out.println("Sorted by distance");
				for(PicnicSpot p:spots)
					System.out.println(p);
				Collections.sort(spots,(x,y)-> {
					return (int)(y.getDistance()-x.getDistance());
				}
				);	
				System.out.println("Reverse Sorted by distance");
				for(PicnicSpot p:spots)
					System.out.println(p);
				
				Collections.sort(spots,(x,y)-> {
					if(x.getRatings()<y.getRatings())return -1;
					else return 1;					
				}
				);	
				System.out.println("Sorted by Ratings");
				for(PicnicSpot p:spots)
					System.out.println(p);
				Collections.sort(spots,(x,y)-> {
					if(y.getRatings()<x.getRatings())return -1;
					else return 1;	
				}
				);	
				System.out.println("Reverse Sorted by Ratings");
				for(PicnicSpot p:spots)
					System.out.println(p);
		
			
	}
}





