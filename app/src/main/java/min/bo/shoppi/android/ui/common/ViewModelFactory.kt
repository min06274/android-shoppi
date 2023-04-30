package min.bo.shoppi.android.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import min.bo.shoppi.android.AssetLoader
import min.bo.shoppi.android.repository.HomeAssetDataSource
import min.bo.shoppi.android.repository.HomeRepository
import min.bo.shoppi.android.ui.home.HomeViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val context: Context):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {

        val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
        return HomeViewModel(repository) as T
        }else{
            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
    }

    }
}