package abdoul.net.email1.controller;

import abdoul.net.email1.Model.MailStructure;
import abdoul.net.email1.services.MailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class controller {
    private MailService service;

    @GetMapping("/data")
    public String getdata(){
        return "hello data";
    }

    @PostMapping("/send/{mail}")
    public String  send(@PathVariable String mail, @RequestBody MailStructure structure){

        return service.sendMail(mail,structure);
    }
}
