package io.legado.app.utils

/**
 * 将毫秒值格式化为时长字符串。
 * - 不足1小时：`mm:ss`（如 `24:25`）
 * - 1小时及以上：`H:mm:ss`（如 `1:24:25`）
 */
fun Long.millisToDuration(): String {
    val totalSeconds = this / 1000
    val h = totalSeconds / 3600
    val m = (totalSeconds % 3600) / 60
    val s = totalSeconds % 60
    return if (h > 0) {
        String.format("%d:%02d:%02d", h, m, s)
    } else {
        String.format("%d:%02d", m, s)
    }
}
