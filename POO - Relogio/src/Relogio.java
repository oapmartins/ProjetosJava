public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    private int dia;
    private int mes;

    /**
     * Ajusta a hora com os valores recebidos como parâmetros. Valores inválidos são
     * colocados como 0.
     * 
     * @param h Hora (0 a 23)
     * @param m Minuto (0 a 59)
     * @param s Segundo (0 a 59)
     */
    public void ajustarHora(int h, int m, int s) {

        if (h > 0 && h <= 23) {
            this.hora = h;
        } else {
            this.hora = 0;
        }

        if (m > 0 && m <= 59) {
            this.minuto = m;
        } else {
            this.minuto = 0;
        }

        if (s > 0 && s <= 59) {
            this.segundo = s;
        } else {
            this.segundo = 0;
        }
    }

    /**
     * Reinicia o relógio para 00:00:00 de 01/01
     */
    public void reiniciar() {
        this.dia = this.mes = 1;
        this.hora = this.minuto = this.segundo = 0;
    }

    public String getHoraCompleta() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public void passarTempo() {
        this.segundo++;

        if (this.segundo == 60) {
            this.minuto++;
            this.segundo = 0;

            if (this.minuto == 60) {
                this.hora++;
                this.minuto = 0;

                if (this.hora == 24) {
                    this.dia++;
                    this.hora = 0;
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }
}
