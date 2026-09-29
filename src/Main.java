import com.parcial.model.Vendedor;
import com.parcial.strategy.ComisionEstandar;
import com.parcial.strategy.ComisionPersonalizada;
import com.parcial.strategy.EstrategiaComision;

public class Main {
    public static void main(String[] args){
        String nombre = "Edwin";
        EstrategiaComision estrategia = new ComisionEstandar();
        Vendedor vendedor = new Vendedor(nombre, 1000.00, estrategia);
        vendedor.mostrarDetalle();
    }
}
