import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    public Street street;

    @Override
    public String toString() {
        return "Location{" +
                "street=" + street.toString() +
                '}';
    }
}
