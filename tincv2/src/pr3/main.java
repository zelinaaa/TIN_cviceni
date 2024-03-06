package pr3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresar ad1 = new Adresar("Adresar1");
		Adresar ad2 = new Adresar("Adresar2");
		Adresar ad3 = new Adresar("Adresar3");
		Adresar ad4 = new Adresar("Adresar4");
		Adresar ad5 = new Adresar("Adresar5");
		
		ad1.setLevy(ad4);
		ad1.setPravy(ad2);
		
		ad2.setLevy(ad5);
		ad2.setPravy(ad3);
		
		System.out.println(ad2.getLevy().getNazev());

	}

}
