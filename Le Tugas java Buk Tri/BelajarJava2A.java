public class BelajarJava2A{
	public static void main(String[] args){
		int a = 5,b = 10,c;
		System.out.println("Operator assigment gabungan bahasa Java");
		System.out.println("========================================");
		System.out.println("Variabel a = 5,b = 10 \n");
		
		b += a;
		System.out.println("Penambahan:" + b);
		
		b -= a;
		System.out.println("Pengurangan:" + b);
		
		b *= a;
		System.out.println("Perkalian:" + b);
		
		b /= a;
		System.out.println("Pembagian:" + b);
		
		b %= a;
		System.out.println("Hasil Bagi (Modulus/Modulo):" + b);
	}
}