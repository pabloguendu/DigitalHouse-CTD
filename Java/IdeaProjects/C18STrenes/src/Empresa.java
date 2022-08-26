import java.util.ArrayList;
import java.util.List;

public abstract class Empresa {
    private List<Reserva> listReservas;

    protected Empresa(Reserva listReservas) {

        this.listReservas = new ArrayList<>();
    }
}
