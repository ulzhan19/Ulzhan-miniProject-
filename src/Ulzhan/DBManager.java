package Ulzhan;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dana_bd?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addItem(Students item){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO items (id, name, surname,age) " +
                    "VALUES (NULL, ?, ?)"
            );

            statement.setLong(1, item.getId());
            statement.setString(1, item.getName());
            statement.setString(1, item.getSurname());
            statement.setInt(1, item.getAge());


            int rows = statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Students> getAllItems(){
        ArrayList<Students> itemList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM items");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                itemList.add(new Students(id, name, surname,age));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return itemList;
    }

}
