public class App {
    public static void main(String[] args) throws Exception {
        
        Legionario leg = new Legionario(500, 2);
        Lancero lan = new Lancero(400, 2);

        EjercitoGalo ejercitoGalo = new EjercitoGalo(lan, false);
        EjercitoRomano ejercitoRomano = new EjercitoRomano(leg, true);

        Batalla batalla = new Batalla(ejercitoRomano, ejercitoGalo);

        System.out.println("Poder total romano atacando: " + leg.atacando());
        System.out.println("Poder total romano defendiendo: " + leg.defendiendo());

        System.out.println("Poder total galo atacando: " + lan.atacando());
        System.out.println("Poder total galo defendiendo: " + lan.defendiendo());

        System.out.println(batalla.quienGana());
    }
}
