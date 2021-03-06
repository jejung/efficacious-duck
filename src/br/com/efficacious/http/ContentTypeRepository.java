/**
 * 
 */
package br.com.efficacious.http;

/**
 * @author Jean Jung
 *
 */
public interface ContentTypeRepository {
	final String GP = "video/3gpp";
	final String GP2 = "video/3gpp2";
	final String GPP_MSEC = "application/vnd.mseq";
	final String GPP_LARGE = "application/vnd.3gpp.pic-bw-large";
	final String GPP_SMALL = "application/vnd.3gpp.pic-bw-small";
	final String GPP_VAR = "application/vnd.3gpp.pic-bw-var";
	final String GPP_TCAP = "application/vnd.3gpp2.tcap";
	final String ZIP = "application/x-7z-compressed";
	final String ABIWORD = "application/x-abiword";
	final String ACE_ARCHIVE = "application/x-ace-compressed";
	final String ACC_COMPRESSION = "application/vnd.americandynamics.acc";
	final String ACU_COBOL = "application/vnd.acucobol";
	final String ACU_COBOL2 = "application/vnd.acucorp";
	final String ADCPM = "audio/adpcm";
	final String ADOBE_AUTHORWARE_BINARY = "application/x-authorware-bin";
	final String ADOBE_AUTHORWARE_MAP = "application/x-authorware-map";
	final String ADOBE_AUTHORWARE_SEGMENT_FILE = "application/x-authorware-seg";
	final String ADOBE_AIR_APPLICATION = "application/vnd.adobe.air-application-installer-package+zip";
	final String ADOBE_FLASH = "application/x-shockwave-flash";
	final String ADOBE_FLEX = "application/vnd.adobe.fxp";
	final String ADOBE_PDF = "application/pdf";
	final String ADOBE_POSTSCRIPT = "application/vnd.cups-ppd";
	final String ADOBE_SHOCKWAVE_PLAYER = "application/x-director";
	final String ADOBE_XML_DATA_PACKAGE = "application/vnd.adobe.xdp+xml";
	final String ADOBE_XML_FORMS_DATA = "application/vnd.adobe.xfdf";
	final String AAC = "audio/x-aac";
	final String ADOBE_AHEAD_AIR_APPLICATION = "application/vnd.ahead.space";
	final String AIRZIP_FILE = "application/vnd.airzip.filesecure.azf";
	final String AIRZIP_FILE_SECURE = "application/vnd.airzip.filesecure.azs";
	final String AMAZON_KINDLE_EBOOK = "application/vnd.amazon.ebook";
	final String AMIGA_DE = "application/vnd.amiga.ami";
	final String ANDROID_PACKAGE_ARCHIVE = "application/vnd.android.package-archive";
	final String ANTIX_GAME_PLAYER = "application/vnd.antix.game-component";
	final String APPLIXWARE = "application/applixware";
	final String ARCHIPELAGO_LESSON = "application/vnd.hhe.lesson-player";
	final String ARISTA = "application/vnd.aristanetworks.swi";
	final String ASSEMBLER_SOURCE_FILE = "text/x-asm";
	final String AIFF = "audio/x-aiff";
	final String AVI = "video/x-msvideo";
	final String AUDIOGRAPH = "application/vnd.audiograph";
	final String ATUCAD_DXF = "image/vnd.dxf";
	final String AUTODESK_DWF = "model/vnd.dwf";
	final String BAS_PARTIUR = "text/plain-bas";
	final String BINARY_CPIO = "application/x-bcpio";
	final String BINARY_DATA = "application/octet-stream";
	final String BMP = "image/bmp";
	final String BITTORRENT = "application/x-bittorrent";
	final String BLACKBERRY_COD_FILE = "application/vnd.rim.cod";
	final String BMI_DRAWING = "application/vnd.bmi";
	final String BOURNE_SHELL_SCRIPT = "application/x-sh";
	final String BTIF = "image/prs.btif";
	final String BZIP_ARCHIVE = "application/x-bzip";
	final String BZIP2_ARCHIVE = "application/x-bzip2";
	final String C_SHELL_SCRIPT = "application/x-csh";
	final String C_SOURCE_FILE = "text/x-c";
	final String CHEMDRAW = "application/vnd.chemdraw+xml";
	final String CSS = "text/css";
	final String CHEMDRAW_EXCHANGE_FILE = "chemical/x-cdx";
	final String CML_FILE = "chemical/x-cml";
	final String CML_STYLE_FILE = "chemical/x-csml";
	final String CIM_DATABASE = "application/vnd.contact.cmsg";
	final String CDMI_CAPABILITY = "application/cdmi-capability";
	final String CDMI_CONTAINER = "application/cdmi-container";
	final String CDMI_DOMAIN = "application/cdmi-domain";
	final String CDMI_OBJECT = "application/cdmi-object";
	final String CDMI_QUEUE = "application/cdmi-queue";
	final String CMU_IMAGE = "image/x-cmu-raster";
	final String COLLADA = "model/vnd.collada+xml";
	final String CSV = "text/csv";
	final String COMPACT_PRO = "application/mac-compactpro";
	final String WMLC = "application/vnd.wap.wmlc";
	final String CGM = "image/cgm";
	final String COOLTALK = "x-conference/x-cooltalk";
	final String CMX = "image/x-cmx";
	final String CORELXARA = "application/vnd.xara";
	final String CPIO = "application/x-cpio";
	final String PERT_CHART_EXPERT = "application/vnd.criticaltools.wbs+xml";
	final String CIF = "chemical/x-cif";
	final String CMDF = "chemical/x-cmdf";
	final String CU_SEEME = "application/cu-seeme";
	final String CU_WRITER = "application/prs.cww";
	final String CURL_APPLET = "text/vnd.curl";
	final String CURL_DETACHED_APPLET = "text/vnd.curl.dcurl";
	final String CURL_MANIFEST_FILE = "text/vnd.curl.mcurl";
	final String CURL_SOURCE_CODE = "text/vnd.curl.scurl";
	final String CURL_CAR_APPLET = "application/vnd.curl.car";
	final String CURL_P_APPLET = "application/vnd.curl.pcurl";
	final String CUSTOM_MENU = "application/vnd.yellowriver-custom-menu";
	final String DSSC_DER = "application/dssc+der";
	final String DSSC_XML = "application/dssc+xml";
	final String DEBIAN_PACKAGE = "application/x-debian-package";
	final String DECE_AUDIO = "audio/vnd.dece.audio";
	final String DECE_GRAPHIC = "image/vnd.dece.graphic"; 
	final String DECE_HD_VIDEO = "video/vnd.dece.hd";
	final String DECE_MOBILE_VIDEO = "video/vnd.dece.mobile"; 
	final String DECE_MP4 = "video/vnd.uvvu.mp4";
	final String DECE_PD_VIDEO = "video/vnd.dece.pd";
	final String DECE_SD_VIDEO = "video/vnd.dece.sd";
	final String DECE_VIDEO = "video/vnd.dece.video";
	final String DVI = "application/x-dvi";
	final String DSN_SEED_FILES = "application/vnd.fdsn.seed";
	final String DTB = "application/x-dtbook+xml"; 
	final String DTB_RESOURCE = "application/x-dtbresource+xml";
	final String DVB = "application/vnd.dvb.ait";
	final String DVB_SERVICE = "application/vnd.dvb.ait";
	final String DWM = "audio/vnd.digital-winds";
	final String DJVU = "image/vnd.djvu";
	final String DTD = "application/xml-dtd";
	final String DOLBY_MERIDIAN_LOSSES_PACKAGE = "application/vnd.dolby.mlp";
	final String DPGRAPH = "application/vnd.dpgraph";
	final String DRA_AUDIO = "audio/vnd.dra";
	final String DTS_AUDIO = "audio/vnd.dts";
	final String DTS_AUDIO_HD = "audio/vnd.dts.hd";
	final String DWG_DRAWING = "image/vnd.dwg";
	final String DYNAGEO = "application/vnd.dynageo";
	final String ECMA_SCRIPT = "application/ecmascript";
	final String ECOWIN_CHART = "application/vnd.ecowin.chart";
	final String EDMICS_2000_MMR = "image/vnd.fujixerox.edmics-mmr";
	final String EDMICS_2000_RLC = "image/vnd.fujixerox.edmics-rlc";
	final String EXI = "application/exi"; 
	final String EFI_PROTEUS = "application/vnd.proteus.magazine";
	final String ELETRONIC_PUBLICATION = "application/epub+zip";
	final String EMAIL_MESSAGE = "message/rfc822";
	final String ENLIVEN_VIEWER = "application/vnd.enliven";
	final String INFOSEEK_EXPRESS = "application/vnd.is-xpr";
	final String XIFF = "image/vnd.xiff";
	final String XFDL = "application/vnd.xfdl";
	final String EMMA_XML = "application/emma+xml";
	final String EZPIX_SECURE_PHOTO_ALBUM = "application/vnd.ezpix-album";
	final String EZPIX_SECURE_PHOTO_PACKAGE = "application/vnd.ezpix-package";
	final String FST = "image/vnd.fst";
	final String FVT = "image/vnd.fvt";
	final String FLASH4_VIDEO = "video/x-f4v";
	final String FLASH_VIDEO = "video/x-flv";
	final String FLASH_PIX = "image/vnd.fpx";
	final String FLASH_NET_PIX = "image/vnd.net-fpx";
	final String FLEXSTOR = "text/vnd.fmi.flexstor";
	final String FLI_FLC = "video/x-fli";
	final String FLUX_TIME_CLIP = "application/vnd.fluxtime.clip";
	final String FDF = "application/vnd.fdf";
	final String FORTRAN_SOURCE_FILE = "text/x-fortran";
	final String MIF = "application/vnd.mif";
	final String FRAME_MARKER = "application/vnd.framemaker";
	final String FREEHAND_MX = "image/x-freehand";
	final String FSC = "application/vnd.fsc.weblaunch";
	final String FROGRANS_FNC = "application/vnd.frogans.fnc";
	final String FROGRANS_LFT = "application/vnd.frogans.ltf";
	final String G3_FAX_IMAGE = "image/g3fax";
	final String GAMEMAKER_ACTIVEX = "application/vnd.gmx";
	final String GENTRIX_STUDIO = "model/vnd.gtw";
	final String GEOGEBRA_FILE = "application/vnd.geogebra.file";
	final String GEOGEBRA_TOOL = "application/vnd.geogebra.tool";
	final String GDL = "model/vnd.gdl";
	final String GEONEXT = "application/vnd.geonext";
	final String GEOPLAN = "application/vnd.geoplan";
	final String GEOSPACE = "application/vnd.geospace";
	final String GHOST_SCRIPT = "application/x-font-ghostscript";
	final String GLYPH_BITMAP = "application/x-font-bdf";
	final String GNU_TAR_FILES = "application/x-gtar";
	final String GNU_TEXTINFO = "application/x-texinfo";
	final String GNUMERIC = "application/x-gnumeric";
	final String GOOGLE_EARTH_KML = "application/vnd.google-earth.kml+xml";
	final String GOOGLE_EARTH_ZIP_KML = "application/vnd.google-earth.kmz";
	final String GRAFEQ = "application/vnd.grafeq";
	final String GIF = "image/gif"; 
	final String H261 = "video/h261";
	final String H263 = "video/h263";
	final String H264 = "video/h264";
	final String HP_HPID = "application/vnd.hp-hpid";
	final String HP_HPS = "application/vnd.hp-hps";
	final String HDF = "application/x-hdf";
	final String RIP = "audio/vnd.rip";
	final String HBCI = "application/vnd.hbci";
	final String HP_JLYT = "application/vnd.hp-jlyt";
	final String HP_PCL = "application/vnd.hp-pcl";
	final String HP_GL2_RTL = "application/vnd.hp-hpgl";
	final String HV_SCRIPT = "application/vnd.yamaha.hv-script";
	final String HV_VOICE_DICTIONARY = "application/vnd.yamaha.hv-dic";
	final String HV_VOICE_PARAMETER = "application/vnd.yamaha.hv-voice";
	final String HTML = "text/html";
	final String ICALENDAR = "text/calendar";
	final String ICON_IMAGE = "image/x-icon";
	final String IGLOADER = "application/vnd.igloader";
	final String IEF = "image/ief";
	final String IMS_NETWORKS = "application/reginfo+xml";
	final String IN3D_3DML = "text/vnd.in3d.3dml";
	final String IN3D_SPOT = "text/vnd.in3d.spot";
	final String IGES = "model/iges";
	final String IGES_INTERGEO = "application/vnd.intergeo";
	final String IGES_CINDERELLA = "application/vnd.cinderella"; 
	final String INTERCON_FORMNET = "application/vnd.intercon.formnet";
	final String ISAC = "application/vnd.isac.fcs";
	final String IPFIX = "application/ipfix";
	final String IOCOM_VISIMEET = "application/vnd.insors.igm";
	final String IP_UNPLUGGED_ROAMING_CLIENT = "application/vnd.ipunplugged.rcprofile";
	final String IDIRECTORY_PACKAGE = "application/vnd.irepository.package+xml";
	final String J2ME_APP_DESCRIPTOR = "text/vnd.sun.j2me.app-descriptor";
	final String JAVA_ARCHIVE = "application/java-archive";
	final String JAVA_BYTECODE = "application/java-vm";
	final String JAVA_JNLP = "application/x-java-jnlp-file";
	final String JAVA_SERIALIZED_OBJECT = "application/java-serialized-object";
	final String JAVA_SOURCE_FILE = "text/x-java-source.java";
	final String JSON = "application/json";
	final String JODA_ARCHIVE = "application/vnd.joost.joda-archive";
	final String JPM = "video/jpm";
	final String JPEG_IMAGE = "image/jpeg";
	final String JPG_VIDEO = "video/jpeg";
	final String KAHOOTZ = "application/vnd.kahootz";
	final String KARAOKE = "application/vnd.chipnuts.karaoke-mmd";
	final String KDE_KARBON = "application/vnd.kde.karbon";
	final String KDE_KCHART = "application/vnd.kde.kchart";
	final String KDE_KFORMULA = "application/vnd.kde.kformula";
	final String KDE_KIVIO = "application/vnd.kde.kivio";
	final String KDE_KONTOUR = "application/vnd.kde.kontour";
	final String KDE_KPRESENTER = "	application/vnd.kde.kpresenter";
	final String KDE_KSPREAD = "application/vnd.kde.kspread";
	final String KDE_KWORD = "application/vnd.kde.kword";
	final String KENAMEA_APP = "plication/vnd.kenameaapp";
	final String KIDSPIRATION = "application/vnd.kidspiration";
	final String KINAR = "application/vnd.kinar";
	final String KODAK_DESCRIPTOR = "application/vnd.kodak-descriptor";
	final String XLATEX = "application/x-latex";
	final String LIGTHSPEED_AUDIO_LAB = "application/vnd.jam";
	final String LUCENT_VOICE = "audio/vnd.lucent.voice";
	final String M3U = "audio/x-mpegurl";
	final String M4V = "video/x-m4v";
	final String MAC_BINHEX_40 = "application/mac-binhex40";
	final String MACPORTS = "application/vnd.macports.portpkg";
	final String MAP_GUIDE = "application/vnd.osgeo.mapguide.package"; 
	final String MARC = "application/marc";
	final String MARC_SCHEMA = "application/marcxml+xml";
	final String MXF = "application/mxf";
	final String MML = "application/mathml+xml";
	final String MBOX = "application/mbox";
	final String MEDCALC = "application/vnd.medcalcdata";
	final String MEDIA_SERVER_CONTROL = "application/mediaservercontrol+xml";
	final String MEDIA_REMOTE = "application/vnd.mediastation.cdkey";
	final String MEDICAL_WAVEFORM = "application/vnd.mfer";
	final String MFMP = "application/vnd.mfmp";
	final String MESH = "model/mesh"; 
	final String MADS = "application/mads+xml";
	final String METS = "application/mets+xml";
	final String MODS = "application/mods+xml";
	final String METALINK = "application/metalink4+xml";
	final String MS_PPTMET_FILE = "application/vnd.ms-powerpoint.template.macroenabled.12";
	final String MS_WRDDOC_MET_FILE = "application/vnd.ms-word.document.macroenabled.12";
	final String MS_WRD_TEMPLATE_MET_FILE = "application/vnd.ms-word.template.macroenabled.12";
	final String MICRO_CADAM = "application/vnd.mcd";
	final String ASF = "video/x-ms-asf";
	final String MIDI = "audio/midi";
	final String MS_DOC = "application/msword";
	final String FLY = "text/vnd.fly";
	final String MJ2 = "video/mj2";
	final String MPEG_AUDIO = "audio/mpeg";
	final String MPEG_VIDEO = "video/mpeg";
	final String OGG = "application/ogg";
	final String OGG_AUDIO = "audio/ogg";
	final String OGG_VIDEO = "video/ogg";
	final String WEBM_AUDIO = "audio/webm";
	final String WEBM_VIDEO = "video/webm";
	final String PNG = "image/png";
	final String RICHTEXT_RTX = "text/richtext";
	final String RICHTEXT_RTF = "application/rtf";
	final String SVG = "image/svg+xml";
	final String SGI = "video/x-sgi-movie";
	final String RGB = "image/x-rgb";
	final String WEBP_IMAGE = "image/webp";
	final String XML = "application/xml";
	final String YAML = "text/yaml";
}
