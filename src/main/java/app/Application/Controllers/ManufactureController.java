package app.Application.Controllers;

import app.Application.Classes.Manufacture;
import app.Application.Classes.Phone;
import app.Application.Services.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ManufactureController {
    @Autowired
    private ManufactureService manufactureService;

    @GetMapping("/manufactures")
    public List<Manufacture> getAll() {
        return manufactureService.getManufactures();
    }

    @DeleteMapping("/manufacture/{id}")
    public void delete(@PathVariable UUID id) {
        manufactureService.deleteManufacture(id);
    }

    @GetMapping("/getManufacturesByName/{name}")
    public List<Manufacture> getFilteredBytName(@PathVariable String name){
        return manufactureService.getByName(name); }

    @GetMapping("/getByAddress/{address}")
    public List<Manufacture> getFilteredByAddress(@PathVariable String address){
        return manufactureService.getByAddress(address); }


    @GetMapping(value = "/manufacture/{id}/phone")
    public @ResponseBody
    Phone getGame(@PathVariable("id") UUID id) {
        return manufactureService.getPhoneByManufacture(id);
    }
}
