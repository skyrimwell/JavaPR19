package app.Application.Services;

import app.Application.Classes.Manufacture;
import app.Application.Classes.Phone;
import app.Application.Interfaces.ManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ManufactureService {
    @Autowired
    private final ManufactureRepository manufactureRepository;

    public ManufactureService(ManufactureRepository manufactureRepository) {
        this.manufactureRepository = manufactureRepository;
    }

    public void addManufacture(Manufacture manufacture) {
        manufactureRepository.save(manufacture);
    }

    public List<Manufacture> getManufactures() {
        return manufactureRepository.findAll();
    }

    public List<Manufacture> getByName(String name) {
        return manufactureRepository.findAllByName(name);
    }

    public List<Manufacture> getByAddress(String address) {
        return manufactureRepository.findAllByAddress(address);
    }

    public void deleteManufacture(UUID id) {
        manufactureRepository.deleteById(id);
    }

    public Phone getPhoneByManufacture(UUID id) {
        return manufactureRepository.findById(id).getPhone();
    }
}
