package clean.archt.spring.studies.sales.app.usecase.sale.query.impl

import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel
import clean.archt.spring.studies.sales.app.usecase.sale.gateway.SaleDataBaseService
import clean.archt.spring.studies.sales.app.usecase.sale.query.GetSalesListQuery
import clean.archt.spring.studies.sales.app.usecase.sale.toModel

class GetSalesListQueryImpl(private val saleDataBaseService: SaleDataBaseService) : GetSalesListQuery {


    override fun execute(): List<SaleModel> {

        return saleDataBaseService.findAll().toModel()
    }

}