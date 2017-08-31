package homework_2;

public class Main {

	public static void main(String[] args) {

		Pay []emploees = new Pay[4];
		emploees[0]= new ContractEmployee("yes","Oleg", 459845260, 15, 200);
		emploees[1]= new SalariedEmploee("yes","Nazar", 800.0, "Soft");
		emploees[2]= new ContractEmployee("yes","Yura", 576586148, 22, 190);
		emploees[3]= new SalariedEmploee("yes","Rostuk", 1500.0, "Soft");
		
		
		Pay e = null;
		
		for(int i=0;i<emploees.length-1;i++){
			for(int j=0;j<emploees.length-1;j++){
				if(emploees[j].calculatePay()>emploees[j+1].calculatePay()){
					e =(Pay) emploees[j];
					emploees[j]=emploees[j+1];
					emploees[j+1]=(Pay) e;
				}
			}
		}
		
		for (Pay pay : emploees) {
			System.out.println( pay.getName()+"   "+pay.calculatePay());
		}
	}

}
