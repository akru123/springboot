package Mozanta.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")

public class CrudController {

    @Autowired
    CrudService service;

    @GetMapping("/requestparam")
    public String getmap(@RequestParam String name){
        System.out.println(name);
        return "ReqParam";
    }

    @GetMapping("/pathvariable/{id}")
    public String map(@PathVariable("id") Integer id){
        System.out.println(id);
        return "ReqParam";
    }

    @GetMapping("/getmapping")
    public String getString(){
        return service.getResult();

    }

    @PostMapping("/postmapping")
    public Object PostValues(@RequestBody Object name) {
        return service.postResult(name);
    }
    

    @PutMapping("/putmapping")
    public Object PutValues(@RequestBody Object name){
        return service.putResult(name);

    }

    @DeleteMapping("/deletemapping")
    public Object DltValues(@RequestBody Object id){
        return service.DltResult(id);

    }
}
    

