package com.jetbrains.demo

import com.jetbrains.demo.utils.CancelWholeOrderOperation


enum class ORDER_TYPE {MONTHLY, YEARLY}
enum class PROCESS_TYPE {RECURRENT, CANCEL, ONETIME, UNKNOWN}

sealed class Order
class Subscription(val name: String, val type: ORDER_TYPE, val total: Int) : Order()
class Onetime(val name: String, val total: Int) : Order()
class Cancellation(val id: String) : Order()

fun processOrder(o: Order): PROCESS_TYPE {
    if(o is Cancellation) {
        CancelWholeOrderOperation()
        return PROCESS_TYPE.CANCEL
    }

    return when (o) {
        is Subscription -> PROCESS_TYPE.RECURRENT
        is Onetime -> PROCESS_TYPE.ONETIME
//        is Cancellation -> PROCESS_TYPE.CANCEL
//        else -> PROCESS_TYPE.UNKNOWN
    }
}