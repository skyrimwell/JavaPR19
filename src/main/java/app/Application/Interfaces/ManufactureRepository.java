package app.Application.Interfaces;

import app.Application.Classes.Manufacture;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("ManufactureRepository")
public interface ManufactureRepository extends JpaRepository<Manufacture,Long> {
    List<Manufacture> findAllByAddress(String address);
    List<Manufacture> findAllByAddressAndName(String address, String name);
    List<Manufacture> findAllByName(String name);
    Manufacture findById(UUID id);
    @NotNull List<Manufacture> findAll();
    void deleteById(UUID id);
}