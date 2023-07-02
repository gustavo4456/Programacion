public class EjercitoGalo implements EjercitoAtaque {
    private Lancero lancero;
    private boolean estaAtacando;

    public EjercitoGalo(Lancero lancero, boolean estaAtacando) {
        this.lancero = lancero;
        this.estaAtacando = estaAtacando;
    }

    @Override
    public int ataqueTotal() {
        return lancero.atacando();
    }

    @Override
    public int defensaTotal() {
        return lancero.defendiendo();
    }

    public int vidaEjercito() {
        return lancero.vidaLancerosTotal();
    }

    public Lancero getLancero() {
        return lancero;
    }

    public void setLancero(Lancero lancero) {
        this.lancero = lancero;
    }

    public boolean estaAtacando() {
        return estaAtacando;
    }

    public void setEstaAtacando(boolean estaAtacando) {
        this.estaAtacando = estaAtacando;
    }

}
