<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>API Dummy activation on sharia web</name>
   <tag></tag>
   <elementGuidId>4c74e792-1213-4e61-b4d1-054c27d487f5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;lead_id\&quot;: \&quot;${lead_id}\&quot;,\n  \&quot;customer_id\&quot;: \&quot;${customer_id}\&quot;,\n  \&quot;customer_id_sharia\&quot;: \&quot;${customer_id_sharia}\&quot;,\n  \&quot;activation_status\&quot;: \&quot;${activation_status}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://172.16.5.104:6002/api/v1/Leads/Update_Activation_Status_Syariah</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'20200722690L000901'</defaultValue>
      <description></description>
      <id>418b322a-82cb-4419-b930-b77f579810b0</id>
      <masked>false</masked>
      <name>lead_id</name>
   </variables>
   <variables>
      <defaultValue>'00722690L000901'</defaultValue>
      <description></description>
      <id>30626c34-0fa2-498b-98f4-496924c0a493</id>
      <masked>false</masked>
      <name>customer_id</name>
   </variables>
   <variables>
      <defaultValue>'C00722690L000901'</defaultValue>
      <description></description>
      <id>6568f529-96f9-42b0-94ca-ccc5662825e4</id>
      <masked>false</masked>
      <name>customer_id_sharia</name>
   </variables>
   <variables>
      <defaultValue>'Actived'</defaultValue>
      <description></description>
      <id>631b0516-380e-4f25-8058-a10e0e8ac5fd</id>
      <masked>false</masked>
      <name>activation_status</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
