public class menu {
public static void main(String[] args){
    Persona miPersona = new Persona(1726598988,
            "Melani",
            "Barrera",
            "La Mgdalena",
            "31005756");
    Persona Pedro=new Persona();

    System.out.println(miPersona.getCi());
    System.out.println(Pedro.getCi());

   // Estudiante Nayeli=new Estudiante(1726598988,"Nayeli","Barrera", "La Magdalena", "0995486496", 201002020, "melani.barrera@epn.edu.ec",
          //  "Tercer semestre", "Desarrollo de software");
    //Nayeli.caminar();
    //Nayeli.estudiar();
    //Nayeli.estudiar();
    //Nayeli.leer();
    //System.out.println(Nayeli.getCi());
    //System.out.println(Nayeli.getNombre());
    //System.out.println(Nayeli.getApellido());

    Doctor Ana=new Doctor(172657398,
            "Ana",
            "Rodriguez",
            "Ecuatoriana",
            "Doctora",
            "LEO",
            25360,
            7,
            "33 Años");
    Ana.examinar();
    System.out.println(Ana.getNombre()+  " es " + Ana.getTelefonos());
    System.out.println(Ana.getHospital());
    System.out.println("Su signo es " +Ana.getEspecialidad());



    EmpleadoPublico Pablo=new EmpleadoPublico(173728389,
            "Pablo",
            "Maldonado",
            "La Biloxi",
            "123456",
            "Limpieza",
            "Jefe",
            23445);
    Pablo.tramitar();
    System.out.println("Pablo es Empleado Publico");
    System.out.println(Pablo.getTelefonos());

    Futbolista Marittza=new Futbolista(1234323,
            "Marittza",
            "Villares",
            "5 horas diarias",
            "5468967",
            "LDU",
            "Delantera",
            17,
            "Pablo Suecia");
    Marittza.correr();
    System.out.println(Marittza.getNombre()+ " es Futbolista");
    System.out.println("Entrena " + Marittza.getDireccion());
    // Estudiante Nayeli=new Estudiante(1726598988,"Nayeli","Barrera", "La Magdalena", "0995486496", 201002020, "melani.barrera@epn.edu.ec",
    //  "Tercer semestre", "Desarrollo de software");

    Estudiante Brandon=new Estudiante(12313221,
            "Brandon",
            "Sandoval",
            "Guamani",
            "958649405",
            1242523,
            "Brandon.sandoval@gmail.com",
            "Tercer Semestre",
            "Desarrollo de Software");
    Brandon.leer();
    System.out.println(Brandon.getNombre() + " es Estudainte. ");
    System.out.println(Brandon.getSemestre());




}
}
