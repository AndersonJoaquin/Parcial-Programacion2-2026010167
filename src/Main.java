import com.parcial.model.Vendedor;
import com.parcial.strategy.ComisionEstandar;

public class Main {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor("Edwin", 1000.00, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
