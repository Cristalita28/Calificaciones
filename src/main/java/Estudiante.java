

public class Estudiante{
  private int id;
  private String nombre;
  private int edad;
  private double calificacion;
  

  public Estudiante(int id, String nombre, int edad, double calificacion){
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
    setCalificacion(calificacion);
    
  }

  public int getId(){
    return id;
  }

  public String getNombre(){
    return this.nombre;
  }

  public int getEdad(){
    return this.edad;
  }
  
  public double getCalificacion(){
    return this.calificacion;
  }

  public double setCalificacion(double calificacion){
    if(calificacion >= 0 && calificacion <= 10){
      this.calificacion = calificacion;
      return calificacion;
    }
    System.out.println("Calificacion invalida");
    return 0;
  }

  public String toString(){
    return "Estudiante: " + nombre + " con id: " + id + " y edad: " + edad + " con calificacion: " + calificacion;
  }
}