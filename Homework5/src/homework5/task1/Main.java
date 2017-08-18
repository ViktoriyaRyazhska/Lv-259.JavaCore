package homework5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Bird[] birds=new Bird[4];
		birds[0]=new Eagle();
		birds[1]=new Penguin();
		birds[2]=new Swallow();
		birds[3]=new Chicken();
		
		for(int i=0;i<birds.length;i++) {
			birds[i].inputInfo(reader);
		}
		System.out.println("\n===All birds===");
		for(int i=0;i<birds.length;i++) {
			System.out.println(birds[i]);
		}
		
		
	}

}
