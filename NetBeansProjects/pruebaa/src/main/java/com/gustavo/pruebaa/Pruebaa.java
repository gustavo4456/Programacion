package com.gustavo.pruebaa;

/**
 *
 * @author Gustavo
 */
public class Pruebaa {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Gustavo", 448451, "Masculino");
        CajaAhorro cajaAhorro1 = new CajaAhorro(25, 80, 25000, 78845);   
        
        Debito debito1 = new Debito(5000, 45421, "12/26", 522);
        Credito credito1 = new Credito(12000, 56562, "5/25", 888);
        
        cajaAhorro1.addTarjeta(debito1);
        cajaAhorro1.addTarjeta(credito1);

        
        cliente1.setProvincia("La Rioja");
        cliente1.setCiudad("La Rioja");
        cliente1.setCalle("Calle siempre viva");
        cliente1.setPais("Argentina");
        cliente1.setNumeroCasa(123);
        
        
        cliente1.addCuenta(cajaAhorro1);
        
        cliente1.pagarImpuesto(5000, "Impuesto a las ganancias");
        cliente1.extraerDinero(2000);
        cliente1.transferencias(6000, 12345, 1231);
    }
}
