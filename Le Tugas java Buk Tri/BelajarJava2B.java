public class BelajarJava2B{
	public static void main(String[] args){
		int a = 7,b = 3,c = 2;
		System.out.println("Operator assigment gabungan bahasa Java");
		System.out.println("========================================");
		System.out.println("Variabel a = 7, b = 3, c = 2\n");
		
		a += b += c;
		System.out.println("Penambahan:" + a);
		
		a -= b -= c;
		System.out.println("Pengurangan:" + a);
		
		a *= b *= c;
		System.out.println("Perkalian:" + a);
		
		a /= b /= c;
		System.out.println("Pembagian:" + a);
		
		a %= b %= c;
		System.out.println("Hasil Bagi (Modulus/Modulo):" + a);
	}
}