import java.util.ArrayList;
import java.util.List;

public class GestorEstudiantes{
  private List<Estudiante> estudiantes;

  public GestorEstudiantes(){
    this.estudiantes = new ArrayList<Estudiante>();
  }

  public void agregarEstudiante(Estudiante estudiante){
    estudiantes.add(estudiante);
  }

  public void eliminarEstudiante(Estudiante estudiante){
    estudiantes.remove(estudiante);
  }

  public Estudiante buscarEstudiante(int id){
    for(Estudiante alumno : estudiantes){
      if(alumno.getId() == id){
        return alumno;
      }
    }
    return null;
  }

  public double obtenerPromedio(){
    if(this.estudiantes.isEmpty()){
      System.out.println("No hay estudiantes registrados");
      return 0.0;
    }
    double suma = 0;
    for(Estudiante alumno : estudiantes){
      suma += alumno.getCalificacion();
    }
    return suma / estudiantes.size();
  }

  public List<Estudiante> getEstudiantes(){
    return estudiantes;
  }
}