package pro.sky.course2calculatortest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/calculator")
public class Controller {
    private final Service service;
    public Controller(Service service){
        this.service = service;
    }
    @GetMapping
    public String text(){
        return service.text();
    }
    @GetMapping(path ="/plus")
    public String addition(@RequestParam("num1") int number1, @RequestParam ("num2") int number2){
        return service.addition(number1,number2);
    }
    @GetMapping(path ="/minus")
    public String subtraction(@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return service.subtraction(number1,number2);
    }
    @GetMapping(path ="/multiply")
    public String multiplication(@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return service.multiplication(number1,number2);
    }
    @GetMapping(path ="/divide")
    public String division(@RequestParam ("num1") float number1, @RequestParam ("num2") float number2){
        return service.division(number1,number2);
    }
}
