package chandu0101.scalajs.react.components
package materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

/**
 * This file is generated - submit issues instead of PR against it
 */
    
case class MuiAppCanvas(
  key:      js.UndefOr[String]    = js.undefined,
  ref:      js.UndefOr[String]    = js.undefined){

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiAppCanvas](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.AppCanvas)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
