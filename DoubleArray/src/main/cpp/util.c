//
// Created by Naman Anand on 19/03/23.
//

#include "util.h"

float *double_array(float arr[], int size) {

    for (int i = 0; i < size; i++) {
        arr[i] *= 2;
    }

    return arr;
}
