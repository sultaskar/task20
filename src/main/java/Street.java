import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Street {
    public int number;
    public String name;

    @Override
    public String toString() {
        return "Street{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
