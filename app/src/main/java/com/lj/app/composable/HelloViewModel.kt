package com.lj.app.composable

import androidx.lifecycle.ViewModel
import com.lj.domain.usecase.HelloUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * View model to get a text using [HelloUseCase].
 */
@HiltViewModel
class HelloViewModel @Inject constructor(private val useCase: HelloUseCase): ViewModel() {
    fun getText() = useCase.invoke("Jeremy")
}
