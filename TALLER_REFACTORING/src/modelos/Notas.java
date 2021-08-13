
package modelos;

import java.util.ArrayList;


public class Notas {

   public double nexamen;
    public double ndeberes;
    public double nlecciones;
    public double ntalleres;    
    public ArrayList<Paralelo> paralelos;

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }

    //Calcula y devuelve la nota inicial
    public double CalcularNotaInicial(Paralelo p, Notas notas){
        return CalcularNota(p, notas);
    }
    
    //Calcula y devuelve la nota final
    public double CalcularNotaFinal(Paralelo p,Notas notas){
        return CalcularNota(p, notas);
    }
    
    public double CalcularNota(Paralelo p, Notas notas){
        double nota=0;
        if(paralelos.contains(p)){
            double notaTeorico=(notas.getNexamen()+notas.getNdeberes()+notas.getNlecciones())*0.80;
            double notaPractico=(notas.getNtalleres())*0.20;
            nota=notaTeorico+notaPractico;
        }   
        return nota;
    }
}  

