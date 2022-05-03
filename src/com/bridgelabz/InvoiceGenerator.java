package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;

public class InvoiceGenerator {
    //List<Rides> rides = new ArrayList<>();
    int costPerKm = 10;
    int costPerMin = 1;
    int minFare = 5;

    //Calculating total fare
    public double fareCalculation(double distance, int time) {
        double totalFare = distance * costPerKm + time * costPerMin;
        if (totalFare < minFare) {
            return minFare;
        } else {
            return totalFare;
        }
    }

    //Multiple Ride
    public double multipleFare1(Rides[] rides) {
        double totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare = totalFare + fareCalculation(ride.distance, ride.time);
        }
        System.out.print("Total Fare is: ");
        return totalFare;
    }

	public double multipleFare(Rides[] rides) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double fareCalculation1(double distance, int time) {
		// TODO Auto-generated method stub
		return 0;
	}
}