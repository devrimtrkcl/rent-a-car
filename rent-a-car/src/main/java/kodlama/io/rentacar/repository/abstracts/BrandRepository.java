package kodlama.io.rentacar.repository.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository   {
    List<Brand> getAll();
    Brand getById(int id);
    Brand add(Brand brand);
    Brand ubdate(int id,Brand brand);
    void delete(int id);

}
