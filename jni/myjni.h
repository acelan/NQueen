/*
 * myjni.h
 *
 *  Created on: Jan 9, 2013
 *      Author: ubuntu
 */

#include <jni.h>

#ifndef _MYJNI_H_
#define _MYJNI_H_

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_com_acelan_nqueen_MainActivity_nQueenCount
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif

#endif /* _MYJNI_H_ */
