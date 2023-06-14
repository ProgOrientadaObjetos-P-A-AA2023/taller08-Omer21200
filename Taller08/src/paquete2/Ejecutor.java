/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DocenteFactura docenFac = new DocenteFactura();
        DocenteNombramiento docenNom = new DocenteNombramiento();
        String nombre, cedula, opc;
        boolean ban = true, ban2 = true;
        double valorSuledo,valorHoraExtra,numHorasEx,sueldo;
       double valorFact;
        do {
            System.out.print("Ingrese los nombres del Docente: ");
            nombre=sc.nextLine();
            System.out.print("Ingrese la cedula del Docente: ");
            cedula=sc.nextLine();
            System.out.print("Ingrese la clase de Docente\nDocente Nombramiento(1)\nDocente Factura(2)\n");
            opc = sc.nextLine();
            switch (opc) {
                case "1":
                    System.out.print("Ingrese el valor del sueldo: ");
                    valorSuledo=sc.nextDouble();
                    System.out.print("Ingrese el valor de hora Extra: ");
                    valorHoraExtra=sc.nextDouble();
                    System.out.print("Ingrese el numeo de hroas Extra: ");
                    numHorasEx=sc.nextDouble();
                    docenNom.establecerCedula(cedula);
                    docenNom.establecerNombres(nombre);
                    docenNom.establecerValorSueldo(valorSuledo);
                    docenNom.establecerValor_hora_extra(valorHoraExtra);
                    docenNom.establecerNumeroHorasExtra(numHorasEx);
                    docenNom.establecerSueldo();
                    System.out.println(docenNom);
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("Ingrese el valor de la Factura: ");
                    valorFact=sc.nextDouble();
                    docenFac.establecerCedula(cedula);
                    docenFac.establecerNombres(nombre);
                    docenFac.establecerValorFactura(valorFact);
                    docenFac.establecerValorIva();
                    docenFac.establecerValorCancelar();
                    System.out.println(docenFac);
                     sc.nextLine();
                    break;
                default:
                    System.out.println("Error al igresar la opccion");
                    break;
            }
            do {
                System.out.println("Desea ingresar otro docente (Si/No): ");
                opc = sc.nextLine();
                if (opc.equals("Si") || opc.equals("si")) {
                    ban2 = false;
                    ban = true;
                } else if (opc.equals("No") || opc.equals("no")) {
                    ban2 = false;
                    ban = false;
                } else {
                    System.out.println("Error......");
                    ban2 = true;
                }
            } while (ban2);

        } while (ban);
    }
}
