import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class teacher {
    @GetMapping("/teacher")
    public String getData(){
        return "Teachers are coming on time";
    }
}