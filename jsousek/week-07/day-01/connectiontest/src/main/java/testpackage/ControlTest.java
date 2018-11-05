package testpackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlTest {
@RequestMapping
    public String index(){
    return "<h2> some string</h2>";
}

}
