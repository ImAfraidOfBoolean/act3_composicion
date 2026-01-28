public class MainEncapsulacion {
    public static void main(String[] args) {
        Impresora impresora1 = new Impresora(49,3,true);
        Impresora impresora2 = new Impresora(100,10,true);
        Impresora impresora3 = new Impresora(101,5);

        System.out.println(impresora1.toString());
        System.out.println(impresora2.toString());
        System.out.println(impresora3.toString());
    }
}
