@java -cp "%~dp0..\lib\h2.jar;%CLASSPATH%" org.h2.tools.Server -tcp -web -baseDir "%~dp0..\db"
@if errorlevel 1 pause


##### command line syntax follows #####
#
# java org.h2.tools.Server [options]
# By default, -tcp, -web, -browser and -odbc are started
#
# -tcp (start the TCP Server)
# -tcpPort <port> (default: 9092)
# -tcpSSL [true|false]
# -tcpAllowOthers [true|false]
# -tcpPassword {password} (the password for shutting down a TCP Server)
# -tcpShutdown {url} (shutdown the TCP Server, URL example: tcp://localhost:9094)
# -tcpShutdownForce [true|false] (don't wait for other connections to close)
# -web (start the Web Server)
# -webPort <port> (default: 8082)
# -webSSL [true|false}
# -webAllowOthers [true|false}
# -browser (start a browser)
# -odbc (start the ODBC Server)
# -odbcPort <port> (default: 9083)
# -odbcAllowOthers [true|false]
# -ftp (start the FTP Server)
# -ftpPort <port> (default: 8021)
# -ftpDir <directory> (default: ftp, use jdbc:... to access a database)
# -ftpRead <readUserName> (default: guest)
# -ftpWrite <writeUserName> (default: sa)
# -ftpWritePassword <password> (default: sa)
# -log [true|false]
# -baseDir <directory>
# -ifExists [true|false] (only existing databases may be opened)
