import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static void main(String[] args) {
        try {
            URL jsonUrl = new URL("https://randomuser.me/api/?format=json");
            ObjectMapper om = new ObjectMapper();
            try {
                Results results = om.readValue(jsonUrl, Results.class);
                for (UserCredentials us : results.getData()) {
                        System.out.println(us.toString());
                    }
            }catch(IOException e1){
                e1.printStackTrace();
            }
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}
