package com.kortisan.framework.entrypoints
/** * * * * * * * * *
 * Project KoreFrame
 * Created by Jacobo G Tamayo on 30/12/22.
* * * * * * * * * * **/

import com.kortisan.framework.redux.actions.NavigationActions

data class GoogleAssistantEntrypointStrategy(val exampleAttributeFlowNameFromPayload: String): EntrypointStrategy() {
    override fun getAction(): NavigationActions {
        TODO("Not yet implemented")
//        NavigationAction.navigateToTarget(
//            NavigationTarget.let {
//                it.genericTarget(
//                    it.flowNameAsActivityTarget.get(
//                        exampleAttributeFlowNameFromPayload
//                    )?.className ?: it.defaultTarget.activity.className
//                )
//            },
//            params = null
//        )
    }
}