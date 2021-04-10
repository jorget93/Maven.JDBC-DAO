
import daos.DAO;
import daos.Houses;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        DAO dao = new DAO();



        Houses newHouse = new Houses(105, "TownHouse", "blue", true, true, 3 );
        dao.create(newHouse);
        Houses house = dao.findByNumber(105);
        System.out.println(house);

//        List<Houses> houseList = new ArrayList<Houses>();
//        houseList.addAll(dao.findAll());
//        for(Houses house: houseList){
//            System.out.println(house);
//        }





    }

}
