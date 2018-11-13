package lomboktraining.controllers;

import lomboktraining.WithLombok;
import org.springframework.stereotype.Controller;

@Controller
public class LombokieControllers {

    public LombokieControllers(){
        WithLombok example = WithLombok.builder().drink("beer").
                name("Dan")
                .build();
        example.
    }
}
