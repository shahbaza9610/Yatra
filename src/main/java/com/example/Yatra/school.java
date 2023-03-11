import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class school {
    @GetMapping("/school")
    public String getData(){
        return  "Please go to school everyday";
    }
}