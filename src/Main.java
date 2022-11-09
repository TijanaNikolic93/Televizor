import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Televizor televizor = new Televizor();

        televizor.jacinaTona = 0;
        televizor.ukljucen = false;

        System.out.println(televizor.pocetnaVrednost());

        Televizor televizor1 = new Televizor();

// Pojacavam ton

        //Pimer koriscenja kao varijablu, pa ispis te varijable
        int a = televizor1.pojacavamTon();
        System.out.println(a);

// Smanji ton

        televizor1.smanjiTon();
        System.out.println(televizor1.smanjiTon());

// Ukljuci

        //Pimer koriscenja kao varijablu, pa ispis te varijable
        boolean b = televizor1.ukljuci();
        System.out.println(b);

// Iskljucen

        televizor1.iskljucen();
        System.out.println(televizor1.iskljucen());

//Da li je ukljucen

        televizor1.daLiJeUkljUkljucen();
        System.out.println(televizor1.daLiJeUkljUkljucen());

// Vraca jacinu tona

        televizor1.vratiJacinuTona();
        System.out.println(televizor1.vratiJacinuTona());

// TV opis

        televizor.tvOpis();


        Televizor glavniTv = new Televizor();

        int a1 = glavniTv.pojacavamTon();
        int a2 = glavniTv.vratiJacinuTona();
        boolean b1 = glavniTv.iskljucen();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);

        glavniTv.tvOpis();

// Jacina tona preko Scanner klase
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pojacaj ton: ");
        int daljinskiPojacaj = scanner.nextInt();


        for (int i = televizor.jacinaTona; i < televizor1.pojacavamTon(); i++) {
            if (daljinskiPojacaj < 20) {
                daljinskiPojacaj = 20;
            }
        }
        System.out.println("Jacina tona je: " + daljinskiPojacaj);


        System.out.println("smanji ton: ");
        int daljinskiSmanji = scanner.nextInt();

        for (int i = televizor1.jacinaTona; i < televizor.smanjiTon(); i++) {
            if (daljinskiSmanji < 20) {
                daljinskiSmanji = 20;
            }
        }
        System.out.println("Jacina tona je: " + (daljinskiPojacaj - daljinskiSmanji));


    }
}