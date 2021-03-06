package eu.antoninkriz.krizici.utils

object Consts {
    /**
     * Server timeout in milliseconds
     */
    const val SERVER_TIMEOUT: Int = 10000

    /**
     * URL pointing to the 'supl' website
     */
    const val URL_SUPL: String = "https://nastenka.skolakrizik.cz"

    /**
     * URL pointing to blank page
     */
    const val URL_BLANK: String = "about:blank"

    /**
     * Template of URL pointing to the JSON files
     */
    const val URL_SERVER_JSON: String = "https://krizici.antoninkriz.eu/api/data/%s"
    // const val URL_SERVER_JSON: String = "http://192.168.1.2:5000/api/data/%s"

    /**
     * Template of URL pointing to specific image
     */
    val URL_SERVER_IMG: (String) -> String = { input -> "$input/%s" }

    enum class TABS(val value: String) {
        CLASSES("tridy"),
        TEACHERS("ucitele"),
        CLASSROOMS("ucebny")
    }
}