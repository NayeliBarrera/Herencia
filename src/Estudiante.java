public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;
    public Estudiante(){
        super();
    }
    public Estudiante(int ci,
                      String nombre,
                      String apellido,
                      String direccion,
                      String telefonos,
                      int codigo,
                      String correo,
                      String semestre,
                      String carrera) {
        super(ci, nombre, apellido, direccion, telefonos);
        //Atributos propios de la clase estudiante
        this.codigo=codigo;
        this.correo=correo;
        this.semestre=semestre;
        this.carrera=carrera;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }
    public void estudiar(){
        System.out.println("Este es el metodo estudiar");
    }
    public void memorizar(){
        System.out.println("Este es el metodo memorizarr");
    }
    public void leer(){
        System.out.println("Este es el metodo leer");
    }
}
