import java. util. Scanner; 
public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
	      int matematik, fizik, kimya, turkce, tarih, mzk;

	        //Scanner sınıfı
	        Scanner input = new Scanner(System.in);

	        //Kullanıcıdan verilerin alınıp değişkenlere aktarılması
	        System.out.print("Matematik notunu giriniz: ");
	        matematik=input.nextInt();

	        System.out.print("Fizik notunu giriniz = ");
	        fizik=input.nextInt();

	        System.out.print("Kimya notunu giriniz = ");
	        kimya=input.nextInt();

	        System.out.print("Türkçe notunu giriniz = ");
	        turkce=input.nextInt();

	        System.out.print("Tarih notunu giriniz = ");
	        tarih=input.nextInt();

	        System.out.print("Müzik notunu giriniz = ");
	        mzk=input.nextInt();

	        //Ortalama alan değişkenin tanımlanıp ders notlarının ortalamasının aktarılması
	        double ort=(matematik+fizik+kimya+turkce+tarih+mzk) / 6.0;

	        //Ortalamanın ekrana yazdırılması
	        System.out.println("Ortalamanız: "+ ort );

	        //Ortalamanın 60'ı geçip geçmediğinin kontrolü ve sonucun ekrana bastırılması
	        System.out.println(ort > 60.0 ? "Tebrikler sınıfı geçtiniz :)" : "Üzgünüm sınıfta kaldınız :(" );
	        }
	    }
