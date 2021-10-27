package projectjdbc.entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projectjdbc.Customer;
public class Jdbcconnect
{
	public static void main(String[] args) 
	{
		System.out.println("MySQL JDBC Connection Testing ~");
        List<Customer> result = new ArrayList<>();
        String SQL_SELECT = "Select * from EMPLOYEE";
        try (Connection conn = DriverManager.getConnection
        		("jdbc:mysql://localhost:3306/db\r\n", "root", "99Liv#inmario99riya");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) 
        {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String address=resultSet.getString("ADDRESS");
                Customer obj = new Customer();
                obj.setCust_id(id);
                obj.setCust_name(name);
                obj.setCust_address(address);
                result.add(obj);
            }
            result.forEach(x -> System.out.println(x));
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
