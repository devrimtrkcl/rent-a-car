package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
    if(brandRepository.getAll().size()==0){
        throw new RuntimeException("Hatalıdır.");
    }
    return brandRepository.getAll();
    }

    @Override
    public Brand getById(int id) {
         return brandRepository.getById(id);
            }

    @Override
    public Brand save(Brand brand) {
        return brandRepository.add(brand);
    }

    @Override
    public Brand update(int id, Brand brand) {
        return brandRepository.ubdate(id,brand);
    }

    @Override
    public void delete(int id) {
        brandRepository.delete(id);
    }
}
