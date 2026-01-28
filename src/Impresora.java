public class Impresora {
    private int nivelToner;
    private int numImpr;
    private boolean isDobleCara;

    public Impresora(int nivelToner, int numImpr){
        this(nivelToner,numImpr,false);
    }

    public Impresora(int nivelToner, int numImpr, boolean isDobleCara) {
        this.nivelToner = addToner(nivelToner);
        this.numImpr = impPag(numImpr,isDobleCara);
        this.isDobleCara = isDobleCara;
    }

    public int addToner(int nivelToner){
        if(nivelToner > 100 || nivelToner < 0) {
            System.out.println("invalido");
            return -1;
        }
        return nivelToner;
    }

    public int impPag(int numImpr, boolean isDobleCara){
        if(isDobleCara)
            return (int) Math.ceil(numImpr/2.0);
        return numImpr;
    }

    public int getNumImpr() {
        return numImpr;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "nivelToner=" + nivelToner +
                ", numImpr=" + numImpr +
                ", isDobleCara=" + isDobleCara +
                "}\n";
    }
}
