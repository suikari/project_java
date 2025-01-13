package inc;

import java.sql.*;
import java.util.LinkedHashMap;  
import javax.sql.*;
import org.json.simple.JSONArray;
import org.json.JSONObject;
import org.json.simple.*;

public class DBcon {
	Statement stmt = null;
	DataSource ds = null;
	
	public Connection conn; 
    
    //데이터베이스 연결열기
	public boolean Open(){
		try {
				
			String Con_Str = "";
			String IP = "", PORT = "", DB = "", ID = "", PW = "";

			IP = "192.168.30.52";
			PORT = "1433";
			DB = "TEST";
			ID = "sa";
			PW = "epdl874";
			
			Con_Str = "jdbc:sqlserver://" + IP + ":" + PORT + ";databaseName=" + DB + ";user=" + ID + ";password=" + PW + ";";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(Con_Str);
			
		    return true;
		} catch(Exception ex) {
		    ex.printStackTrace();
		    return false;
		}
	}

	//데이터베이스 연결닫기
	public void Close() {
		if (conn != null) {
		      try {
		        conn.close();
		        conn = null;
		      }
		      catch (Exception err) {
		        err.printStackTrace();
		      }
		    }
    }
	
    //Insert문 데이터저장
	public Boolean Insert(String ISQL){
		Boolean ret = false;
		PreparedStatement pstmt=null;
		try {
			
         pstmt = conn.prepareStatement(ISQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         pstmt.executeUpdate();
         
         pstmt.close();
         pstmt = null;
         
         ret = true;
		}catch (Exception e) {
			ret = false;
			e.printStackTrace();
		}
		return ret;
	}
	
    //Select문 데이터조회
	public String Select(String ISQL){ 
		String RetJson = "";
		try {  
			PreparedStatement pstmt = conn.prepareStatement(ISQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        ResultSet rs = pstmt.executeQuery();
	        
	        RetJson = Convert_JSON(rs); 	        
		}catch (Exception e) {
			e.printStackTrace();
		}
		return RetJson;
	}
	
    //Delete
	public String Delete(String ISQL){ 
		String RetJson = "";
		try {  
			PreparedStatement pstmt = conn.prepareStatement(ISQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        ResultSet rs = pstmt.executeQuery();
	        
	        RetJson = Convert_JSON(rs); 	        
		}catch (Exception e) {
			e.printStackTrace();
		}
		return RetJson;
	}
    //Update
	public void Update(String ISQL){ 

		try {  
			PreparedStatement pstmt = conn.prepareStatement(ISQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        int rs = pstmt.executeUpdate();
	        
	        //RetJson = Convert_JSON(rs); 	        
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String Convert_JSON(ResultSet rs){
		
		JSONArray Json_arr = new JSONArray();
		String ret = "";
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				int numColumns = rsmd.getColumnCount(); 
				JSONObject obj = new JSONObject(new LinkedHashMap());

				for (int i = 1; i < numColumns + 1; i++) {
					String column_name = rsmd.getColumnName(i);
					if (rsmd.getColumnType(i) == java.sql.Types.ARRAY) {
						obj.put(column_name, rs.getArray(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BIGINT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BOOLEAN) {
						obj.put(column_name, rs.getBoolean(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BLOB) {
						obj.put(column_name, rs.getBlob(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.DOUBLE) {
						obj.put(column_name, rs.getDouble(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.FLOAT) {
						obj.put(column_name, rs.getFloat(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.INTEGER) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.NVARCHAR) {
						obj.put(column_name, rs.getNString(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.VARCHAR) {
						obj.put(column_name, rs.getString(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.TINYINT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.SMALLINT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.DATE) {
						obj.put(column_name, rs.getDate(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP) {
						obj.put(column_name, rs.getTimestamp(column_name));
					} else {
						obj.put(column_name, rs.getObject(column_name));
					} 
				} 
				Json_arr.add(obj); 
			} 
			
			ret = Json_arr.toString(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;		
	}	
}