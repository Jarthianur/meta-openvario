#Angstrom bootstrap image
#require console-base-image.bb
require ov-base-image.bb

DEPENDS += "packagegroup-base-extended \
	   "

IMAGE_ROOTFS_SIZE = "3768320"

IMAGE_FEATURES += "debug-tweaks"

IMAGE_INSTALL += "\
	xcsoar-devel \
	xcsoar-profiles \
	xcsoar-menu \
	xcsoar-maps-default \
	variod \
	sensord-testing \
	dhcp-client \
	ovmenu-ng \
	lk8000 \
	ovmenu-ng-lk8000 \
	"

export IMAGE_BASENAME = "ov-image-testing"
