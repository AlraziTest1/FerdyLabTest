public class Mobilv{
	String warna;
	int tahunproduksi;
	int nomor_mesin;
	int nomor_rangka;
	
	//Method mengisi variabel instance
	void isi(String warna,int tahunproduksi,int nomor_rangka,int nomor_mesin){
		this.warna = warna;
		this.tahunproduksi = tahunproduksi;
		this.nomor_rangka = nomor_rangka;
		this.nomor_mesin = nomor_mesin;
	}
	
	//Method menampilkan isi variabel instance
	
	String ambil_warna(){
		return warna;
	}
	
	int ambil_tahunproduksi(){
		return tahunproduksi;
	}
	
	int ambil_nomor_rangka(){
		return nomor_rangka;
	}
	
	int ambil_nomor_mesin(){
		return nomor_mesin;
	}
	
	public static void main(String[] args){
		Mobilv MobilNiaga = new Mobilv();
		
		//Proses pemanggilan method void
		MobilNiaga.isi("hijau",2009,878987,908768);
		System.out.println("Warna		: " + MobilNiaga.ambil_warna());
		System.out.println("Tahun Produksi	: " + MobilNiaga.ambil_tahunproduksi());
		System.out.println("Nomor Mesin	: " + MobilNiaga.ambil_nomor_mesin());
		System.out.println("Nomor Rangka	: " + MobilNiaga.ambil_nomor_rangka());
	}
}
		
	
	
	
	
	