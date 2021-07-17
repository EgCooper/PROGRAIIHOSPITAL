import java.util.List;

public class Servicio {
    private String idServicio;
    private String nombre;
    private List <Hospital>Hospitales;
    private String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        Hospitales = hospitales;
        this.comentario = comentario;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hospital> getHospitales() {
        return Hospitales;
    }

    public void setHospitales(List<Hospital> hospitales) {
        Hospitales = hospitales;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
