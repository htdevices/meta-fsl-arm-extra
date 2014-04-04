# Copyright (C) 2014 High Technology Devices LLC
# Released under the MIT license (see COPYING.MIT for the terms)
require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"
COMPATIBLE_MACHINE = "(imx6qjupiter)"

PROVIDES = "u-boot"

SRCREV = "${AUTOREV}"
SRCBRANCH = "imx_v2009.08_3.0.35_4.1.0-next"
SRC_URI = "git://github.com/htdevices/uboot-imx.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'HOSTSTRIP=true'
PACKAGE_ARCH = "${MACHINE_ARCH}"
