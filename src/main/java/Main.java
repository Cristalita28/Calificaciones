//autor Cristal Alejandra Arvayo Cota
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    Estudiante miguel = new Estudiante(1, "Miguelón", 41, 7.1);
    Estudiante samanta = new Estudiante(2, "Samanta", 41, 9.0);
    Estudiante arturo = new Estudiante(3, "Arturo", 23, 10);

    GestorEstudiantes gestor = new GestorEstudiantes();
    gestor.agregarEstudiante(miguel);
    gestor.agregarEstudiante(samanta);
    gestor.agregarEstudiante(arturo);

    
    System.out.println("._________________________________________________________________.");
    System.out.println("|                                                                 |");
    System.out.println("|              Sistema de Gestion de Calificaciones               |");
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|"+gestor.buscarEstudiante(1)+"  |");
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|"+gestor.buscarEstudiante(2)+"   |");
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|"+gestor.buscarEstudiante(3)+"   |");
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|                                     Promedio: " + gestor.obtenerPromedio()+" |");
    System.out.println("|_________________________________________________________________|");
    System.out.println("");
    String res = "";
    do{
      System.out.println("Menu del sistema");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Eliminar estudiante");
      System.out.println("3. Buscar estudiante");
      System.out.println("4. Obtener promedio");
      System.out.println("5. Salir");

      int opcion = leer.nextInt();
      switch(opcion){
        case 1:
          System.out.println("Ingrese el id del estudiante");
          int idN = leer.nextInt();
          System.out.println("Ingrese el nombre del estudiante");
          String nombre = leer.next();
          System.out.println("Ingrese la edad del estudiante");
          int edad = leer.nextInt();
          System.out.println("Ingrese la calificacion del estudiante");
          double calificacion = leer.nextDouble();
          Estudiante nuevo = new Estudiante(idN, nombre, edad, calificacion);
          gestor.agregarEstudiante(nuevo);
          System.out.println("Estudiante agregado con exito");
          break;
        case 2:
          System.out.println("Ingrese el id del estudiante a eliminar");
          int id = leer.nextInt();
          if(gestor.buscarEstudiante(id) != null){
            gestor.eliminarEstudiante(gestor.buscarEstudiante(id));
            System.out.println("Estudiante eliminado con exito");
          }
          else {
            System.out.println("Estudiante no eliminado");
          }
          break;
        case 3:
          System.out.println("Ingrese el id del estudiante a buscar");
          int idBuscar = leer.nextInt();
          if(gestor.buscarEstudiante(idBuscar) != null){
            System.out.println(gestor.buscarEstudiante(idBuscar));
          }
          else{
            System.out.println("Estudiante no encontrado");
          }
          break;
        case 4:
          System.out.println("Promedio: "+gestor.obtenerPromedio());
          break;
        case 5:
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opcion invalida");
      }
      leer.nextLine();
      System.out.print("Quieres realizar otra operacion? (s/n)");
      res = leer.nextLine();
    }while(res.equals("s"));

    EstudianteTest test = new EstudianteTest();
    test.runTest();
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}