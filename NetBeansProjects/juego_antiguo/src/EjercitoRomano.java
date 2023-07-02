public class EjercitoRomano implements EjercitoAtaque {
    private Legionario legionario;
    private boolean estaAtacando;

    public EjercitoRomano(Legionario legionario, boolean estaAtacando) {
        this.legionario = legionario;
        this.estaAtacando = estaAtacando;
    }

    @Override
    public int ataqueTotal() {
        return legionario.atacando();
    }

    public int defensaTotal() {
        return legionario.defendiendo();
    }

    public int vidaEjercito() {
        return legionario.vidaLegionariosTotal();
    }

    public Legionario getLegionario() {
        return legionario;
    }

    public void setLegionario(Legionario legionario) {
        this.legionario = legionario;
    }

    public boolean estaAtacando() {
        return estaAtacando;
    }

    public void setEstaAtacando(boolean estaAtacando) {
        this.estaAtacando = estaAtacando;
    }

}
