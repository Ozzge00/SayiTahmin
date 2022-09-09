import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int number=(int)(Math.random()*100);
		System.out.println(number);
		System.out.println("Merhana, sayýyý tahmin etmek için 5 hakkýnýz bulunmaktadýr.");
		int n=1;
		int t=0;
		
		while(n<=5) {
			
		System.out.print(n+".Tahmininizi giriniz: ");
		t=scan.nextInt();
		
		if(t==number) {
			System.out.println("Doðru tahmin! Tebrikler:)");
			break;}
		
		if(t<number)System.out.println("Girdiðiniz sayý daha  büyük olmalý!");
		if(t>number)System.out.println("Girdiðiniz sayý daha  küçük  olmalý!");
		System.out.println("Kalan hakkýnýz: "+(5-n));
		n++;}
			
		
		
		
		
		
			
			
	}

}
