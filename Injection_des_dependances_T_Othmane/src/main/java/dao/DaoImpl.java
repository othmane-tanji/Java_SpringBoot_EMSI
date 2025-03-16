package dao;

// VERSION BASE DE DONNE

public class DaoImpl implements IDao {

    @Override
    public double getData(){
        System.out.println("version base de donne");
        double temp = 22 ;
        return temp;
    }
}
