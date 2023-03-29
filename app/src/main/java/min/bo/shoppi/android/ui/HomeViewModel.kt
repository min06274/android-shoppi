package min.bo.shoppi.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import min.bo.shoppi.android.Banner
import min.bo.shoppi.android.Title

class HomeViewModel: ViewModel() {


    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title


    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners:LiveData<List<Banner>> = _topBanners

    fun loadHomeData(){
        // TODO Data Layer - Repository에 요청
    }
}