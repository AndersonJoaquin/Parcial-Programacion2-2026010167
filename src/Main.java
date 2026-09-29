import com.parcial.model.Vendedor;
import com.parcial.strategy.ComisionEstandar;
import com.parcial.strategy.ComisionPersonalizada;

public class Main {
    public static void main(String[] args){
        String nombre = "Edwin";
        Vendedor vendedor = new Vendedor(nombre, 1000.00, new ComisionPersonalizada(nombre));
        vendedor.mostrarDetalle();
    }
}
