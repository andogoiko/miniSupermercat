package Clases;

import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{

    private String origen;
    private double VALOR_IVA = 0.16;

    public FrutaHortaliza(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String origen) {
        super(codigo, nombre, precio, cantidad, peso, fechacad);
        this.origen = origen;
    }

    public FrutaHortaliza(Scanner in) {
        super(in);
    }

    @Override

    public String volcar(){

        return null;
    }

    public void imprimir(){

    }

    public boolean envioFragil(){
        return false;
    }

    public void calcularPrecioEnvio(){

    }
}
