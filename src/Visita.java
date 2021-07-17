import java.util.Date;

public class Visita {
    private String codVisita;
    private Date fechahora;
    private Hospital hospital;
    private Servicio servicio;
    private Medico medico;
    private String diagnostico;
    private String tratamientos;
    private String numerocama;
    private Date fechasalida;
    private Historial historial;

    public Visita(String codVisita, Date fechahora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, String numerocama, Date fechasalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechahora = fechahora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numerocama = numerocama;
        this.fechasalida = fechasalida;
        this.historial = historial;
    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getNumerocama() {
        return numerocama;
    }

    public void setNumerocama(String numerocama) {
        this.numerocama = numerocama;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
