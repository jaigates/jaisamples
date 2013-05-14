package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2013-05-14T12:35:59.608+05:30
 * Generated source version: 2.7.1
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "TempConvertSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TempConvertSoap {

    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FahrenheitToCelsius")
    @WebMethod(operationName = "FahrenheitToCelsius", action = "http://tempuri.org/FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FahrenheitToCelsiusResponse")
    public java.lang.String fahrenheitToCelsius(
        @WebParam(name = "Fahrenheit", targetNamespace = "http://tempuri.org/")
        java.lang.String fahrenheit
    );

    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CelsiusToFahrenheit")
    @WebMethod(operationName = "CelsiusToFahrenheit", action = "http://tempuri.org/CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CelsiusToFahrenheitResponse")
    public java.lang.String celsiusToFahrenheit(
        @WebParam(name = "Celsius", targetNamespace = "http://tempuri.org/")
        java.lang.String celsius
    );
}
