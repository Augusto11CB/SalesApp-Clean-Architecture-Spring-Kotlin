package clean.archt.spring.studies.sales.app.usecase.sale.query.impl

import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel
import clean.archt.spring.studies.sales.app.usecase.sale.gateway.SaleDataBaseService
import clean.archt.spring.studies.sales.app.usecase.sale.query.GetSaleDetailQuery
import clean.archt.spring.studies.sales.app.usecase.sale.toModel

class GetSaleDetailQueryImpl(private val saleDataBaseService: SaleDataBaseService) : GetSaleDetailQuery {

    override fun execute(idSale: Long): SaleModel {
        return saleDataBaseService.findSaleById(idSale).toModel()
    }
}