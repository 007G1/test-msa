package testmsa.domain;

import testmsa.domain.Orderplaced;
import testmsa.MonolithApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Double amount;

    @PostPersist
    public void onPostPersist(){


        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = MonolithApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
