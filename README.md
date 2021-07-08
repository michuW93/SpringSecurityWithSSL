# SpringSecurityWithSSL
https for login.html, http for rest 

In tomcat in server.xml file:
`
<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
   maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
   clientAuth="false" sslProtocol="TLS"
   keystoreFile="C:\Users\michu\.keystore" keystorePass="changeit" />
   `
   
   to run spring boot:
   
   mvn clean install
   mvn spring-boot:run


https://www.baeldung.com/spring-channel-security-https
