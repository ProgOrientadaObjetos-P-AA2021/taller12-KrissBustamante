
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return notas;
    
    }

     public void establecerMejorNota(){
       for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).obtenerValor() > mejorNota) {
                mejorNota = notas.get(i).obtenerValor();
            }
        }
    
    }
    
    public double obtenerMejorNota(){
        return mejorNota;
    
    }
    public void establecerPeorNota() {
        double s = 10;
        for (int i = 0; i < notas.size(); i++) {
            if (s > notas.get(i).obtenerValor()) {
                s = notas.get(i).obtenerValor();
            }
        }
        peorNota = s;
    }
       
     
    public double obtenerPeorNota(){
      
    return peorNota;
    }
     public void establecerPromedio(){
         double suma = 0;
       for (int i = 0; i < notas.size(); i++) {
           
            suma = suma +notas.get(i).obtenerValor() ;
               
            }
       promedio = suma/notas.size();
    
    }
     
    public double obtenerPromedio(){
        return promedio; 
    
    }
      
     
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre Estudiante:%s %s\n"
                 + "Cédula: %s"
                + "Notas: \n"
                + "Promedio: %.1f"
                + "Mejor Nota: %.1f"
                + "Peor Nota: %f", obtenerNombresEstudiante(),
                obtenerApellidosEstudiante(),obtenerIdentificacionEstudiante(),
                obtenerMejorNota(),obtenerPeorNota());
        return cadena;
    }
    
    
    

}
