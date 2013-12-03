# Makefile
# small makefile so I don't have to constantly type stuff out
#
# author: mikeyhc <mikeyhc@atmosia.net>

JAVAC	 = javac -cp $(CLASSPATH) -d $(BUILD_DIR) -s $(SRC_DIR) -sourcepath \
	   $(SRC_DIR)
MKDIR	:= mkdir -p
PRINTF	:= printf
CHMOD	:= chmod
RM	:= rm -rf

BUILD_DIR 	:= build
CLASSPATH	:= $(BUILD_DIR)
SRC_DIR		:= src
VPATH		:= $(BUILD_DIR) $(SRC_DIR) $(BUILD_DIR)/main

QUIET	:= @

RUN_FILE	:= run_sebbengame.sh

all: Main.class
Main.class: main/Main.java
	$(QUIET) $(MKDIR) $(BUILD_DIR)
	$(JAVAC) $^
	$(QUIET)$(PRINTF) "#!/bin/sh\n\njava -cp $(BUILD_DIR) main.Main" \
	    > $(RUN_FILE)
	$(QUIET)$(CHMOD) +x $(RUN_FILE)

clean:
	$(RM) $(BUILD_DIR)
	$(RM) $(RUN_FILE)
