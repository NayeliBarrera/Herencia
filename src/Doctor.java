public class Doctor extends Persona{
    private String especialidad;
    private int codigo;
    private int horario;
    private String hospital;
    public Doctor(int ci,
                  String nombre,
                  String apellido,
                  String direccion,
                  String telefonos,
                  String especialidad,
                  int codigo,
                  int horario,
                  String hospital) {
        super(ci, nombre, apellido, direccion, telefonos);
        this.especialidad=especialidad;
        this.codigo=codigo;
        this.horario=horario;
        this.hospital=hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getHorario() {
        return horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
public void examinar(){
    System.out.println("El metodo es examinar");
}

}
