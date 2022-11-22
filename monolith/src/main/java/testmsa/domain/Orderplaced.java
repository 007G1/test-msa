package testmsa.domain;

import testmsa.domain.*;
import testmsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;

    public Orderplaced(Order aggregate){
        super(aggregate);
    }
    public Orderplaced(){
        super();
    }
}
