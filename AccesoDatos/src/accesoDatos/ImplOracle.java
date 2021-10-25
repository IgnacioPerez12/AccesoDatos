package accesoDatos;

public class ImplOracle implements IntAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Metodo insertar - Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Metodo listar - Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Metodo actualizar - Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Metodo Eliminar - Oracle");
    }
    
}
