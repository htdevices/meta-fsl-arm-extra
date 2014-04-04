# Copyright (C) 2014 Adrian Alonso <aalonso@htdevices.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "HTD iMX6Q Jupiter maintained based Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DEPENDS += "lzop-native"
PROVIDES = "virtual/kernel"

include recipes-kernel/linux/linux-imx.inc

PR = "${INC_PR}.0"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-4.1.0+yocto"
SRCBRANCH = "imx_3.0.35_4.1.0-next"

SRC_URI = "git://github.com/htdevices/linux-2.6-imx.git;branch=${SRCBRANCH} \
           file://defconfig"

COMPATIBLE_MACHINE = "(imx6qjupiter)"

