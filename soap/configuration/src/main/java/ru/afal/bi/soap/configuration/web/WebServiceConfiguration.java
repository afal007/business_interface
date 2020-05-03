package ru.afal.bi.soap.configuration.web;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {

  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(applicationContext);
    servlet.setTransformWsdlLocations(true);
    servlet.setEnableLoggingRequestDetails(true);
    return new ServletRegistrationBean<>(servlet, "/bankWS/*");
  }

  @Bean(name = "banks")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema bankSchema) {
    DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
    defaultWsdl11Definition.setSchema(bankSchema);
    defaultWsdl11Definition.setServiceName("bankWS");
    defaultWsdl11Definition.setLocationUri("/bankWS");
    defaultWsdl11Definition.setPortTypeName("bankWSPortType");
    defaultWsdl11Definition.setTargetNamespace("bankWS-namespace");
    return defaultWsdl11Definition;
  }

  public SimpleWsdl11Definition simpleWsdl11Definition() {
    SimpleWsdl11Definition simpleWsdl11Definition = new SimpleWsdl11Definition();
    simpleWsdl11Definition.setWsdl(new ClassPathResource("bankWS.wsdl"));
    return simpleWsdl11Definition;
  }

  @Bean
  public XsdSchema bankSchema() {
    return new SimpleXsdSchema(new ClassPathResource("bankWS.xsd"));
  }
}
