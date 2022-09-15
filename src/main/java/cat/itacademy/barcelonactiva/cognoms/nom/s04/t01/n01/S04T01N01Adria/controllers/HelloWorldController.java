package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01Adria.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {


    @GetMapping("/HelloWorld")
    public String greeting(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String name){
        return "Hola, " + name + " estàs executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{name}")
    @ResponseBody
    public String greeting2(@PathVariable(required = true) String name){
        if (name == null)
            name = "UNKNOWN";
        return "Hola, " + name + " estàs executant un projecte Maven";
    }

}
