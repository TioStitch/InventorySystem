import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class Inventory {
    private byte inventorySize;
    private List<String> items;
    private boolean isFull = false;
    private String fullMessage;
}
