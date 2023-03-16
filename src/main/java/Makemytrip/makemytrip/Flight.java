import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Flight {
    @GetMapping("/Flight")
    public String getData(){
        return  "This Flight is on time";
    }
}