class Bank {
	int getInterest() {
		return 0;
	}
}

class Sbi extends Banks {
	int getInterest() {
		return 7;
	}
}

class Axis extends Banks {
	int getInterest() {
		return 9;
	}
}


class Icici extends Banks {
	int getInterest() {
		return 10;
	}
}
public class Banks {
	public static void main(String [] args) {
		Sbi s = new Sbi();
		Axis a = new Axis();
		Icici i = new Icici();
		
		System.out.println("SBI Interest : " +s.getInterest());
		System.out.println("AXIS Interest : " +a.getInterest());
		System.out.println("ICICI Interest : " +i.getInterest());
	}

}
