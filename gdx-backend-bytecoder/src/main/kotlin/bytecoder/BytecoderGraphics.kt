package bytecoder

import com.badlogic.gdx.Graphics
import com.badlogic.gdx.graphics.Cursor
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.GL30
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.glutils.GLVersion

class BytecoderGraphics : Graphics {
    override fun isGL30Available(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getGL20(): GL20 {
        TODO("Not yet implemented")
    }

    override fun getGL30(): GL30 {
        TODO("Not yet implemented")
    }

    override fun setGL20(p0: GL20?) {
        TODO("Not yet implemented")
    }

    override fun setGL30(p0: GL30?) {
        TODO("Not yet implemented")
    }

    override fun getWidth(): Int {
        println("Call getWidth()")
        TODO("Not yet implemented")
    }

    override fun getHeight(): Int {
        println("getHeight()");
        TODO("Not yet implemented")
    }

    override fun getBackBufferWidth(): Int {
        TODO("Not yet implemented")
    }

    override fun getBackBufferHeight(): Int {
        TODO("Not yet implemented")
    }

    override fun getSafeInsetLeft(): Int {
        TODO("Not yet implemented")
    }

    override fun getSafeInsetTop(): Int {
        TODO("Not yet implemented")
    }

    override fun getSafeInsetBottom(): Int {
        TODO("Not yet implemented")
    }

    override fun getSafeInsetRight(): Int {
        TODO("Not yet implemented")
    }

    override fun getFrameId(): Long {
        TODO("Not yet implemented")
    }

    override fun getDeltaTime(): Float {
        TODO("Not yet implemented")
    }

    override fun getRawDeltaTime(): Float {
        TODO("Not yet implemented")
    }

    override fun getFramesPerSecond(): Int {
        TODO("Not yet implemented")
    }

    override fun getType(): Graphics.GraphicsType {
        TODO("Not yet implemented")
    }

    override fun getGLVersion(): GLVersion {
        TODO("Not yet implemented")
    }

    override fun getPpiX(): Float {
        TODO("Not yet implemented")
    }

    override fun getPpiY(): Float {
        TODO("Not yet implemented")
    }

    override fun getPpcX(): Float {
        TODO("Not yet implemented")
    }

    override fun getPpcY(): Float {
        TODO("Not yet implemented")
    }

    override fun getDensity(): Float {
        TODO("Not yet implemented")
    }

    override fun supportsDisplayModeChange(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getPrimaryMonitor(): Graphics.Monitor {
        TODO("Not yet implemented")
    }

    override fun getMonitor(): Graphics.Monitor {
        TODO("Not yet implemented")
    }

    override fun getMonitors(): Array<Graphics.Monitor> {
        TODO("Not yet implemented")
    }

    override fun getDisplayModes(): Array<Graphics.DisplayMode> {
        TODO("Not yet implemented")
    }

    override fun getDisplayModes(p0: Graphics.Monitor?): Array<Graphics.DisplayMode> {
        TODO("Not yet implemented")
    }

    override fun getDisplayMode(): Graphics.DisplayMode {
        TODO("Not yet implemented")
    }

    override fun getDisplayMode(p0: Graphics.Monitor?): Graphics.DisplayMode {
        TODO("Not yet implemented")
    }

    override fun setFullscreenMode(p0: Graphics.DisplayMode?): Boolean {
        TODO("Not yet implemented")
    }

    override fun setWindowedMode(p0: Int, p1: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun setTitle(p0: String?) {
        TODO("Not yet implemented")
    }

    override fun setUndecorated(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setResizable(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setVSync(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun getBufferFormat(): Graphics.BufferFormat {
        TODO("Not yet implemented")
    }

    override fun supportsExtension(p0: String?): Boolean {
        TODO("Not yet implemented")
    }

    override fun setContinuousRendering(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun isContinuousRendering(): Boolean {
        TODO("Not yet implemented")
    }

    override fun requestRendering() {
        TODO("Not yet implemented")
    }

    override fun isFullscreen(): Boolean {
        TODO("Not yet implemented")
    }

    override fun newCursor(p0: Pixmap?, p1: Int, p2: Int): Cursor {
        TODO("Not yet implemented")
    }

    override fun setCursor(p0: Cursor?) {
        TODO("Not yet implemented")
    }

    override fun setSystemCursor(p0: Cursor.SystemCursor?) {
        TODO("Not yet implemented")
    }

}
