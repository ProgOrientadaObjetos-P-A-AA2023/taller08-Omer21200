/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author omerb
 */
public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIva;
    private double valorCancelar;

    public void establecerValorFactura(double valorFac) {
        valorFactura = valorFac;
    }

    public void establecerValorIva() {
        valorIva = 0.12;
    }

    public void establecerValorCancelar() {
        valorCancelar = valorFactura + (valorFactura * valorIva);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = "Docente Factura\n";
        cadena = String.format("%sNombre: %s\nCedula: %s\nValor de la Factura: %.2f\n"
                + "Valor del Iva: %.2f\nValor a Cancelar: %.2f\n",
                 cadena,
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
