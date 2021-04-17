package app.Application.Services;

import app.Application.Classes.Phone;
import app.Application.Interfaces.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PhoneService {
    @Autowired
    private final PhoneRepository phoneRepository;

    public PhoneService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public void addPhone(Phone phone) {
        phoneRepository.save(phone);
    }

    public List<Phone> getPhones() {
        return phoneRepository.findAll();
    }

    public void deletePhone(UUID id) {
        phoneRepository.deleteById(id);
    }

    public List<Phone> getByName(String name) {
        return phoneRepository.findAllByName(name);
    }

    public List<Phone> getByOwner(String owner) {
        return phoneRepository.findAllByOwner(owner);
    }
}
