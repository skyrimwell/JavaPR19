package app.Application.Interfaces;

import app.Application.Classes.Phone;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("PhoneRepository")
public interface PhoneRepository extends JpaRepository<Phone,Long> {
    List<Phone> findAllByName(String name);
    List<Phone> findAllByOwner(String owner);

    @NotNull List<Phone> findAll();
    void deleteById(UUID id);
}
