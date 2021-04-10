package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO implements CrudOps<Houses>{
    private Connection connection = ConnectionFactory.getConnection();

    public Houses findByNumber(int number) {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(String.format("SELECT * From Houses Where Number = %d", number));

            if(rs.next()){
                Houses house = new Houses();

                house.setNumber(rs.getInt("Number"));
                house.setType(rs.getString("Type"));
                house.setColor(rs.getString("Color"));
                house.setPool(rs.getBoolean("Pool"));
                house.setYard(rs.getBoolean("Yard"));
                house.setTenants(rs.getInt("Tenants"));
                return house;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Houses> findAll() {
        List<Houses> housesList = new ArrayList<Houses>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * From Houses");

            if(rs.next()){
                Houses house = new Houses();

                house.setNumber(rs.getInt("Number"));
                house.setType(rs.getString("Type"));
                house.setColor(rs.getString("Color"));
                house.setPool(rs.getBoolean("Pool"));
                house.setYard(rs.getBoolean("Yard"));
                house.setTenants(rs.getInt("Tenants"));
                while(rs.next()) {
                    housesList.add((Houses) rs.getObject(String.valueOf(house)));
                }
            }
            return housesList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public Houses update(Houses dto) {
        return null;
    }

    public Houses create(Houses dto) {
        return null;
    }


    public void delete(int number) {

    }
}
