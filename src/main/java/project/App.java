package project;

import org.json.JSONObject;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONObject json = new JSONObject();
        json.put("lastName", "Datsenko");
        json.put("name", "Oleksandr");
        System.out.println(json);
    }
}
