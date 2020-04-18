package clean.archt.spring.studies.sales.app.usecase.product.gateway

import clean.archt.spring.studies.sales.app.entity.domain.Product

interface ProductDataBaseService {

    fun findAll(): List<Product>

    fun findById(id: Long): Product?

}
