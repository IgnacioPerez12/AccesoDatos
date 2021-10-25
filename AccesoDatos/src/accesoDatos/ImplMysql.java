package accesoDatos;

public class ImplMysql implements IntAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Metodo insertar - MySql");
    }

    @Override
    public void listar() {
        System.out.println("Metodo listar - MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Metodo actualizar - MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Metodo Eliminar - MySql");
    }
    
    
    
}
