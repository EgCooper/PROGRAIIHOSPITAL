import java.util.List;

public class Hospital {
 String codHospital;
 String nombre;
 Ciudad ciudad;
 int telefono;
 List<Servicio> servicios;

    public Hospital(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicios) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
    }

    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
