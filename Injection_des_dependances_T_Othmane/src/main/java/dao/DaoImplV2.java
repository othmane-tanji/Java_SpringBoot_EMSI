package dao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData(){
        System.out.println("version web cloud");
        double temp = 10 ;
        return temp;
    }
}
