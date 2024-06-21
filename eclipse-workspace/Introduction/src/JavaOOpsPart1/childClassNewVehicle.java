package JavaOOpsPart1;

public class childClassNewVehicle extends parentclassVehicle{

	public static void main(String[] args) {
		
		childClassNewVehicle cd= new childClassNewVehicle();
		cd.colour();
		cd.brakes();
		
		

	}

	private void colour() {
		System.out.println(colour);
		
	}
	private void engine() {
		System.out.println("engine");
		
	}

}
