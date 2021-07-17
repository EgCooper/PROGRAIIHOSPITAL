public class Historial {
    private String Codhistorial;
    private Paciente paciente;

    public Historial(String codhistorial, Paciente paciente) {
        Codhistorial = codhistorial;
        this.paciente = paciente;
    }

    public String getCodhistorial() {
        return Codhistorial;
    }

    public void setCodhistorial(String codhistorial) {
        Codhistorial = codhistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
