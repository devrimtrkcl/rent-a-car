package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
 return  brandService.getAll();
    }

    @GetMapping("/{id}")
    public Brand getById(@PathVariable int id){
        return brandService.getById(id);
    }

    @PutMapping("/{id}")
    public Brand update(@PathVariable int id, @RequestBody Brand brand){
        return brandService.update(id,brand);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        brandService.delete(id);
    }


}
