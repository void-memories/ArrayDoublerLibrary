//
// Created by Naman Anand on 18/03/23.
//
#include <jni.h>
#include <string>

#ifndef NIMBLEEDGE_DEMO_DOUBLEARRAY_H
#define NIMBLEEDGE_DEMO_DOUBLEARRAY_H

extern "C" JNIEXPORT jfloatArray JNICALL
Java_com_voidmemories_doublearray_ArrayDoublerImpl_doubleThisArrayNative(
        JNIEnv *env,
        jobject instance, jfloatArray array);

#endif //NIMBLEEDGE_DEMO_DOUBLEARRAY_H
