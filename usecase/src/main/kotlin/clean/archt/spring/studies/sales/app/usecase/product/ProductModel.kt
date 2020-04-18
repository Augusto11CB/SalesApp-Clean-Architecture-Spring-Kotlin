package clean.archt.spring.studies.sales.app.usecase.product

import clean.archt.spring.studies.sales.app.entity.domain.Product

data class ProductModel(
        val id: Long,
        val name: String,
        val unitPrice: Double
)

fun Product.toModel(): ProductModel {
    return ProductModel(id, name, price)
}

fun List<Product>.toModel(): List<ProductModel> {
    return map { it.toModel() }
}