import java.util.Date;
import java.util.List;

public class Medico {
    private String CodMedico;
    private String Nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String Dni;
    private Date Fechadenacimiento;
    private List <Servicio>Servicios;
    Hospital hospital;

    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechadenacimiento, List<Servicio> servicios, Hospital hospital) {
        CodMedico = codMedico;
        Nombre = nombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
        Dni = dni;
        Fechadenacimiento = fechadenacimiento;
        Servicios = servicios;
        this.hospital = hospital;
    }

    public Medico(String codMedico, String ariel, String sanchez, String ramirez, String dni, Date time, List<Servicio> servicios, List<Hospital> hospitals) {
    }

    public String getCodMedico() {
        return CodMedico;
    }

    public void setCodMedico(String codMedico) {
        CodMedico = codMedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public Date getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        Fechadenacimiento = fechadenacimiento;
    }

    public List<Servicio> getServicios() {
        return Servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        Servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
