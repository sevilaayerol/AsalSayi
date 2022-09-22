
public class asal {

	public static void main(String[] args) {
		
		System.out.print("1-100 arasindaki asal sayilar: \n");
		
		int counter;
		for(int i = 1; i < 100; i++) {
			counter = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0)counter++;
			}
			if(counter == 1) System.out.print(i+" ");
		}
	}

}
