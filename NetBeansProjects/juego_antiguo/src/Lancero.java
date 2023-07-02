public class Lancero extends Tropas {
    private int bonusGalo;

    public Lancero(int cantidadLanceros, int nivel) {
        super.setAtaque(15);
        super.setDefensa(18);
        super.setVelocidad(8);
        super.setNivel(nivel);
        super.setCantidad(cantidadLanceros);
        this.bonusGalo = 3;
    }

    @Override
    public int atacando() {
        return (super.getAtaque() + this.bonusGalo + (super.getNivel() * 2)) * super.getCantidad();
    }

    @Override
    public int defendiendo() {
        return (super.getDefensa() + this.bonusGalo + (super.getNivel() * 2)) * super.getCantidad();
    }

    public int vidaLancerosTotal() {
        return super.getCantidad() * super.getVida();
    }

    public int getBonusGalo() {
        return bonusGalo;
    }

    public void setBonusGalo(int bonusGalo) {
        this.bonusGalo = bonusGalo;
    }
}
