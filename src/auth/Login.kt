package auth

import com.ccfraser.muirwik.wrapper.*
import com.ccfraser.muirwik.wrapper.styles.ThemeOptions
import kotlinx.css.Color
import kotlinx.css.div
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import styled.css

class Login : RComponent<RProps, RState>() {
    override fun RBuilder.render() {

//        currentTheme = createMuiThemeFunction(js("({palette: { type: 'light', }})"))
        currentTheme.palette.primary.light = Colors.Red.shade600.toString()
        currentTheme.palette.primary.dark = Colors.Red.shade600.toString()
        currentTheme.palette.primary.main = Colors.Red.shade600.toString()
        currentTheme.palette.primary.contrastText = Colors.Red.shade600.toString()
//        currentTheme.palette.primary.light = Colors.Red.shade200.toString()

        mAppBar(position = MAppBarPosition.static) {
            mToolbar {
                mIconButton("menuButton", color = MColor.inherit)
                mToolbarTitle("Skill Me !!!")
                mIconButton(color = MColor.inherit)
                mTabs(0, scrollable = true, textColor = MTabTextColor.primary){
                    mTab("Market")
                    mTab("My Trades")
                    mTab("My Funds")
                    mTab("Login")
                    mTab("Register")

                }


                css {
//                    backgroundColor = Color.green
                }
//                mButton("Market", color = MColor.inherit)
//                mButton("My Trades", color = MColor.inherit)
//                mButton("My Funds", color = MColor.inherit)
//                mButton("Login", color = MColor.inherit)
//                mButton("Register", color = MColor.inherit)
            }



        }

        mDivider {
            + "salam"
        }

    }

}