public class Futbolista extends Persona {
    private String equipo;
    private String posicion;
    private int NumCamiseta;
    private String representante;
    public Futbolista(int ci,
                      String nombre,
                      String apellido,
                      String direccion,
                      String telefonos,
                      String equipo,
                      String posicion,
                      int NumCamiseta,
                      String representante) {
        super(ci, nombre, apellido, direccion, telefonos);
        //Atributos propios de Futbolista
        this.equipo=equipo;
        this.posicion=posicion;
        this.NumCamiseta=NumCamiseta;
        this.representante=representante;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumCamiseta() {
        return NumCamiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumCamiseta(int numCamiseta) {
        NumCamiseta = numCamiseta;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void correr(){
        System.out.println("El metodo es Correr");
    }
}
