package min.bo.shoppi.android.repository

import min.bo.shoppi.android.model.HomeData

interface HomeDataSource {



    fun getHomeData(): HomeData?

}