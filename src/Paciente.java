public class Paciente extends Persona {
    private HistorialMedico historialMedico;
    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public boolean esAdultoMayor(){
        return super.getEdad()>=65;
    }

    public void agregarConsulta(Consulta consulta) {
        historialMedico.agregarConsulta(consulta);
    }
    
    public HistorialMedico getHistorialMedico() {
    return historialMedico;
    }
}