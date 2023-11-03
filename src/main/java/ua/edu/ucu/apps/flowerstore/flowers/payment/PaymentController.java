package ua.edu.ucu.apps.flowerstore.flowers.payment;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/")
public class PaymentController {
    public String receivePayment(){
        return "You can pay!:)";
    }
}
