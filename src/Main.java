public class Main{
    static SistemaAtencionMedico sistemaAtencionMedica;
    public static void main(String[] args) {
        inicializar();
        Paciente paciente = sistemaAtencionMedica.obtenerPaciente("Dario");
        ServicioMedico servicioMedico = sistemaAtencionMedica.obtenerServicioMedico("Psiquiatria");
        Medico medico = sistemaAtencionMedica.obtenerMedico("Nohelia");
        Consulta consulta = new Consulta(05,05,2002,"12:05",paciente,medico,servicioMedico,"dvasdv","asdvas",null);
        sistemaAtencionMedica.agendarConsulta(paciente,consulta);
    }

    public static void inicializar(){
        sistemaAtencionMedica = new SistemaAtencionMedico();
        Paciente paciente = new Paciente("Dario",21,"Masculino","Floresta 2","0948759754","dlaborde@espol.edu.ec");
        Medico medico = new Medico("Nohelia",20,"Femenino","Duran","0991459625","nohePasaca@espol.edu.ec");
        ServicioMedico servicioMedico = new ServicioMedico("Psiquiatria","rama que trata problemas mentales",45.5,40);
        sistemaAtencionMedica.agregarPaciente(paciente);
        sistemaAtencionMedica.agregarMedico(medico);
        sistemaAtencionMedica.agregarServicioMedico(servicioMedico);
    }
} 