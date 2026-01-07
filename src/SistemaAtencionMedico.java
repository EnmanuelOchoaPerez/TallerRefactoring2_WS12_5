import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SistemaAtencionMedico {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;
    private static final int EDAD_TERCERA_EDAD = 65;
    private static final double DESCUENTO_ADULTO_MAYOR = 0.25;
    

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta){
        double costoConsulta = consulta.getServicioMedico().getCosto();
        int edadPaciente = paciente.getEdad();
        costoConsulta = calcularValorFinalConsulta(costoConsulta,edadPaciente);
        System.out.println("Se han cobrado "+ costoConsulta+ " dolares de su tarjeta de credito");
        paciente.agregarConsulta(consulta); 
    }

    public double calcularValorFinalConsulta(double costoConsulta, int edadPaciente){
    if(edadPaciente >= EDAD_TERCERA_EDAD){
        return costoConsulta * (1 - DESCUENTO_ADULTO_MAYOR);
    }
    return costoConsulta;
    }

    // se puede parametrizar (obtener...)
  public Paciente obtenerPaciente(String nombrePaciente) {
    return buscarElementoPorNomnbre(pacientes, nombrePaciente, Paciente::getNombre);
  }

  public ServicioMedico obtenerServicioMedico(String nombreServicio) {
    return buscarElementoPorNomnbre(serviciosMedicos, nombreServicio, ServicioMedico::getNombre);
  }

  public Medico obtenerMedico(String nombreMedico) {
    return buscarElementoPorNomnbre(medicos, nombreMedico, Medico::getNombre);
  }

   private <T> T buscarElementoPorNomnbre(List<T> lista, String nombreBuscado, Function<T, String> obtenerNombre) {
    for (T elemento : lista) {
        String nombreElemento = obtenerNombre.apply(elemento);
        
        if (nombreElemento.equals(nombreBuscado)) {
            return elemento;
        }
    }
    return null;
    }
}
