import java.util.Scanner;
import java.io.IOException;

// flush command
// new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

public class FerdyUTSDevelopedLab1{
	public static void main(String[] args)throws IOException, InterruptedException{
			Scanner cin = new Scanner(System.in);
			
			String Option;
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	//flusshhhhhhhhhhhh
			
			Option = "LOCK CODE";                 
			while(Option != ("BREAK CODE")){	
				System.out.println("Option : ");
				System.out.println("\n\n\n\n[a] = melihat soal (WORKING)\n==========[Fitur di bawah BELUM SELESAI dikarenakan kekurangan waktu]===============      -Ferdy XI RPL\n\n\n[1] melihat jawaban nomor 1 (MAINTENANCE)\n[2] melihat jawaban nomor 2 (MAINTENANCE)"
				+"\n[3] melihat jawaban nomor 3 (MAINTENANCE)\n[4] melihat jawaban nomor 4 (MAINTENANCE)\n[5] melihat jawaban nomor 5 (MAINTENANCE)\n[6] melihat jawaban nomor 6 (MAINTENANCE)\n[7] melihat jawaban nomor 7 (MAINTENANCE)"
				+"\n[8] melihat jawaban nomor 8 (MAINTENANCE)\n[9] melihat jawaban nomor 9 (MAINTENANCE)\n[10] melihat jawaban nomor 10 (MAINTENANCE)\n");
		 
				System.out.print("Input : ");
				Option = cin.nextLine();
		 
			 if(Option == ("a")){
				System.out.println("==========[ Le UTS Ferdy ]==========");
				System.out.println("\n\n");
				
				System.out.println("==========[ Soal ]==========");
				
				System.out.println("1.Tuliskan sejarah singkat tentang aplikasi Java,\n berikut nama perusahaan pengembangnya saat ini \n");
				
				System.out.println("2.Tuliskan 3 aplikasi yang menggunakan metode OOP,\n Berikut sejarah singkat masing masing aplikasi tersebut! \n");
				
				System.out.println("3.Apa yang dimaksud dengan metode OOP dalam bahasa pemrograman? \n");
				
				System.out.println("4.Tuliskan 6 jenis tipe data,berikut definisinya,dan contohnya! \n");
				
				System.out.println("5.Apa perbedaan variabel,dan konstanta \n");
				
				System.out.println("6.Tuliskan difinisi,dan perbedaan increment,dan decrement dalam Java! \n");
				
				System.out.println("7.Tuliskan perbedaan OOP,dan pemrograman terstruktur,dan tuliskan kelebihan masing masing \n");
				
				System.out.println("8.Buatlah 1 contoh penggunaan operator if,then else \n");
				
				System.out.println("9.Buatlah 1 jenis operator lain \n");
				
				System.out.println("10.Buat soal sendiri,trus jawab sendiri (yang berkaitan dengan PB objek) \n");
				
				
				System.out.println("Pilih Jawaban nomor berapa? \n");
				
				System.out.print("Jawaban : ");
				
				Option = cin.nextLine();
				
			 }else if(Option == ("1")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 1 : \n");
					System.out.println("Bahasa pemrograman java dibuat pada tahun 1991 oleh James Gosling,\n seorang ahli pemrograman yang bekerja di Sun Microsystem. \n Awalnya bahasa pemrograman ini diberi nama Oak. \n Yang mendapat inspirasi dari sebuah pohon yang berada di seberang kantornya. \n");
					
				}else if(Option == ("2")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 2 : \n");
					
					System.out.println("\n 1.Java");
					System.out.println("Sejarah : ");
					System.out.println("Bahasa pemrograman java dibuat pada tahun 1991 oleh James Gosling,\n seorang ahli pemrograman yang bekerja di Sun Microsystem. \n Awalnya bahasa pemrograman ini diberi nama Oak. \n Yang mendapat inspirasi dari sebuah pohon yang berada di seberang kantornya. \n");
					
					System.out.println();	// ENTERRRRRR
					
					System.out.println("2.C++");
					System.out.println("Sejarah : ");
					System.out.println("C++ C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, \n yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie).\n Pada awal tahun 1970-an, bahasa itu merupakan peningkatan dari bahasa sebelumnya, yaitu B. \n");
					
					System.out.println();	// ENTERRRRRR
					
					System.out.println("3.Python");	
					System.out.println("Sejarah : ");
					System.out.println("Python dibuat pada akhir 1980-an oleh Guido van Rossum di Centrum Wiskunde & Informatica (CWI) di \n Belanda sebagai penerus bahasa ABC (sendiri terinspirasi oleh SETL), \n mampu menangani pengecualian dan berinteraksi dengan sistem operasi Amoeba. \n Implementasinya dimulai pada bulan Desember 1989. \n");
					
				}else if(Option == ("3")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 3 : \n");
					
					System.out.println("Pemrograman berorientasi objek merupakan paradigma pemrograman berdasarkan konsep 'objek', \n yang dapat berisi data, dalam bentuk field atau dikenal juga sebagai atribut; serta kode, \n dalam bentuk fungsi/prosedur atau dikenal juga sebagai method. \n");
				
				}else if(Option == ("4")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 4 : \n");
					
					System.out.println("\n 1.Integer");
					System.out.println("Data integer adalah tipe data yang berisi kumpulan bilangan bulat, baik dalam bentuk bilangan positif maupun negatif. \n Integer atau yang disingkat (int) merupakan tipe data yang paling umum digunakan untuk menyimpan angka tanpa komponen pecahan. \n");
					System.out.println();	// ENTERRRRRR
				
					System.out.println("2.Float");
					System.out.println("Banyak perhitungan di komputer yang menggunakan angka dengan nilai dibelakang koma, disebut juga dengan bilangan desimal. Misalnya, \n ketika kamu menghitung nilai lingkaran, maka harus menggunakan pi yang nilainya adalah sekitar 3,141159. \n");
					System.out.println();	// ENTERRRRRR
					
					System.out.println("3.Char");	
					System.out.println("Melansir Rebus Community, character merupakan tipe data yang dimanfaatkan untuk \n menyimpan satu huruf, angka, tanda baca, simbol, atau space kosong. Umumnya, \n ia juga digunakan pada berbagai bahasa pemrograman di banyak komputer modern. \n");		
					System.out.println();	// ENTERRRRRR
					
					System.out.println("4.String");	
					System.out.println("Tipe data string adalah tipe data yang digunakan untuk menyimpan barisan karakter. \n Sebuah string umumnya dianggap sebagai tipe data dan sering diimplementasi sebagai struktur data array \n bita (atau kata) yang menyimpan urutan elemen, biasanya karakter, menggunakan beberapa pengkodean karakter. \n");		
					System.out.println();	// ENTERRRRRR
					
					System.out.println("5.Boolean");	
					System.out.println("Boolean adalah jenis tipe data selanjutnya yang perlu kamu kuasai sebelum terjun ke dunia pemrograman.\nJenis data type ini biasanya digunakan untuk mewakili nilai yang benar dan salah dalam data.\nUmumnya, nilai yang salah (false) dan benar (true) direpresentasikan dengan angka 0 (false) dan 1 (true).\nBoolean sendiri hanya bisa merepresentasikan dua nilai dengan pertimbangan seperti hubungan angka yang lebih kecil atau lebih besar.. \n");		
					System.out.println();	// ENTERRRRRR	

					System.out.println("6.Array");	
					System.out.println("Array adalah tipe data berbentuk daftar yang mampu mengarsip sejumlah elemen dalam urutan tertentu dari seluruh data yang serupa.\nJenis data type ini memiliki banyak elemen atau nilai struktur data yang diambil serta diterapkan menggunakan indeks integer seperti 0, 1, 3, 4, dan seterusnya.\nSebagai contoh, program aplikasi pengukur kalori dirancang dengan menyimpan lebih dari satu elemen dalam bentuk jenis olahraga yang dilakukan. \nDalam variabel yang berbentuk jenis olahraga ini akan diindeks empat nilai berupa 0 (bola basket), 1 (renang), 3 (jogging), dan 4 (bersepeda).\nBerdasarkan hal tersebut, panjang array adalah 4 karena mencakup empat elemen olahraga yang berbeda. \n");
					System.out.println();	// ENTERRRRRR			
					
				}else if(Option == ("5")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 5 : \n");
					System.out.println("Suatu variabel, nilainya dapat berubah-ubah dalam proses program berjalan dan sangat mungkin nilainya berbeda ketika pertama kali dideklarasikan.\nNamun, konstanta akan bernilai tetap dan tidak berubah sesuai dengan pertama kali konstanta itu dideklarasikan. \n");
					
				}else if(Option == ("6")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 6 : \n");
					System.out.println("Increment digunakan untuk menambah variabel sebanyak 1 angka, sedangkan decrement digunakan untuk mengurangi variabel sebanyak 1 angka.\n Penulisannya menggunakan tanda tambah 2 kali untuk increment, dan tanda kurang 2 kali untuk decrement.\n");
					
				}else if(Option == ("7")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 7 : \n");
					System.out.println("Perbedaan OOP dengan Terstruktur : \n");
					System.out.println("Pemrograman Terstruktur terdiri dari pemecahan masalah yang besar menjadi masalah yang lebih kecil dan seterusnya, sedangkan untuk pemrograman berorientasi objek terdiri dari \npengkelompokan kode dengan data yang setiap objeknya berfungsi secara independen sehingga pada setiap perubahan kode tidak bergantung pada kode yang lainnya, atau lebih dikenal dengan modular. \n");
					
					System.out.println("\n\nKelebihan OOP : \n");
					System.out.println("Kelebihan OOP pertama adalah masalah maintenance program yang lebih mudah.\n Programer bisa lebih mudah dalam membaca dan memahami script program yang ditulis dengan melihat dokumentasi program. \n");
					
					System.out.println("\n\nKelebihan Terstruktur : \n");
					System.out.println("Mempunyai flowchart pemecahan masalah yang sederhana, standar dan efektif. \n");
				}else if(Option == ("8")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 8 : \n");
					System.out.println("Kode program ini sudah dibuat dengan (if,else if,else)... \n        -Ferdy XI RPL");
				
				}else if(Option == ("9")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 9 : \n");
					System.out.println("Ternary operator : \n");
					System.out.println("Berada di file berbeda... \n        -Ferdy XI RPL");
					
				}else if(Option == ("10")){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("Jawaban nomor 10 : \n");
					System.out.println("Soal : Apa perbedaan Class dan Objek \n");
					System.out.println("Kelas adalah pemodelan dari objek yang berisi informasi tentang karakteristik(data) dan tingkah laku yang dimiliki oleh objek tersebut(metode),\n sedangkan objek merupakan perwujudan dari suatu kelas. \n");
					
				}else{
					System.out.println("Operator yang dimasukkan salahhhhhhh \n");
				}
			}
			
			
		}
	}