package JavaOOpsPart1;

public class AustralianTraffic implements CentralRepositoryTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralRepositoryTraffic a = new AustralianTraffic();
		a.RedStop();
		a.GoGreen();
		a.FlashYellow();
		
		ContinentalTraffic b = new AustralianTraffic();
		b.TrainSymbol();
		
		
		AustralianTraffic c = new AustralianTraffic();
		c.walking();
		
	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("Green Flashing");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Flashing");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Flashing");
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Train Flashing");
		
	}

	public void walking()
	{
		System.out.println("Walking Only");
	}
}
