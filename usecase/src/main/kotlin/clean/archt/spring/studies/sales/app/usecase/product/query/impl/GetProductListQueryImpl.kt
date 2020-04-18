package clean.archt.spring.studies.sales.app.usecase.product.query.impl

import clean.archt.spring.studies.sales.app.usecase.product.query.GetProductListQuery
import clean.archt.spring.studies.sales.app.usecase.product.ProductModel
import clean.archt.spring.studies.sales.app.usecase.product.gateway.ProductDataBaseService
import clean.archt.spring.studies.sales.app.usecase.product.toModel

class GetProductListQueryImpl(private val productDataBaseService: ProductDataBaseService) : GetProductListQuery {

    override fun execute(): List<ProductModel> {
        return productDataBaseService.findAll().map { it.toModel() }.toList()
    }

}