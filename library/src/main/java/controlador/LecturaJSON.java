package controlador;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author giovanic
 */
public class LecturaJSON {

    private final JSONParser parser;

    public LecturaJSON() {
        parser = new JSONParser();
    }

    public void readJSON(String file_name) {
        try {
            Reader reader = new FileReader(file_name);

            JSONObject jsonObject;
            jsonObject = (JSONObject) parser.parse(reader);
//            try {
//                jsonObject = (JSONObject) parser.parse(reader);
//                System.out.println(jsonObject);
//                String name = (String) jsonObject.get("name");
//                System.out.println(name);
//                long age = (Long) jsonObject.get("age");
//                System.out.println(age);
//                JSONArray msg = (JSONArray) jsonObject.get("messages");
//                Iterator<String> iterator = msg.iterator();
//                // loop array
//                while (iterator.hasNext()) {
//                    System.out.println(iterator.next());
//                }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(LecturaJSON.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
