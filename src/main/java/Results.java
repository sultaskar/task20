import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    @JsonProperty("results")
    public UserCredentials[] data;


    public UserCredentials[] getData() {
        return data;
    }

}
