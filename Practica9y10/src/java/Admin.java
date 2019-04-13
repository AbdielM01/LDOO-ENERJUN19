import java.sql.*;
public class Admin extends Usuario{
    
    String nempleado;
    
    public Admin(){
    }
    
    public void setAttributes(String uno, String dos){   
        this.nempleado=uno; 
    }
    public String insertarDatosPorUsuario(){
        
        String out = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root", "");
            PreparedStatement prepared =connection.prepareStatement("INSERT INTO ADMIN VALUES('"+ iduser +"','"+ nempleado+ "')");
            prepared.executeUpdate();
        }catch(Exception e){
            out = String.format("Error Horrible: %s", e.getMessage());
        }
        return out;
    
    
    }
    
    public String[] traerDatosPorTipo(){
       
        String out[]=new String[2];
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root", "");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT *  FROM ADMIN WHERE IDUSER='"+ iduser + "'");
        
        while(result.next()){
            
            out[0]= result.getString("iduser");
            out[1]= result.getString("nempleado"); 
            
        }
        }catch(Exception e){
            out[0] = String.format("Error Horrible: %s", e.getMessage());
        }
        return out;
    }

   
}
