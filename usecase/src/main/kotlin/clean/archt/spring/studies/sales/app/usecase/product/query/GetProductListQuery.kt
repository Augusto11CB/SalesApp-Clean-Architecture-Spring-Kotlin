package clean.archt.spring.studies.sales.app.usecase.product.query

import clean.archt.spring.studies.sales.app.usecase.product.ProductModel

interface GetProductListQuery {

    fun execute(): List<ProductModel>
}