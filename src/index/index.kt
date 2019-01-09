package index

import app.*
import kotlinext.js.*
import kotlinx.css.CSSBuilder
import kotlinx.css.body
import react.dom.*
import styled.StyledComponents
import kotlin.browser.*

val styles = CSSBuilder().apply {
    body {
        put("primaryColor", "#456789")
        put("primary", "#456789")
    }
}


fun main(args: Array<String>) {
    StyledComponents.injectGlobal(styles.toString())

    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
    }


}
