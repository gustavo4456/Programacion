public class Legionario extends Tropas {

    private int bonusRomano;

    

    public Legionario(int cantidadLegionarios, int nivel) {
        super.setAtaque(20);
        super.setDefensa(12);
        super.setVelocidad(5);
        super.setNivel(nivel);
        super.setCantidad(cantidadLegionarios);
        this.bonusRomano = 2;
    }

    @Override
    public int atacando() {
        return (super.getAtaque() + this.bonusRomano + (super.getNivel() * 2)) * super.getCantidad();
    }

    @Override
    public int defendiendo() {
        return (super.getDefensa() + this.bonusRomano + (super.getNivel() * 2)) * super.getCantidad();
    }

    public int vidaLegionariosTotal(){
        return super.getCantidad() * super.getVida();
    }

    public int getBonusRomano() {
        return bonusRomano;
    }

    public void setBonusRomano(int bonusRomano) {
        this.bonusRomano = bonusRomano;
    }

}
