public class Ciudad {
    String CodCiudad;
    String nombre;

    public Ciudad(String codCiudad, String nombre) {
        CodCiudad = codCiudad;
        this.nombre = nombre;
    }

    public String getCodCiudad() {
        return CodCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        CodCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
