package min.bo.shoppi.android.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import min.bo.shoppi.android.Banner
import min.bo.shoppi.android.model.Title
import min.bo.shoppi.android.repository.HomeRepository

class HomeViewModel(private val homeRepository: HomeRepository): ViewModel() {


    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title


    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners:LiveData<List<Banner>> = _topBanners



    init{
        loadHomeData()
    }

    private fun loadHomeData(){

    val homeData = homeRepository.getHomeData()
        homeData?.let{ homeData->
            _title.value = homeData.title
            _topBanners.value = homeData.topBanners

        }
    }
}