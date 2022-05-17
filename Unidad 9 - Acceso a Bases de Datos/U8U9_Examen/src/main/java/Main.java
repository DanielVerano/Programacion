import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Consulta 1: getProductLines()
        List<ProductLine> productLines = Consultas.getProductLines();
        for (ProductLine productLine : productLines) {
            System.out.println(productLine);
        }

//        Consulta 2: categoriaMasVendida()
        Consultas.categoriaMasVendida();

//        Transaccion 1: insertarPedido()
        Transacciones.insertarPedido();
    }
}
