/*
 * myjni.cpp
 *
 *  Created on: Jan 9, 2013
 *      Author: ubuntu
 */

#include "nqueen.h"
#include "myjni.h"
#include <android/log.h>

JNIEXPORT jint JNICALL Java_com_acelan_nqueen_MainActivity_nQueenCount
	(JNIEnv *env, jclass obj, jint  n)
{
	__android_log_print(ANDROID_LOG_INFO, __FILE__, "log test");
	return (jint)nQueenCount((int)n);

}


