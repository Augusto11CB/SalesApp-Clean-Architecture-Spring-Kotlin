package clean.archt.spring.studies.sales.app.usecase.sale.query

import clean.archt.spring.studies.sales.app.usecase.sale.SaleModel

interface GetSalesListQuery {


    fun execute():List<SaleModel>

}