import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.start(7000)
    app.port(herokuPort)
    app.get("/") { ctx -> ctx.result("Hello World") }
}

val herokuPort = ProcessBuilder().environment()["PORT"]?.toInt() ?: 7000
