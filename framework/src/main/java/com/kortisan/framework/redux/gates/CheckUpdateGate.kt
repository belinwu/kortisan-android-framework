package com.kortisan.framework.redux.gates

import com.kortisan.framework.redux.actions.ReduxAction
import com.kortisan.framework.redux.controllers.gates.BaseGate

/** * * * * * * * * *
 * Project KoreFrame
 * Created by Jacobo G Tamayo on 30/12/22.
* * * * * * * * * * **/

object CheckUpdateGate: BaseGate() {
    override val startAction: ReduxAction
        get() = TODO("Not yet implemented")
    override val onFailAction: ReduxAction
        get() = TODO("Not yet implemented")

    override fun enterInGate(startAction: ReduxAction): Boolean {
        return false
    }
}