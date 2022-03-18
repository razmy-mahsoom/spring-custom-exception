package lk.quadrate.controller;

import lk.quadrate.model.ApplicationUser;
import lk.quadrate.service.ApplicationUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class ApplicationUserController {

    private ApplicationUserService service;

    @GetMapping("{id}")
    public ApplicationUser getApplicationUser(@PathVariable Long id){
        return service.getApplicationUser(id);
    }
}
