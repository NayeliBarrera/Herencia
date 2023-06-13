import java.sql.SQLOutput;

public class Persona {
    private int ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefonos;
    public Persona(){

    }
    public Persona(int ci, String nombre, String apellido, String direccion, String telefonos) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }
    public void caminar(){
        System.out.println("Este es el metodo de caminar");
    }
    public int trabajar(){return 0;}

}
