import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int number=(int)(Math.random()*100);
		System.out.println(number);
		System.out.println("Merhana, say�y� tahmin etmek i�in 5 hakk�n�z bulunmaktad�r.");
		int n=1;
		int t=0;
		
		while(n<=5) {
			
		System.out.print(n+".Tahmininizi giriniz: ");
		t=scan.nextInt();
		
		if(t==number) {
			System.out.println("Do�ru tahmin! Tebrikler:)");
			break;}
		
		if(t<number)System.out.println("Girdi�iniz say� daha  b�y�k olmal�!");
		if(t>number)System.out.println("Girdi�iniz say� daha  k���k  olmal�!");
		System.out.println("Kalan hakk�n�z: "+(5-n));
		n++;}
			
		
		
		
		
		
			
			
	}

}
