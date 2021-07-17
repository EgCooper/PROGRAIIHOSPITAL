import java.util.Date;

public class Paciente {
    private String codPaciente;
    private String nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String Dni;
    private Date Fechadenacimiento;
    private String numerodeseguridadsocial;

    public Paciente(String codPaciente, String nombre, String primerApellido, String segundoApellido, String dni, Date fechadenacimiento, String numerodeseguridadsocial) {
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
        Dni = dni;
        Fechadenacimiento = fechadenacimiento;
        this.numerodeseguridadsocial = numerodeseguridadsocial;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNumerodeseguridadsocial() {
        return numerodeseguridadsocial;
    }

    public void setNumerodeseguridadsocial(String numerodeseguridadsocial) {
        this.numerodeseguridadsocial = numerodeseguridadsocial;
    }

}
