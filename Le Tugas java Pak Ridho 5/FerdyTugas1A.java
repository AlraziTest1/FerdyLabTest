public class FerdyTugas1A{
	public static void main(String[] args){
		int a = 10;										//	Jumla Integer a = 10
		System.out.println("# Post Increment #");		//	Menampilkan kalimat "# Post Increment # (dan enter)"
		System.out.println("=================");		//	Menampilkan kalimat "================= (dan enter)"
		System.out.println("Isi variabel a: " + a);		//	Menampilkan kalimat "Isi variabel a: [nilai integer a] (dan enter)"
		System.out.println("Isi variabel a: " + a++);	//	Menampilkan kalimat "Isi variabel a: [nilai integer a] (dan enter) "
		System.out.println("Isi variabel a: " + a);		//	Menampilkan kalimat "Isi variabel a: [nilai integer a yang sudah ditambahkan dengan perintah Post increment] (dan enter)"
		
		System.out.println();							//	Memberikan spasi atau "pembatas" pada command
		
		int b = 10;										//	Jumla Integer b = 10
		System.out.println("# Pre Increment #");		//	Menampilkan kalimat "# Pre Increment # (dan enter)"
		System.out.println("=================");		//	Menampilkan kalimat "================= (dan enter)"
		System.out.println("Isi variabel b: " + b);		//	Menampilkan kalimat "Isi variabel a: [nilai integer a] (dan enter)"
		System.out.println("Isi variabel b: " + ++b);	//	Menampilkan kalimat "Isi variabel a: [a + 1]  [lalu menampilkan nilai integer a] (dan enter)"
		System.out.println("Isi variabel b: " + b);		//	Menampilkan kalimat "Isi variabel a: [nilai integer a yang sudah ditambahkan dengan perintah Pre Increment] (dan enter)"
		
	}
}