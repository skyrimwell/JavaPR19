package app.Application.Controllers;

import app.Application.Classes.Phone;
import app.Application.Services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @PostMapping("/phones")
    public void addUser(@RequestBody Phone phone) {
        phoneService.addPhone(phone);
    }

    @GetMapping("/phoness")
    public List<Phone> getAll() {
        return phoneService.getPhones();
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable UUID id) {
        phoneService.deletePhone(id);
    }

    @GetMapping("/getPhoneByName/{firstName}")
    public List<Phone> getByName(@PathVariable String name){
        return phoneService.getByName(name);
    }

    @GetMapping("/getPhoneByOwner/{owner}")
    public List<Phone> getByLastName(@PathVariable String owner){
        return phoneService.getByOwner(owner);
    }
}
