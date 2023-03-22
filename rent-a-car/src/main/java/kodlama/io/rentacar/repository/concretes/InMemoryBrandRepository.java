package kodlama.io.rentacar.repository.concretes;

import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository(){
        brands=new ArrayList<>();
        brands.add(new Brand(1,"Mercedea"));
        brands.add(new Brand(1,"Auodi"));
        brands.add(new Brand(1,"Bmw"));
        brands.add(new Brand(1,"Reanult"));

    }
    @Override
    public List<Brand> getAll() {
        return brands;
    }

    @Override
    public Brand getById(int id) {
        for(Brand brand:brands){
            if(brand.getId()==id){
                return brand;
            }
            else{
                throw new RuntimeException("Brand is not found...");

            }
        }
        return null;
    }

    @Override
    public Brand add(Brand brand) {
         brands.add(brand);
         return brand;
    }

    @Override
    public Brand ubdate(int id, Brand brand) {
        brands.set(id,brand);
        return brand;
    }

    @Override
    public void delete(int id) {
      brands.remove(id);
    }
}
