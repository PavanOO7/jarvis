import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
public class Post_JSON 
{
	public static void main(String[] args) 
	{
		Post_JSON.PostForGetRequestId();
	}
	public static void PostForGetRequestId() 
	{
           String query_url = "https://api4.truecaller.com/v1/apps/requests";
           String json = "{\"phoneNumber\":919561261770}";
           try 
           {
        	   URL url = new URL(query_url);
        	   HttpURLConnection conn = (HttpURLConnection) url.openConnection();           
        	  // conn.setConnectTimeout(5000);
        	   conn.setRequestProperty("appKey", "uwU1X4c3003c03e644523971ad915988ed957");
        	   conn.setRequestProperty("Content-Type", "application/json");          	 
        	   conn.setDoOutput(true);
        	   conn.setDoInput(true);
        	   conn.setRequestMethod("POST");
        	   OutputStream os = conn.getOutputStream();
        	   os.write(json.getBytes("UTF-8"));
        	   os.close(); 
        	   
        	   // 	read the response
        	   InputStream in = new BufferedInputStream(conn.getInputStream());
        	   String result = IOUtils.toString(in, "UTF-8");
        	   //System.out.println(result);        	   
        	   JSONObject myResponse = new JSONObject(result);
        	   System.out.println("requestId :: "+myResponse.getString("requestId"));        	   
        	   in.close();
        	   conn.disconnect();
           }
           
           catch (Exception e) 
           {
   			   System.out.println(e);
   		   }
	}
}