# SpringSecurityWithSSL

In tomcat in server.xml file:
```xml
<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
   maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
   clientAuth="false" sslProtocol="TLS"
   keystoreFile="C:\Users\michu\.keystore" keystorePass="changeit" />
   
   <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000" proxyName="localhost" proxyPort="8443" scheme="https" secure="true"/>
   ```


https://www.baeldung.com/spring-channel-security-https

https://serverfault.com/questions/742922/configure-tomcat-behind-reverseproxy
