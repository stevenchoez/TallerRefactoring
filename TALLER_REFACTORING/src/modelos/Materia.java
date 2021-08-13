package modelos;

public class Materia {

    public String codigo;
    public String nombre;
    public String facultad;
   
    
    //Getters y Setters
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getFacultad(){
        return facultad;
    }
    
    public void setFacultad(String facultad){
        this.facultad=facultad;
    }
}


