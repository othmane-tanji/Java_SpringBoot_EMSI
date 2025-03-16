package pres;
import dao.DaoImpl;
import metier.MetierImpl;
// STATIC
public class Presentation1 {
    public static void main(String[] args){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("result = "+metier.calcul());
    }
}
