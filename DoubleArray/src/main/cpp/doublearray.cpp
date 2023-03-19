#include "doublearray.h"

extern "C" JNIEXPORT jfloatArray JNICALL
Java_com_voidmemories_doublearray_ArrayDoublerImpl_doubleThisArrayNative(
        JNIEnv *env,
        jobject instance, jfloatArray array) {

    jsize len = env->GetArrayLength(array);
    jfloatArray result = env->NewFloatArray(len);
    jfloat *arrOut = env->GetFloatArrayElements(array, nullptr);

    for (jint i = 0; i < len; i++) {
        arrOut[i] *= 2;
    }

    env->SetFloatArrayRegion(result, 0, len, arrOut);
    env->ReleaseFloatArrayElements(array, arrOut, 0);

    return result;
}