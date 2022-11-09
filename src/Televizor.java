public class Televizor {


    int jacinaTona;
    boolean ukljucen;

    public Televizor() {

    }

    public Televizor(int jacinaTona, boolean ukljucen) {

        this.jacinaTona = jacinaTona;
        this.ukljucen = ukljucen;

    }

    public Televizor(int jacinaTona) {

        this.jacinaTona = jacinaTona;
    }

    public Televizor(boolean ukljucen) {

        this.ukljucen = ukljucen;
    }


    public String pocetnaVrednost() {
        return "Televizor{" +
                "jacinaTona=" + jacinaTona +
                ", ukljucen=" + ukljucen +
                '}';
    }

    public int pojacavamTon() {
        jacinaTona++;
        if (jacinaTona <= 20){
           jacinaTona = 20;
        }
        return 20;

    }

    public int smanjiTon() {
        if (jacinaTona >= 20) {
            jacinaTona = 20;
        }
        return jacinaTona - 1;

    }

    public boolean ukljuci() {
        return !ukljucen;
    }

    public boolean iskljucen() {
        return ukljucen;

    }

    public boolean daLiJeUkljUkljucen() {
        return this.ukljucen;
    }

    public int vratiJacinuTona() {
        if (jacinaTona < 20) {
            jacinaTona = 20;
        }
        return jacinaTona;


    }

    public void tvOpis() {
        System.out.println("Televizor{" +
                "jacinaTona=" + pojacavamTon() +
                "jacinaTona=" + smanjiTon() +
                "ukljucen=" + ukljuci() +
                "ukljucen=" + iskljucen() +
                "ukljucen=" + daLiJeUkljUkljucen() +
                "jacinaTona=" + vratiJacinuTona() +
                '}');

    }
}
