import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCredentials {
    public String gender;
    public Name name;
    public Location location;


    @Override
    public String toString() {
        return "UserCredentials{" +
                "gender='" + gender + '\'' +
                ", name=" + name.toString() +
                ", location=" + location.toString() +
                '}';
    }
}
