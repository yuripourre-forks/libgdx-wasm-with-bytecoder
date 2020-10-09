package ext

import de.mirkosertic.bytecoder.api.OpaqueReferenceType
import java.nio.Buffer


interface WebGLRenderingContext : OpaqueReferenceType {

    fun clear(mask: Int)

    fun clearColor(red: Float, blue: Float, green: Float, alpha: Float)

    fun uniform3i(location: Int, x: Int, y: Int, z: Int)
    fun vertexAttribPointer(indx: Int, size: Int, type: Int, normalized: Boolean, stride: Int, ptr: Buffer?)
    fun vertexAttribPointer(indx: Int, size: Int, type: Int, normalized: Boolean, stride: Int, ptr: Int)

}

