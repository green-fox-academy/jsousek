package lomboktraining;
import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public  class WithLombok {
    List<String> knownTricks = new ArrayList<>();
    String name;
    String food;
    String drink;
}

