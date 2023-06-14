/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author omerb
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valor_hora_extra;
    private double numeroHorasExtra;
    private double sueldo;

    public void establecerValorSueldo(double valorSuel) {
        valorSueldo = valorSuel;
    }

    public void establecerValor_hora_extra(double valorhoraextra) {
        valor_hora_extra = valorhoraextra;
    }

    public void establecerNumeroHorasExtra(double numeroHorasEx) {
        numeroHorasExtra = numeroHorasEx;
    }

    public void establecerSueldo() {
        sueldo = valorSueldo + (valor_hora_extra * numeroHorasExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValor_hora_extra() {
        return valor_hora_extra;
    }

    public double obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String cadena = "Docente Nombramiento\n";
        cadena = String.format("%sNombre: %s\nCedula: %s\nValor del Sueldo: %.2f\n"
                + "Valor de hora Extra: %.2f\nNumero de Horas Extra: %.2f\n"
                + "Sueldo:%.2f\n", cadena,
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValor_hora_extra(),
                obtenerNumeroHorasExtra(),
                obtenerSueldo());
        return cadena;
    }
}
