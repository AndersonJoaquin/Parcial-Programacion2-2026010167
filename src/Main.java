import com.parcial.model.Vendedor;
import com.parcial.strategy.ComisionEstandar;
import com.parcial.strategy.ComisionPersonalizada;

public class Main {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor("Edwin", 1000.00, new ComisionPersonalizada("Edwin"));
        vendedor.mostrarDetalle();
    }
}
