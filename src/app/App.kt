package app

import auth.Login
import com.ccfraser.muirwik.wrapper.*
import com.ccfraser.muirwik.wrapper.styles.PaletteColor
import com.ccfraser.muirwik.wrapper.styles.Theme
import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlinx.css.Color
import react.*
import react.dom.*
import logo.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch
import ticker.*

class App : RComponent<RProps, RState>() {

    init {
        createMuiThemeFunction {
            js {
                palette = Map(primary to red)
            }
        }
    }

    override fun RBuilder.render() {


        browserRouter {
            switch {
                route("/login", Login::class)
                route("/loginn", Login::class)
            }
        }

//        div("App-header") {
//            logo()
//            h2 {
//                +"Welcome to React with Kotlin"
//            }
//        }
//        p("App-intro") {
//            +"To get started, edit "
//            code { +"app/App.kt" }
//            +" and save to reload."
//        }
//        p("App-ticker") {
//            ticker()
//        }
    }
}

fun RBuilder.app() = child(App::class) {}
