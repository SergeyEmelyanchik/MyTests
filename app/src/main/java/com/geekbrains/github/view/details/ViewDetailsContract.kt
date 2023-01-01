package com.geekbrains.github.view.details

import com.geekbrains.github.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}
