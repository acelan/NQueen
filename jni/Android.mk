LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := nqueen
LOCAL_SRC_FILES := nqueen.cpp myjni.cpp
APP_STL := stlport_static
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
