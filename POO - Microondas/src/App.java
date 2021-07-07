public class App {
    public static void main(String[] args) throws Exception {

        Microondas microondas = new Microondas();

        microondas.temporizador(0, 59, 59);

        microondas.potenciaForno(1);
        microondas.potenciaForno(1);
        microondas.potenciaForno(1);
        microondas.potenciaForno(2);
        System.out.println(microondas.verPotenciaForno());

        System.out.println(microondas.ligarMicroondas());

        System.out.println(microondas.verTempo());


    }
}
