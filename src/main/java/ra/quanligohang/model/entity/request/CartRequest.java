package ra.quanligohang.model.entity.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CartRequest {
    private String userId;
    private String productId;
    private int quantity;

}
