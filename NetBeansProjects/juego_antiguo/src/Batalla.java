public class Batalla {
    private EjercitoRomano ejercitoRomano;
    private EjercitoGalo ejercitoGalo;

    public Batalla(EjercitoRomano ejercitoRomano, EjercitoGalo ejercitoGalo) {
        this.ejercitoRomano = ejercitoRomano;
        this.ejercitoGalo = ejercitoGalo;
    }

    public String quienGana() {
        long muertosGalo = 0, muertosRomanos = 0;

        if (this.ejercitoGalo.estaAtacando() == true) {
            muertosRomanos = ((long)ejercitoGalo.ataqueTotal() * (long)ejercitoRomano.getLegionario().getCantidad())
                    / (long)ejercitoRomano.vidaEjercito();
            muertosGalo = ((long)ejercitoRomano.defensaTotal() * (long)ejercitoGalo.getLancero().getCantidad())
                    / (long)ejercitoGalo.vidaEjercito();

            if (muertosGalo > ejercitoGalo.getLancero().getCantidad()) {
                muertosGalo = ejercitoGalo.getLancero().getCantidad();
            }
            if (muertosRomanos > ejercitoRomano.getLegionario().getCantidad()) {
                muertosRomanos = ejercitoRomano.getLegionario().getCantidad();
            }

            return ejercitoGalo.ataqueTotal() > ejercitoRomano.defensaTotal()
                    ? "Gano el ejercito Galo tuvo un total de " + muertosGalo
                            + " muertos y el ejercito enemigo romano tuvo un total de " + muertosRomanos + " muertos."
                    : "Gano el ejercito Romano " + " tuvo un total de " + muertosRomanos
                            + " muertos y el ejercito galo enemigo tuvo un tatal de " + muertosGalo + " muertos.";
        } else {
            muertosGalo = ((long)ejercitoRomano.ataqueTotal() * (long)ejercitoGalo.getLancero().getCantidad())
                    / (long)ejercitoGalo.vidaEjercito();
            muertosRomanos = ((long)ejercitoGalo.defensaTotal() * (long)ejercitoRomano.getLegionario().getCantidad())
                    / (long)ejercitoRomano.vidaEjercito();

            if (muertosGalo > ejercitoGalo.getLancero().getCantidad()) {
                muertosGalo = ejercitoGalo.getLancero().getCantidad();
            }
            if (muertosRomanos > ejercitoRomano.getLegionario().getCantidad()) {
                muertosRomanos = ejercitoRomano.getLegionario().getCantidad();
            }
            return ejercitoRomano.ataqueTotal() > ejercitoGalo.defensaTotal()
                    ? "Gano el ejercito Romano tuvo un total de " + muertosRomanos
                            + " muertos y el ejercito galo enemigo tuvo un total de " + muertosGalo + " muertos."
                    : "Gano el ejercito Galo tuvo un total de " + muertosGalo
                            + " y el ejercito romano enemigo tuvo un total de " + muertosRomanos + " muertos.";
        }
    }
}
