package com.Emazon.stock_service.Domain.SPI;

import com.Emazon.stock_service.Domain.Model.Brand;
import com.Emazon.stock_service.Domain.Model.PageCustom;
import com.Emazon.stock_service.Domain.Model.Pagination;

import java.util.List;

public interface IBrandPersistencePort {
    void saveBrand(Brand brand);
    Brand getBrand(Long id);
    List<Brand> getAllBrands();
    void updateBrand(Brand brand);
    void deleteBrand(Long id);
    PageCustom<Brand> getBrands(Pagination pagination);
}
