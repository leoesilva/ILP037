import Bebidas.Acucar;
import Bebidas.HouseBlend;
import Bebidas.Leite;

public class App {
    public static void main(String[] args) throws Exception {
        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescricao() + ": R$ " + String.format("%.2f", houseBlend.preco()));
        Leite addLeite = new Leite(houseBlend);
        System.out.println(addLeite.getDescricao() + ": R$ " + String.format("%.2f", addLeite.preco()));
        Acucar addAcucar = new Acucar(addLeite);
        System.out.println(addAcucar.getDescricao() + ": R$ " + String.format("%.2f", addAcucar.preco()));
    }
}
