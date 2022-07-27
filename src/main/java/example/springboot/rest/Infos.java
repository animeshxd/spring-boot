package example.springboot.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.springboot.rest.classes.Info;

@RestController
public class Infos {

    @RequestMapping("/infos")
    public List<Info> infos(){
        return List.of(
            new Info("A", 1),
            new Info("B", 2),
            new Info("C", 3),
            new Info("D", 4),
            new Info("E", 5)
        );
    }
}
