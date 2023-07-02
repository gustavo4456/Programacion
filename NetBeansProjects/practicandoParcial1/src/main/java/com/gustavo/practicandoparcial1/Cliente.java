package com.gustavo.practicandoparcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Cliente {

    private String nombre;
    private int documento;
    private String sexo;
    private List<Cuenta> cuentas;
    private Direccion direccion;

    public Cliente(String nombre, int documento, String sexo) {
        this.nombre = nombre;
        this.documento = documento;
        this.sexo = sexo;
        cuentas = new ArrayList<>();
        direccion = new Direccion();
    }

    public void pagarImpuestos(float impuesto, String nombreImpuesto, int numeroCuenta, int numTarjeta, int numeroPago) {
        if (impuesto > 0) {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumeroCuenta() == numeroCuenta) {
                    for (Tarjeta tarjeta : cuenta.getTarjetas()) {
                        if (tarjeta.getNumeroTarjeta() == numTarjeta) {
                            if (tarjeta instanceof Debito) {
                                if (numeroPago == 1) {
                                    cuenta.setSaldo(tarjeta.comprar(impuesto, numeroPago));
                                } else {
                                    System.out.println("Con tarjeta de debito solo un pago.");
                                }
                            } else {
                                if (numeroPago == 1 || numeroPago == 3) {
                                    tarjeta.comprar(impuesto, numeroPago);
                                } else {
                                    System.out.println("Con tarjeta de Credito puede hacer pagos en 1 o 3 cuotas.");
                                }
                            }
                        } else {
                            System.out.println("La tarjeta no existe.");
                        }
                    }
                } else {
                    System.out.println("No existe esa cuenta.");
                }
            }
        } else {
            System.out.println("El impuesto debe ser positivo.");
        }
    }

    public float extraerDinero(float monto, int numeroCuenta) {
        float saldoRestante = 0;
        for (Cuenta cuenta : cuentas) {
            for (Tarjeta tarjeta : cuenta.getTarjetas()) {
                if (tarjeta instanceof Debito && cuenta.getNumeroCuenta() == numeroCuenta) {
                    saldoRestante = ((Debito) tarjeta).extraerDinero(monto);
                    cuenta.setSaldo(saldoRestante);
                    System.out.println("Saldo restante cliente cuenta  " + cuenta.getNumeroCuenta() + " saldo: " + cuenta.getSaldo());
                } else {
//                    System.out.println("No tiene tarjeta debito asociada.");
                }
            }
        }
        return saldoRestante;
    }

    public void transferencias(float monto, int cbuDestino, int numTarjetaOrigen) {

        System.out.println("Transfericia exitosa. monto " + monto + " enviada a cbu" + cbuDestino);
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public boolean addCuenta(Cuenta e) {
        return cuentas.add(e);
    }

    public boolean removeCuenta(Object o) {
        return cuentas.remove(o);
    }

    public Cuenta getCuenta(int index) {
        return cuentas.get(index);
    }

    public String getPais() {
        return direccion.getPais();
    }

    public void setPais(String pais) {
        direccion.setPais(pais);
    }

    public String getProvincia() {
        return direccion.getProvincia();
    }

    public void setProvincia(String provincia) {
        direccion.setProvincia(provincia);
    }

    public String getCiudad() {
        return direccion.getCiudad();
    }

    public void setCiudad(String ciudad) {
        direccion.setCiudad(ciudad);
    }

    public String getCalle() {
        return direccion.getCalle();
    }

    public void setCalle(String calle) {
        direccion.setCalle(calle);
    }

    public int getNumeroCasa() {
        return direccion.getNumeroCasa();
    }

    public void setNumeroCasa(int numeroCasa) {
        direccion.setNumeroCasa(numeroCasa);
    }

}
