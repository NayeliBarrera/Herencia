public class EmpleadoPublico extends Persona {
    private String puesto;
    private String cargo;
    private int codigo;
    public EmpleadoPublico(int ci,
                           String nombre,
                           String apellido,
                           String direccion,
                           String telefonos,
                           String puesto,
                           String cargo,
                           int codigo) {
        super(ci, nombre, apellido, direccion, telefonos);
        //Atributos propios de Empleado publico
        this.puesto=puesto;
        this.cargo=cargo;
        this.codigo=codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void tramitar(){
        System.out.println("El metodo es Tramitar");
    }
}
