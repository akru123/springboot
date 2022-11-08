package Mozanta.sample;

import org.springframework.stereotype.Component;

@Component

public class CrudService implements ServiceInterface {
    
    public String getResult(){
        return "Get Mapping";
    }

    public String postResult(Object name){
        System.out.println(name);
        return  "PostMapping";
    }

    public String putResult(Object name){
        System.out.println(name);
        return "Put Mapping";
    }

    public String DltResult(Object id){
        System.out.println(id);
        return "Dlt Mapping";
    }

    
}

    
