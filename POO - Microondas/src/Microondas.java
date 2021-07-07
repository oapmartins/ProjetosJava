public class Microondas {

    private static int tempoMaximo = 59;
    private int segundos;
    private int minutos;
    private int horas;
    private int potenciaForno = 1;
    private boolean portaAberta = true;
    private boolean micLigado;

    /**
     * Para configurar o tempo do microondas, passar os seguintes parâmentros:
     * 
     * @param hora - Hora
     * @param min  - Minuto
     * @param seg  - Segundo
     */
    public void temporizador(int hora, int min, int seg) {

        if (hora >= 0 && hora <= this.tempoMaximo) {
            this.horas = hora;

            if (min >= 0 && min <= this.tempoMaximo) {
                this.minutos = min;

                if (seg > 0 && seg <= this.tempoMaximo) {
                    this.segundos = seg;
                }
            }
        }
    }

    /**
     * Método para abrir a porta. Para abrir a mesma, o microondas deve estar
     * desligado.
     */
    public String abrirPorta() {

        String retornoAbrirPorta;

        if (!micLigado) {
            this.portaAberta = true;
            retornoAbrirPorta = "A porta não pode ser aberta pois o microondas está ligado.";
        } else {
            retornoAbrirPorta = "A porta do microondas foi aberta";
        }
        return retornoAbrirPorta;
    }

    /**
     * Método para fechar a porta.
     */
    public String fecharPorta() {
        this.portaAberta = false;
        return "A porta do microondas foi fechada";
    }

    /**
     * Método para ligar o microondas, para fazer essa função. o microondas deve
     * estar com a porta fechada.
     */
    public void ligarMicroondas() {
        if (this.portaAberta == false) {
            this.micLigado = true;
        }
    }

    /**
     * Método para interromper o temporizador. Os valores de hora, minuto e segundo
     * são redefinidos para 00:00:00.
     */
    public void interromperTemporizador() {
        this.horas = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    /**
     * Método ver tempo.
     * 
     * @return - retorna a hora, minuto e segundos configurados para o microondas.
     */
    public String verTempo() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }

    /**
     * Método para configurar a potência do forno.
     * 
     * @param potencia (passar 1 para aumentar, e 2 para diminuir a potência do
     *                 forno).
     */
    public void potenciaForno(int potencia) {
        if (potencia == 1) {
            if (this.potenciaForno >= 1 && this.potenciaForno <= 10) {
                this.potenciaForno++;
            }
        }

        if (potencia == 2) {
            if (this.potenciaForno > 1 && this.potenciaForno <= 10) {
                this.potenciaForno--;
            }
        }
    }

    /**
     * Método para ver a potência do forno.
     * 
     * @return - retorna a potência que o forno está no momento.
     */
    public String verPotenciaForno() {
        return "A potência do forno está no " + this.potenciaForno;
    }
}
