import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return recetasMedicas;
    }

    public void setRecetasMedicas(List<RecetaMedica> recetasMedicas) {
        this.recetasMedicas = recetasMedicas;
    }
}
