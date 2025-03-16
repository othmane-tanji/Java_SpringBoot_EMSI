package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import java.io.FileNotFoundException;


import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

// DINAMIC
public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Scanner scanner = new Scanner(new File("Injection_des_dependances_T_Othmane\\config.txt"));
        // DaoImpl d = new DaoImpl
        String daoclass = scanner.nextLine();
        Class cDao = Class.forName(daoclass);
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(dao.getData());
        // MetierImpl metier = new MetierImpl(d);
        String metierclassname = scanner.nextLine();
        Class cMetier = Class.forName(metierclassname);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("Resultat = "+metier.calcul());

    }

}
