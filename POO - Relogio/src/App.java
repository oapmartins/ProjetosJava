public class App {
    public static void main(String[] args) throws Exception {
        Relogio relogio = new Relogio();

        relogio.ajustarHora(23, 12, 25);
        System.out.println(relogio.getHoraCompleta());
        relogio.reiniciar();
        System.out.println(relogio.getHoraCompleta());
    }
}
