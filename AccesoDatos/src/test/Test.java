package test;

import accesoDatos.ImplMysql;
import accesoDatos.IntAccesoDatos;

public class Test {
    
    public static void main(String[] args) {
        
        IntAccesoDatos mysql = new ImplMysql();
        mysql.insertar();
    }
    
}
