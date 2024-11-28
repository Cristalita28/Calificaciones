public class EstudianteTest{
  
  public void runTest(){
    testGetId();
  }

  private static void testGetId(){
     Estudiante estudiante = new Estudiante(1, "Miguel", 41, 7.1);
     if(estudiante.getId() == 1){
         System.out.println("Test testGetId: OK");
       }
       else{
         System.out.println("Test testGetId: NO OK");
       }
   }

   private static void testGetNombre(){
     Estudiante estudiante = new Estudiante(1, "Miguel", 41, 7.1);
     if(estudiante.getNombre() == "Miguel"){
         System.out.println("Test testGetNombre: OK");
       }
       else{
         System.out.println("Test testGetNombre: NO OK");
       }
   }

  private static void testGetEdad(){
    Estudiante estudiante = new Estudiante(1, "Miguel", 41, 7.1);
    if(estudiante.getEdad() == 20){
      System.out.println("Test testGetEdad: OK");
    }
    else{
      System.out.println("Test testGetEdad: NO OK");
    }
  }
  
  private static void testSetCalificacion(){
    Estudiante estudiante = new Estudiante(1, "Miguel", 41, 7.1);
    estudiante.setCalificacion(10);
    if(estudiante.getCalificacion() == 10){
      System.out.println("Test testSetCalificacion: OK");
    }
    else{
      System.out.println("Test testSetCalificacion: NO OK");
    }
  }

  
}