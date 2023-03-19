#include "util.h"

extern "C"
JNIEXPORT jfloatArray JNICALL
Java_com_voidmemories_doublearray_ArrayDoublerImpl_doubleThisArrayNative(
        JNIEnv *env,
        jobject instance, jfloatArray array) {

    jsize size = env->GetArrayLength(array);
    jfloat *float_array = env->GetFloatArrayElements(array, nullptr);

    jfloat *doubled_float_array = double_array(float_array, size);

    env->ReleaseFloatArrayElements(array, doubled_float_array, 0);

    return array;
}