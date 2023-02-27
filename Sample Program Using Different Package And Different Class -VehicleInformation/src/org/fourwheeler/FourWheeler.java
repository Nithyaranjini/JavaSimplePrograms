package org.fourwheeler;
import org.allvehicle.Vehicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;

public class FourWheeler {
	private void car() {
		System.out.println("Car was invented in 1886");}
	private void bus() {
		System.out.println("Bus was invented in 1895");}
	private void lorry() {
	    System.out.println("Lorry was invented in 1896");}
	public static void main(String[] args) {
	 FourWheeler c = new FourWheeler();
     c.car();
     c.bus();
	 c.lorry();
	Vehicle d= new Vehicle();
	d.vehicleNecessary();
	TwoWheeler g = new TwoWheeler();
	g.bike();
	g.cycle();
	ThreeWheeler h = new ThreeWheeler();
	h.auto();
	
	}}
	
	
	

	

	

	


